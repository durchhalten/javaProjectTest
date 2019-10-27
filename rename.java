package firstProject;

import java.io.File;

//修改文件的名称

public class firstProject{

	public static void main(String args[]) {
		
		System.out.println("是否已经更改名称：" + reName("D:\\新建文件夹", "D:\\\\新建文件夹1"));
		
	}
	
	private static boolean reName(String oldname, String name) {
		
		File file1 = new File(oldname);
		
		File file2 =new File(name);
		
		return file1.renameTo(file2);
	}
	
	
}
