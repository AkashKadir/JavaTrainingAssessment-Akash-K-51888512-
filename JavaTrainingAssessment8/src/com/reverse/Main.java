package com.reverse;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<CallLog> list = new ArrayList<CallLog>();
		try {
			BufferedReader pr = new BufferedReader(new FileReader("D:\\akash\\EClipse JEE\\JavaTrainingAssessment8\\src\\com\\reverse\\calllog.csv"));
			
			String line = null;
			while((line=pr.readLine())!=null) {
				String[] split = line.split(",");
				list.add(new CallLog(split[0],Long.parseLong(split[1]),Integer.parseInt(split[2]),split[3]));
			}			
			pr.close();
		} catch (IOException e) {
			System.out.println("File not found.");
		}
		finally {
			sc.close();
		}
		
		Collections.sort(list,new DurationComparator());
		Collections.sort(list,new NameComparator());
		
		System.out.println("Caller Logs :");
		System.out.format("\n%-25s %-25s\n","Caller Name","Duration");

		for(int i=0;i<list.size();i++) {
			System.out.format("\n%s(+91-%s) %10s\n",list.get(i).getName(),list.get(i).getDialledNumber(),list.get(i).getDuration());
		}
		
	}

}
