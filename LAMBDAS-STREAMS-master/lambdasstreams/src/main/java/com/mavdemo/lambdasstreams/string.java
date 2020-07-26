package com.mavdemo.lambdasstreams;
import java.util.*;
import java.util.stream.Collectors;
public class string {
	public static List<String> find(List<String> str){
		List<String> resultStr = str.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		return resultStr;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> arr = new ArrayList<String>(n);
		for(int i = 0; i < n; i++) {
			String z = sc.next();
			arr.add(z);
        }
        List<String> str = new ArrayList<String>();
       	str = find(arr); 
       	for(String i : str)  
       		System.out.println(i);  
       	sc.close();
}
}
