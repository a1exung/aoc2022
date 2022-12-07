package aoc2022;

import java.io.*;
import java.util.*;
public class day3 {
	public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\feoun\\OneDrive\\Desktop\\Computer Science\\aoc2022\\src\\aoc2022\\aocday3.txt"));
        String reference = "0abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //String sack1, sack2;
        int counter = 0;
        char priority = '0';
        
        /**/
        while (sc.hasNext()) {
        	String line = sc.next();
        	String sack1 = line.substring(0, line.length() / 2);
        	String sack2 = line.substring(line.length() / 2);
        	
        	for (int i = 0; i < sack1.length(); i++) {
        		for (int j = 0; j < sack2.length(); j++) {
        			if (sack1.charAt(i) == sack2.charAt(j)) {
        				priority = sack2.charAt(j);
        			}
        		}
        	}
        	counter += reference.indexOf(priority);
        }
        System.out.println(counter);
        
        /**/
        while (sc.hasNext()) {
        	String bag1 = sc.next();
        	String bag2 = sc.next();
        	String bag3 = sc.next();
        	
        	for (int i = 0; i < bag1.length(); i++) {
        		for (int j = 0; j < bag2.length(); j++) {
        			for (int k = 0; k < bag3.length(); k++) {
        				if (bag1.charAt(i) == bag2.charAt(j) && bag1.charAt(i) == bag3.charAt(k)) {
            				priority = bag2.charAt(j);
            			}
        			}
        		}
        	}
        	counter += reference.indexOf(priority);
        }
        System.out.println(counter);
        /**/
	}
}
