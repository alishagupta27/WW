package com.WW;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Question1{
	public static void doesFileExists(String path) throws FileNotFoundException, IOException{
		Path pathlocation = FileSystems.getDefault().getPath(path);
		File file=new File(pathlocation.toString());
		if (file.exists()){
			
			System.out.println("reading");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				String[] arrOfStr=line.split("-");
				System.out.println(arrOfStr[0]);
				String[] str=arrOfStr[1].split(",");
				for (String s : str)
					System.out.println(s);
				}
			fileReader.close();
		}
	}
	
	public static void main(String[] args){
		try{
		doesFileExists("src/main/resources/File.txt");
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println(e);
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.println(e);
			}
	}
}
