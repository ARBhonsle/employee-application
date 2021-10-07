package com.bridgelabz.employeeapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeeApplication {
    public static final Logger logger = LoggerFactory.getLogger(EmployeeApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to Employee Application");
        ApplicationContext context = SpringApplication.run(EmployeeApplication.class, args);
        logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
        logger.debug("\n****Example using @Autowire Annotation on property ****");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(104);
        employeeBean.setName("Alen Tomkins");
        employeeBean.showEmployeeDetails();
    }

}
