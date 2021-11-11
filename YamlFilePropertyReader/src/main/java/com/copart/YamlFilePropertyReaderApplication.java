package com.copart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.copart.model.StudentInfo;

@SpringBootApplication
public class YamlFilePropertyReaderApplication {

	//Finish
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(YamlFilePropertyReaderApplication.class, args);
		StudentInfo studentInfo = ctx.getBean(StudentInfo.class);
		System.out.println(studentInfo);
	}

}
