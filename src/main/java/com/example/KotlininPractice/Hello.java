package com.example.KotlininPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by BiG on 6/16/2017 AD.
 */
public class Hello {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("a,b,c,d".split(","));

        Collection<String> collectString = Arrays.asList("a,b,c,d".split(","));

        Iterator<String> iterString = Arrays.asList("a,b,c,d".split(",")).iterator();


    }
}
