package aoc2022;

import java.io.*;
import java.util.*;
public class day4 {
	public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\feoun\\OneDrive\\Desktop\\Computer Science\\aoc2022\\src\\aoc2022\\aocday4.txt"));
        sc.useDelimiter("-|,|\\n");
        int counter = 0;
        
        /*
        while (sc.hasNext()) {
        	int low1, low2, high1, high2;
        	low1 = Integer.parseInt(sc.next());	
        	high1 = Integer.parseInt(sc.next());
        	low2 = Integer.parseInt(sc.next());
        	high2 = Integer.parseInt(sc.next().trim());
        	
        	if ((low1 >= low2 && high1 <= high2) || (low1 <= low2 && high1 >= high2))
        		counter++;
        	
        	
        }
        /**/
        while (sc.hasNext()) {
        	int low1, low2, high1, high2;
        	low1 = Integer.parseInt(sc.next());	
        	high1 = Integer.parseInt(sc.next());
        	low2 = Integer.parseInt(sc.next());
        	high2 = Integer.parseInt(sc.next().trim());
        	
        	if ((high1 >= low2 && low1 <= high2) || (high2 >= low1 && low2 <= high1))
        		counter++;
        	
        	
        }
        System.out.print(counter);
	}
}