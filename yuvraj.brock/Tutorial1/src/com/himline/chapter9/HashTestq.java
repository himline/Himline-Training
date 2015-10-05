package com.himline.chapter9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import java.io.*;

import java.io.*;

import java.util.HashSet;

public class HashTestq {
    
    private String str;
    
    public HashTestq(String str) {
        this.str = str;
    }
    
    public static void main(String args[]) {
        HashTestq h1 = new HashTestq("1");
        HashTestq h2 = new HashTestq("1");
        HashTestq h3 = new HashTestq("2");
        String s1 = new String("2");
        String s2 = new String("2");
        
        HashSet<Object> hs = new HashSet<Object>();
        hs.add(h1);
        hs.add(h2);
       	hs.add(h3);
        hs.add(s1);
        hs.add(s2);
        
        System.out.print(hs.size());
    }
}