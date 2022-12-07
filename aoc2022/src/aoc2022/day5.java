package aoc2022;

import java.util.*;
import java.io.*;

public class day5 {
	public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\feoun\\OneDrive\\Desktop\\Computer Science\\aoc2022\\src\\aoc2022\\aocday5.txt"));
        for (int i = 0; i<10;i++) {
        	sc.nextLine();
        }
        int moves, crateFrom, crateTo;
        ArrayList<String> crates = new ArrayList<String>(
        					Arrays.asList("lcgmq", "ghftcldr", "rwtmnfjv", "pqvdfj", "tblsmfn", "pdchvnr", "tch", "phnzvjsg", "ghfz"));
        

        
        while (sc.hasNext()) {
        	sc.next();
        	moves = Integer.parseInt(sc.next());
        	sc.next();
        	crateFrom = Integer.parseInt(sc.next()) - 1;
        	sc.next();
        	crateTo = Integer.parseInt(sc.next()) - 1;
        	
        	
    		String moved = crates.get(crateFrom).substring(0, moves);
    		crates.set(crateTo, moved + crates.get(crateTo));
    		crates.set(crateFrom, crates.get(crateFrom).substring(moves));
        }
        for (String crate : crates) {
        	System.out.print(crate.charAt(0));
        }
	}
}
