package com.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		FileFilter filter = (File pathname) -> 	pathname.getName().endsWith(".txt");
		File dir = new File("C:/Users/madhu/Documents");
		File[] contents = dir.listFiles(filter);
		for(File file:contents) {
			System.out.println(file);
		}
	}
}
