package com.codegnan.Files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
      
      	
 
      	// Create a File object for the directory
      	File directory = new File("c://javapracties");
 
      	// Ensure that the directory exists
      	if (directory.exists() && directory.isDirectory()) {
          	// List all files and directories using list()
          	String[] filesAndDirs = directory.list();
          	if (filesAndDirs != null) {
               	
				System.out.println("Files and directories in c:javapracties");
               	for (String name : filesAndDirs) {
               	 	System.out.println(name);
               	}
          	}
      	}
	}
}

	
/*public static void main(String[] args) throws IOException {
	File f = new File("abc.txt");
	System.out.println(f.exists());
	
	
	f.createNewFile();
	System.out.println(f.exists());
	
	
}*/
	


