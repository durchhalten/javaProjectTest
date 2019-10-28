package firstProject;

import java.util.HashMap;
import java.util.Scanner;

public class firstProject{
	
	static HashMap<Character , String>  maps = new HashMap<Character , String>();
	
	static {
		mPut("abc","2");
		mPut("def","3");
		mPut("ghi","4");
		mPut("jkl","5");
		mPut("mno","6");
		mPut("pqrs","7");
		mPut("tuv","8");
		mPut("wxyz","9");
	}
	
	public static void mPut(String keys, String num) {
		for(int i=0;i<keys.length();i++) {
			maps.put(keys.charAt(i), num);
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println("Pleaes input word:");
		Scanner in = new Scanner(System.in);
		String sWord = in.nextLine().toLowerCase();
		
		while(! sWord.equals(":wq")) {
			for(int i=0;i<sWord.length();i++) {
				String num = maps.get(sWord.charAt(i));
				if(num == null) {
					System.out.println("input word is illegal,please input again");
				}
				System.out.print(num);
			}
			System.out.println();
			System.out.println("-------------");
			sWord = in.nextLine().toLowerCase();
		}
		
	}
	
}
