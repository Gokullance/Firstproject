package Screens;

import java.io.File;

public class DirectoryService {

	public static Directory fileDirectory = new Directory();
	
	public static void PrintFiles() {
		fileDirectory.fillFiles();
		
		for(File file : DirectoryService.getFileDirectory().getFiles()) {
			System.out.println(file.getName());
		}
	}
	public static Directory getFileDirectory() {
		return fileDirectory;
	}
	public static void selfFileDirectory(Directory fileDirectory) {
		DirectoryService.fileDirectory = fileDirectory;
	}
		
	

}
