package com.club.springbootplayground.services;

import com.club.springbootplayground.entities.DemoEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Scope("singleton") // This bean will be created as a singleton
@Component
@Qualifier("demoService")
public class DemoService implements IDemoService {

    private DemoEntity demoEntity;

    public DemoService(DemoEntity demoEntity) {
        setDemoEntity(demoEntity);
        System.out.println("DemoService created with entity: " + demoEntity);
    }

    @Override
    public String getDemoMessage() {
        System.out.println(demoEntity);
        return "<h1>Hello World!! from Demo Service </h1>";
    }

    private void setDemoEntity(DemoEntity demoEntity) {
        this.demoEntity = demoEntity;
    }

}
