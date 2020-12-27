package com.packt.spring.circulardependency;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.packt.spring.circulardependency.model.setter")
public class SpringConfigForSetter {

}
