package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        BiPredicate<Integer, String> biPredicate=(i,o)->i>20&& o.startsWith("M");

        System.out.println(biPredicate.test(30, "Sean"));
        System.out.println(biPredicate.test(40, "Martin"));
        System.out.println(biPredicate.test(50, "Andrew"));

    }
}
