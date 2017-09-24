package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DefiHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DefiHerokuApplication.class, args);
	}
}
echo "# defiHeroku" >> README.md ; git init ; git add README.md ; git commit -m "first commit"; git remote add origin https://github.com/samantang/defiHeroku.gitgit push -u origin master