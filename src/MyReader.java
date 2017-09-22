import java.io.File;
import java.io.IOException;
import java.util.Scanner;




public class MyReader {

	
	public static void main(String[] args){
		
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			try {
				

				while (sc.hasNext()){
					System.out.println(sc.next()+" "+sc.next()+"  "+sc.next()+"  "+sc.nextInt()+"  "+sc.nextDouble());

				}
			}
			finally {
				sc.close();
			}
		}
		catch (IOException ex){
			ex.printStackTrace();
		}
		
	}
}

