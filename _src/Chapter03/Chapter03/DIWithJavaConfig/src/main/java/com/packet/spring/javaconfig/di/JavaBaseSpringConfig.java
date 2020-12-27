package com.packet.spring.javaconfig.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBaseSpringConfig {

	@Bean(name="professor")
	public Professor getProfessor() {
		return new Professor();
	}
	
	@Bean(name="subjectBean")
	public Subject getSubject() {
		return new Subject();
	}
}
