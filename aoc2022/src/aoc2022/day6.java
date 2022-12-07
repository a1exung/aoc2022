package aoc2022;
import java.util.*;
import java.io.*;


public class day6 {
	public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\feoun\\OneDrive\\Desktop\\Computer Science\\aoc2022\\src\\aoc2022\\aocday6.txt"));
        String input = sc.next();
        System.out.println(findPacket(input));
	}
	public static int findPacket(String in) {
		for (int i = 0; i < in.length() - 13; i++) {
        	String sub = new String (in.substring(i, i + 14));
        	boolean test = true;
        	for (int k = 0; k < sub.length(); k++) {
        		
        		for (int j = 0; j < sub.length(); j++) {
        			if (sub.charAt(k) == sub.charAt(j) && k != j) {
        				test = false;
        			}
        		}
        		
        	}
        	if (test == true) return i + 14;
        }
		return 0;
	}
}
