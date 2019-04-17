package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Files implements MessageManager{
	@Override
	public void getMessage() {
		File file = new File("message.txt");
		if(!file.exists())
		{
			try {
				PrintWriter pwr = new PrintWriter(file);
				pwr.write("Hello Milky Way");
				pwr.close();
			} 
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
					
		}
		else
			System.out.println("File Already Exists: Check the class folder");
		//System.out.println("Hello Milky Way");
		
	}
}
