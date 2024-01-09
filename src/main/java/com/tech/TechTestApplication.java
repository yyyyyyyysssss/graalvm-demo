package com.tech;

import com.tech.reflective.ReflectionExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Random;

@RestController
@SpringBootApplication
public class TechTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechTestApplication.class, args);
    }


    @RequestMapping("/")
    String home(String[] args) throws ReflectiveOperationException {
        if (args == null || args.length == 0){
            args = new String[]{"StringReverser","reverse","YanShuai"};
        }
        Object o = ReflectionExample.reflectionExample(args);
        byte[] bytes = new byte[4096];
        return "Hello Graalvm!  " + o + "-" + new String(bytes, StandardCharsets.UTF_8);
    }

}
