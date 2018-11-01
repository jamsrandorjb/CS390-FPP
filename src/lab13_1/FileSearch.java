package lab13_1;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintStream;

/**
//PSEUDO-CODE
boolean searchForFile(Object file, Object startDir) {
	Object[] fileSystemObjects =
						startDir.getContents();
	for(Object o: fileSystemObjects) {
		//base case
		if(isFile(o) && isSameFile(o,f)) {
			return true;
		}

		if(isDirectory(o)) {
			searchForFile(file, o);
		}
	}
	//file not found in startDir
	return false;
}
*/
public class FileSearch {
	static boolean found = false;
	//Store the text that is found in the
	//file that is found in this String variable
	static String discoveredText = null;
	public static boolean searchForFile(String filename, String startDir) throws FileNotFoundException {
		//implement
		File f = new File(startDir);
		File[] matchingFiles = f.listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.equals(filename);
		    }
		});
		for(File f1 : matchingFiles)
			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(f1))));
		
		if(matchingFiles.length > 0)
			return true;
		
		return false;	
	}
	
	

}
