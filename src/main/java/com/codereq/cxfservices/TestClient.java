package com.codereq.cxfservices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClient {

	public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("testservice.xml");
     MathModule module=(MathModule) context.getBean("client");
      System.out.println(module.isOdd(9));
	}
}
