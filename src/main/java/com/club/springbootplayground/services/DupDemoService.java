package com.club.springbootplayground.services;

import com.club.springbootplayground.entities.DemoEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton") // This bean will be created as a singletonæ
@Component
@Qualifier("dupDemoService")
public class DupDemoService implements IDemoService {

    private DemoEntity demoEntity;

    public DupDemoService(DemoEntity demoEntity) {
        setDemoEntity(demoEntity);
        System.out.println("DupDemoService created with entity: " + demoEntity);
    }

    @Override
    public String getDemoMessage() {
        System.out.println(demoEntity);
        return "<h1>Hello World from DupDemoService!!</h1>";
    }

    public void setDemoEntity(DemoEntity demoEntity) {
        this.demoEntity = demoEntity;
    }
}
