package com.tech;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author ys
 * @Date 2023/12/26 16:28
 */
@Configuration
public class TechStarterAutoConfiguration {

    @Bean
    public TechService techService(){

        return new TechService();
    }

}
