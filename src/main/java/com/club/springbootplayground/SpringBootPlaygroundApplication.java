package com.club.springbootplayground;

import com.club.springbootplayground.entities.DemoEntity;
import com.club.springbootplayground.services.DemoService;
import com.club.springbootplayground.services.DupDemoService;
import com.club.springbootplayground.services.IDemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPlaygroundApplication {

    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(SpringBootPlaygroundApplication.class, args);
//        String[] beanNames = appContext.getBeanDefinitionNames();
//
//        for(String beanName : beanNames) {
//            System.out.println("Bean Name: " + beanName);
//        }

//        IDemoService demoServiceInterface = appContext.getBean("demoServiceInterface", IDemoService.class);
        IDemoService demoService = appContext.getBean("demoService", DemoService.class);
        IDemoService demoService1 = appContext.getBean("demoService", DemoService.class);
        IDemoService demoService2 = appContext.getBean("demoService", DemoService.class);

        // For Each getBean call, a new instance of DemoService is created because it is defined as prototype scope.
//        DupDemoService dupDemoService = appContext.getBean("dupDemoService", DupDemoService.class);
        System.out.println("DemoService: " + demoService);
        System.out.println("DemoService1: " + demoService1);
//        DemoEntity demoEntity = appContext.getBean("demoEntity", DemoEntity.class);
//        System.out.println("DemoEntity: " + demoEntity);
//        DemoEntity demoEntity1 = appContext.getBean("demoEntity", DemoEntity.class);
//        System.out.println("DemoEntity1: " + demoEntity1);




    }

}
