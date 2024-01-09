package com.tech.config;

import com.tech.reflective.StringCapitalizer;
import com.tech.reflective.StringReverser;
import org.springframework.aot.hint.MemberCategory;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;

/**
 * @Description
 * @Author ys
 * @Date 2024/1/5 9:47
 */
@Configuration(proxyBeanMethods = false)
@ImportRuntimeHints(TechRuntimeHintsConfig.class)
public class TechRuntimeHintsConfig implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
        //注册反射方法调用
        hints.reflection().registerType(StringCapitalizer.class, MemberCategory.values());
        hints.reflection().registerType(StringReverser.class, MemberCategory.values());

    }
}
