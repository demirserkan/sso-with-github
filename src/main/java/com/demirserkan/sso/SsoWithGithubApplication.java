package com.demirserkan.sso;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SsoWithGithubApplication {

	private final SecurityConfiguration securityConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(SsoWithGithubApplication.class, args);
	}

}
