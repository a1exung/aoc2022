package AdventOfCode;


/**
 * Write a description of class day1_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
public class day1_1
{
    public static void main (String[] args) throws IOException{
        ArrayList<Integer> sums = new ArrayList<Integer>();
        Scanner sc = new Scanner(new File("AdventOfCode/aocday1-1.txt"));
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (sc.hasNext()){
            String line = sc.nextLine();
            if (!line.trim().isEmpty())
                sum += Integer.parseInt(line);
            else{
                sums.add(sum);
                sum = 0;
            }
        
        }
        sums.add(sum);
        for (int member : sums){
            
            if (member >= max)
                max = member;
        }
        System.out.println(max);
        
        Collections.sort(sums);
        System.out.println(sums.get(sums.size() - 1) + sums.get(sums.size() - 2) + sums.get(sums.size() - 3));
    }
}
