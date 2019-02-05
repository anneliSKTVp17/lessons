/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KolleksionArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user2
 */
public class Kolleksion1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        measureTime(arrayList, "arrayList:");
        List<Integer>linkedList = new LinkedList<Integer>();
        measureTime(linkedList, "linkedList:");
    }
    private static void measureTime(List<Integer> list, String name) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(name);
        System.out.println("");
        System.out.println("add diff " + (end - start));
        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
         list.get(i);
         
        }
        end = System.currentTimeMillis();
        System.out.println("");
        System.out.println("get diff " + (end - start));
        System.out.println("");
    }
}

   