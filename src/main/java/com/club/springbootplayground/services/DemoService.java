package com.club.springbootplayground.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Component
@Qualifier("demoService")
public class DemoService implements IDemoService {

    @Override
    public String getDemoMessage() {
        return "<h1>Hello World!! from Demo Service </h1>";
    }

}
