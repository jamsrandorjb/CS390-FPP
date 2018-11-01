package lab13_1;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class Test2 {

	static File insert;
	private String expectedText = "This is the file you are seeking!";
	private String setupDirectory = "testCode";
	private String targetFile = "seek.txt";

	public Test2() {
		File f = new File("C:\\testCode\\level1\\level2\\finalLevel");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2a\\thirdLevel");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2b\\thirdLevelb");
		System.out.println(f.mkdirs());
		f = new File("C:\\testCode\\level1\\level2b\\thirdLevelc\\fourthLevel");
		System.out.println(f.mkdirs());
		insert = new File(f.getAbsolutePath() + "\\seek.txt");
		System.out.println("writing to " + insert.getAbsolutePath());
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(insert)));
			pw.write(expectedText);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void SearchForFile() throws FileNotFoundException {

		boolean result = FileSearch.searchForFile(targetFile, setupDirectory);
		assertTrue(result);
		assertTrue(expectedText.equals(FileSearch.discoveredText.trim()));

	}

}
