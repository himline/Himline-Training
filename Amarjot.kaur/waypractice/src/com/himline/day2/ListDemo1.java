package com.himline.day2;

import java.util.*;
public class ListDemo1
{
  public static void main(String[] args) 
  {
    List cities = new ArrayList();
    System.out.println("\nElements exist before adding elements: " + cities.isEmpty());
    cities.add("Hyderabad");	   cities.add("Chennai");
    cities.add("Bengaluru");             cities.add("Kochi");
    System.out.println("Elements exist after adding elements: " + cities.isEmpty());
    System.out.println("No. of cities: " + cities.size());

    System.out.println("cities contains Chennai: " + cities.contains("Chennai"));
    System.out.println("City at index number 3: " + cities.get(3));

    cities.add("Pune");	   cities.add("Mumbai");  cities.add("Chennai");
    System.out.println("\nNew size of cities after adding three elements: " + cities.size());
    System.out.println("Elements of cities after adding 3 more: \n" + cities);

    System.out.println("\nIndex of Chennai: " + cities.indexOf("Chennai"));
    System.out.println("Last Index of Chennai: " + cities.lastIndexOf("Chennai"));
    List subCities = cities.subList(2,4);
    System.out.println("Elements of subCities: " + subCities);

    subCities.remove(1);    
    subCities.remove("Bengaluru");    
    System.out.println("\nElements of subCities after two removes: " + subCities);
    System.out.println("Elements of cities after two removes: " + cities);

    subCities.clear();
    System.out.println("\nSize of subCities after calling clear(): " + subCities.size());    
    System.out.println("Elements of subCities after calling clear(): " + subCities);
  }
}