package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication1.class, args);
    }

    public void sayHello() {
        System.out.println("Hello from Demo1Application!");
    }

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public String getStatus() {
        return "Application is running";
    }

    public String getStatus1() {
        return "Application is running";
    }

    public String getStatus2() {
        return "Application is running";
    }

    public String f_hotfix() {
        return "Application is running";
    }

    public String b() {
        return "Application is running";
    }

    public String d() {
        return "Application is running";
    }

}
