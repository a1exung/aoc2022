package aoc2022;
import java.util.*;
import java.io.*;


public class day8 {
	static File today = new File("C:\\Users\\feoun\\OneDrive\\Desktop\\Computer Science\\aoc2022\\src\\aoc2022\\aocday8.txt");
	public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(today);
        int j = 0;
        int[][] treeField = new int[99][99];
        while (sc.hasNext()) {
        	String line = sc.nextLine();
        	for (int i = 0; i < line.length(); i++) {
        		treeField[j][i] = Integer.parseInt(line.substring(i, i+1));
        	}
        	j++;
        }
        boolean isVisible = false;
        int visibleSum = 0;
        for (int x = 0; x < 99; x++) {
        	for (int y = 0; y < 99; y++) {
        		if (x == 0 || y == 0 || x == 98 || y == 98) {
        			isVisible = true;
        		}
        		if (isVisible) {
        			visibleSum++;
        			isVisible = false;
        		}
        	}
        } 
        for (int x = 1; x < 98; x++) {
        	for (int y = 1; y < 98; y++) {
        		if (greaterLeft(treeField, x, y) || greaterRight(treeField, x, y) || greaterDown(treeField, x, y) || greaterUp(treeField, x, y)) {
        			visibleSum++;
        		}
        	}
        } 
        System.out.println(visibleSum);
        int bestScenic = Integer.MIN_VALUE;
        for (int x = 1; x < 98; x++) {
        	for (int y = 1; y < 98; y++) {
        		int scenicScore = scenicLeft(treeField, x, y) * scenicRight(treeField, x, y) * scenicDown(treeField, x, y) * scenicUp(treeField, x, y);
        		if (scenicScore >= bestScenic)
        			bestScenic = scenicScore;
           	}
        } 
        System.out.println(bestScenic);
        
	}
	
	public static boolean greaterLeft(int[][] table, int x, int y) {
		boolean isGreater = true;
		for (int s = (y-1); s >= 0; s--) {
			if (table[x][y] <= table[x][s])
				isGreater = false;
		}
		return isGreater;
	}	
	public static boolean greaterRight(int[][] table, int x, int y) {
		boolean isGreater = true;
		for (int s = (y+1); s <= 98; s++) {
			if (table[x][y] <= table[x][s])
				isGreater = false;
		}
		return isGreater;
	}	
	public static boolean greaterUp(int[][] table, int x, int y) {
		boolean isGreater = true;
		for (int s = (x - 1); s >= 0; s--) {
			if (table[x][y] <= table[s][y])
				isGreater = false;
		}
		return isGreater;
	}	
	public static boolean greaterDown(int[][] table, int x, int y) {
		boolean isGreater = true;
		for (int s = (x+1); s <= 98; s++) {
			if (table[x][y] <= table[s][y])
				isGreater = false;
		}
		return isGreater;
	}	
	public static int scenicLeft(int[][] table, int x, int y) {
		int visible = 0;
		for (int s = (y-1); s >= 0; s--) {
			if (table[x][y] > table[x][s])
				visible++;
			else {
				visible++;
				break;
			}
		}
		
		return visible;
	}
	public static int scenicRight(int[][] table, int x, int y) {
		int visible = 0;
		for (int s = (y+1); s <= 98; s++) {
			if (table[x][y] > table[x][s])
				visible++;
			else {
				visible++;
				break;
			}
		}
		return visible;
	}
	public static int scenicUp(int[][] table, int x, int y) {
		int visible = 0;
		for (int s = (x-1); s >= 0; s--) {
			if (table[x][y] > table[s][y])
				visible++;
			else {
				visible++;
				break;
			}
		}
		return visible;
	}
	public static int scenicDown(int[][] table, int x, int y) {
		int visible = 0;
		for (int s = (x+1); s <= 98; s++) {
			if (table[x][y] > table[s][y])
				visible++;
			else {
				visible++;
				break;
			}
		}
		return visible;
	}
}
