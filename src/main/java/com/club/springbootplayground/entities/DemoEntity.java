package com.club.springbootplayground.entities;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // This bean will be created as a prototype
public class DemoEntity {
    private static int instanceCount = 0;
    private String name = "Default Name";
    private int age = 0;

    public DemoEntity() {
        instanceCount++;
        System.out.println("DemoEntity created. Instance count: " + instanceCount);
    }


//    public String toString() {
//        return "DemoEntity{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


}
