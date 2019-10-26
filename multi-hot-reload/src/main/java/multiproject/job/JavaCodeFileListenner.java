package multiproject.job;

import lombok.extern.slf4j.Slf4j;
import multiproject.classloader.ReloadClassLoader;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class JavaCodeFileListenner {

    private static ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private static Map<String, Long> fileMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            String property = System.getProperty("user.dir");
            // /Users/tt/code/multi-project
            log.info("user.dir: " + property);
            loopFile(new File[]{new File(property)});
        }, 1,1, TimeUnit.SECONDS);
    }

    public void loopFile(File[] file) {
        for (File f : file) {
            if (f.isDirectory()) {
                loopFile(f.listFiles());
                continue;
            }
            String name = f.getName();
            if (!StringUtils.hasText(name)) {
                continue;
            }
            if (name.endsWith(".class")) {
                long l = f.lastModified();
                Long aLong = fileMap.get(name);
                if (aLong == null) {
                    fileMap.put(name, aLong);
                } else {
                    if (l != aLong.longValue()) {
                        fileMap.put(name, l);
                        //name TODO fix
                        reload(name);
                    }
                }
            }
        }
    }

    public void reload(String name) {
        ReloadClassLoader reloadClassLoader = new ReloadClassLoader();
        try {
            reloadClassLoader.loadClass(name);
        } catch (ClassNotFoundException e) {
            log.error("class:{} ClassNotFoundException",name, e);
        }
    }

}
