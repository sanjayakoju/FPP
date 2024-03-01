package lesson12.trycatch;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class TryCatchSiganture {

	public static void main(String[] args) throws IOException {
		try {
			// Exception code block
			FileWriter fw = new FileWriter("MyFile"); 
		}
		catch(IOException sq) {
			
		}
	/*	catch(FileNotFoundException io) {
			
		}*/
		
		finally {
			
		}
	}

}
