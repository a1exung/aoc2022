package aoc2022;

import java.io.*;
import java.util.*;
public class day2 {
	public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\feoun\\OneDrive\\Desktop\\Computer Science\\aoc2022\\src\\aoc2022\\aocday2.txt"));
        char one, two;
        int counter = 0;
        while (sc.hasNext()) {
        	one = sc.next().trim().charAt(0);
        	two = sc.next().trim().charAt(0);
        	switch (one) {
        		case 'A':
        			switch (two) {
	        			case 'X':
	        				counter += 3;
	        				break;
	        			case 'Y':
	        				counter += 4;
	        				break;
	        			case 'Z':
	        				counter += 8;
	        				break;
        			}
        			break;
        		case 'B':
        			switch (two) {
	        			case 'X':
	        				counter += 1;
	        				break;
	        			case 'Y':
	        				counter += 5;
	        				break;
	        			case 'Z':
	        				counter += 9;
	        				break;
    			}
    			break;
        		case 'C':
        			switch (two) {
	        			case 'X':
	        				counter += 2;
	        				break;
	        			case 'Y':
	        				counter += 6;
	        				break;
	        			case 'Z':
	        				counter += 7;
	        				break;
    			}
    			break;
        	}
        }
        System.out.print(counter);
	}
}
