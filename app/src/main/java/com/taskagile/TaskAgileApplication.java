package com.taskagile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//DB 설정이 안되어있을 때
public class TaskAgileApplication {

  public static void main(String[] args) {
    SpringApplication.run(TaskAgileApplication.class, args);
  }
}
