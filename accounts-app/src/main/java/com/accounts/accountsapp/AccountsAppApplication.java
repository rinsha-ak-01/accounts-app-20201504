package com.accounts.accountsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.accounts.accountsapp.controller"})
public class AccountsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsAppApplication.class, args);
	}

}
