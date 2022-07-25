package com.sms.demo;

import org.springframework.stereotype.Repository;


import java.util.Arrays;
import java.util.List;

@Repository
public class studentrepository {
    public List<Student> studentlist()
{ return Arrays.asList(new Student(1, "tom", 25), new Student(2, "tommh", 20), new Student(3, "ofs", 51));
}
}


