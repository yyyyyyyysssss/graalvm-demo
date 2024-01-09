package com.tech.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author ys
 * @Date 2024/1/3 15:42
 */
@Component
@ConfigurationProperties(prefix = "tech.props")
public class TechProperties {

    private String name;

    //native image 不是内部类的嵌套配置属性必须用 进行注释@NestedConfigurationProperty，否则它们将不会被检测到并且不可绑定
    @NestedConfigurationProperty
    private final Nested nested = new Nested();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nested getNested() {
        return nested;
    }

    @Override
    public String toString() {
        return "TechProperties{" +
                "name='" + name + '\'' +
                ", nested=" + nested +
                '}';
    }
}
