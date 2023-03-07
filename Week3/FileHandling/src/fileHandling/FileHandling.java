package fileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling {
	private static String DIR = System.getProperty("user.dir");
	public static void main(String[] args) {
		//System.out.println(isFileExist());
	    System.out.println(isFileExistsWithExceptionHandling());
	    //createFileIfNotExist();
	}
	public static boolean isFileExist() {
		//Check if a file exists ;
		
		Path p = Paths.get(DIR+"/test.txt");
		return Files.exists(p);
	}
	public static boolean isFileExistsWithExceptionHandling() {
		boolean check = false;
		
		try {
			Path p = Paths.get(DIR+"/test.txt");
			if(Files.exists(p)) {
				check = true;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return check;
	}
	public static void createFileIfNotExist() throws IOException {
		Path p = Paths.get(DIR+"/test.txxt");
		if(!isFileExistsWithExceptionHandling()) {
			 Files.createFile(p); 
		}
	}

}
