package com.subs.alphawizard.A_SingleTon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class OperationService {

    @Bean
    @Scope("singleton")
    public Customer getCustomer(){
        return new Customer();
    }

}