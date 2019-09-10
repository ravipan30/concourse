package com.example.demo_ravi_h2.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEES")
@EnableAutoConfiguration
@Configuration
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long e_id;

    @Column(name="name")
    String e_name;

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setE_id(Long e_id) {
        this.e_id = e_id;
    }

    public String getE_name() {

        return e_name;
    }

    public Long getE_id() {
        return e_id;
    }
}
