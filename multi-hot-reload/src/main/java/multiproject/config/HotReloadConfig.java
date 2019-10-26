package multiproject.config;

import multiproject.job.JavaCodeFileListenner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HotReloadConfig{

    @Bean
    public JavaCodeFileListenner getListener() {
        return new JavaCodeFileListenner();
    }
}
