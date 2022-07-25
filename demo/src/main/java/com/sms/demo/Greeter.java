package com.sms.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.function.Supplier;
@Component
@Slf4j
public class Greeter implements Function<String,String>,Supplier<String>{



    @Override
    public String apply(String s) {
        return "gfycfycfcfycyfcfycfycyfvg"+s;
    }


    @Override
    public String get() {
        return "hyg";
    }
}