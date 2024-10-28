package com.trevisan.paypal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaypalIntegrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(PaypalIntegrationApplication.class, args);
	}

}
