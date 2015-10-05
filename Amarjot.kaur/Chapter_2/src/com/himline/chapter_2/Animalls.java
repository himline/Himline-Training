//Overloaded Constructors
package com.himline.chapter_2;

public class Animalls {
 String name;
Animalls(String name) {
 this.name = name;
 }

 Animalls() {
 this(makeRandomName());
}

 static String makeRandomName() {
 int x = (int) (Math.random() * 5);
 String name = new String[] {"Fluffy", "Fido","Rover", "Spike","Gigi"}[x];
 return name;
 }

 public static void main (String [] args) {
 Animalls a = new Animalls();
 System.out.println(a.name);
 Animalls b = new Animalls("Zeus");
 System.out.println(b.name);
}
 }