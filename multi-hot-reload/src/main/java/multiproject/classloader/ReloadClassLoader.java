package multiproject.classloader;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class ReloadClassLoader extends ClassLoader {

    private ClassLoader extClassLoader;

    public ReloadClassLoader() {
        ClassLoader classLoader = String.class.getClassLoader();
        if (classLoader == null) {
            classLoader = getSystemClassLoader();
            while (classLoader.getParent() != null) {
                classLoader = classLoader.getParent();
            }
        }
        extClassLoader = classLoader;
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        Class<?> clazz = null;
        clazz = findLoadedClass(name);
        if (clazz != null) {
            return clazz;
        }

        ClassLoader classLoader = extClassLoader;
        clazz = classLoader.loadClass(name);
        if (clazz != null) {
            return clazz;
        }

        return findClass(name);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classData = loadClassData(name);
        return defineClass(name, classData, 0, classData.length);
    }

    private byte[] loadClassData(String name) {
        InputStream in =
            getClass().getClassLoader().getResourceAsStream(name.replace(".", "/") + ".class");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            int len = 0;
            while ((len = in.read()) != -1) {
                out.write(len);
            }
        } catch (IOException e) {
            log.error("", e);
        }
        return out.toByteArray();
    }
}
