package com.bankmanagement.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication

@ComponentScan(basePackages = { "com.bankmanagement.Rest" , "com.bankmanagement.Service" ,"com.bankmanagement.Repository"})
public class BankManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankManagementApplication.class, args);
	}

}
