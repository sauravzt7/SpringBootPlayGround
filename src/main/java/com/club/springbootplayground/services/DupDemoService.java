package com.club.springbootplayground.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("dupDemoService")
public class DupDemoService implements IDemoService {

    @Override
    public String getDemoMessage() {
        return "<h1>Hello World from DupDemoService!!</h1>";
    }
}
