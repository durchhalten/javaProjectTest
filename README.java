package firstProject;

import java.io.File;

public class firstProject{
	
	public static void main(String args[]){
		
		String path = "D:\\";
		
		File file = new File(path);
		
		func(file);
		
		}

	private static void func(File file) {
		// TODO Auto-generated method stub
		
		File[] fs = file.listFiles();
		for(File f:fs) {
			
			if(f.isDirectory()) {func(f);}
			if(f.isFile()) {System.out.println(f);}
			
		}
	
	}
	
	}
