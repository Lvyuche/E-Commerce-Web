package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class LooseCouplingExample {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationInversionOfControl.xml");
      UserManager userManager = (UserManager) context.getBean("userDataProvider");
      System.out.print(userManager.getUserInfo());
   }
}
