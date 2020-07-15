package com.yutianhao.sc.yutianhaoconsulconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author thyu
 * @title: MyConfig
 * @projectName yutianhao-consul-parent
 * @description: TODO
 * @date 2020/7/15 15:35
 */
@ConfigurationProperties(prefix = "myconfig")
public class MyConfig {

    private String name;

    private Integer age;

    private String gender;

    private String idCard;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "MyConfig{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
