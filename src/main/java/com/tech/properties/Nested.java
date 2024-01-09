package com.tech.properties;

/**
 * @Description
 * @Author ys
 * @Date 2024/1/3 15:47
 */
public class Nested {

    private String version;

    private String jdk;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getJdk() {
        return jdk;
    }

    public void setJdk(String jdk) {
        this.jdk = jdk;
    }

    @Override
    public String toString() {
        return "Nested{" +
                "version='" + version + '\'' +
                ", jdk='" + jdk + '\'' +
                '}';
    }
}
