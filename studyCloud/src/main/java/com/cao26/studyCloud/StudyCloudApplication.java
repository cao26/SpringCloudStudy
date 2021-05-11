package com.cao26.studyCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class StudyCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyCloudApplication.class, args);
	}

}
