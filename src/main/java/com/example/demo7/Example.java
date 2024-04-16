package com.example.demo7;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
    }

    @Override
    public String toString() {
        return "Example{" +
                "subject='" + subject + '\'' +
                '}';
    }

    //However after adding these 2 annotations, we won't get the output. We need to make some changes in XML file to enable these annotations as these annotations are disabled

    @PostConstruct
    public void start()
    {
        System.out.println("Init method");
    }

    @PreDestroy
    public  void end()
    {
        System.out.println("Destroy method");
    }

}
