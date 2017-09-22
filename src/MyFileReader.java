import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;



public class MyFileReader {
	public static String getFileContent(String myFile){
		StringBuilder contents = new StringBuilder();
	    try {
	    	FileInputStream fstream = new FileInputStream(myFile);
	    	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	        try {
	          String line = null;
	 
	          while (( line = br.readLine()) != null){
	            contents.append(line);
	           contents.append(System.getProperty("line.separator"));
	          }
	        }
	        finally {
	          br.close();
	        }
	      }
	      catch (IOException ex){
	        ex.printStackTrace();
	      }
	      
	      return contents.toString();
	    
	}
	public static void main(String[] args){
		//File myFile= new File("C:\\Users\\Ameen Almiftah\\Documents\\workspace\\");
		//DirPrinter.fileLister(myFile);
		System.out.println(getFileContent("input.txt"));
		}
}

