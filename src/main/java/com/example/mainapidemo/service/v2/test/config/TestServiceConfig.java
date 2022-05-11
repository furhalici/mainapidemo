package com.example.mainapidemo.service.v2.test.config;

import com.example.mainapidemo.service.v2.test.TestServiceRegistry;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestServiceConfig {

    @Bean
    public ServiceLocatorFactoryBean deviceServiceFactory() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(TestServiceRegistry.class);
        return factoryBean;
    }

}
