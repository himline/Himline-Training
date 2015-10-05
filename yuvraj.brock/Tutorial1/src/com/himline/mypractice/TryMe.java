package com.himline.mypractice;

import java.io.*;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TryMe {
    public static void main(String args[]) {
        List<String> list = new LinkedList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        
        Collections.reverse(list);
        @SuppressWarnings("unused")
		Iterator<String> iter = (Iterator<String>) list.iterator();
        
//        for (Object o : iter) {
//            System.out.print(o + " ");
//        }
        System.out.print(  " hfjshjgfhsgsdh gh gidl gjgdg g gggggggff");
        Date d = new Date (10021202150L);
        System.out.print(  d.getTime());
    }
}