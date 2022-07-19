
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class trial1 {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
	
		String s1= "dictionary.txt";
		Scanner input= new Scanner (new File(s1));
		
			    while (input.hasNext()) //boolean method
			    	//returns true if this scanner has another token in its input. 
			    {
			    	
			    String a= input.next(); // returns the next complete token from the scanner
			    // presumably separated kindly by a space
			    
			    
			    System.out.println(a);	
			    }
	
	
	
	
	
	}
	

}