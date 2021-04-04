package com.siri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siri.beans.ProtoTypeScopeBean;
import com.siri.beans.SingleTonClass;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
@ComponentScan({"com.siri.beans"})
public class SpringBootExample6Application {

	
	
	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication
				.run(SpringBootExample6Application.class, args);
		
		SingleTonClass ob = context.getBean(SingleTonClass.class);
		ob.setName("singleton");
		System.out.println("singleton :"+ob.getName());
		
		SingleTonClass ob1 = context.getBean(SingleTonClass.class);
		System.out.println("singleton :"+ob1.getName());
		
		ProtoTypeScopeBean pob = context.getBean(ProtoTypeScopeBean.class);
		pob.setName("prototype");
		System.out.println("prototype :"+pob.getName());
		
		ProtoTypeScopeBean pob1 = context.getBean(ProtoTypeScopeBean.class);
		System.out.println("prototype :"+pob1.getName());
		
		
		
		
	}

	

}

