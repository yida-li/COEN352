package StringStuffs;

public class stringdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String y="EcliPseyiDa";
	System.out.println("Original String"+y);
	for(int i=0;i<y.length();i++){
		
	System.out.print(y.charAt(i)+" ");	
		}
	System.out.print("\n");

	
		
	System.out.println("All become lowercase\t=" +y.toLowerCase());
	System.out.println("All become Uppdercase\t=" +y.toUpperCase());
	System.out.println("Substring(0)\t="+y.substring(0));
	System.out.println("Substring(1)\t="+y.substring(1));
	System.out.println("Substring(6)\t="+y.substring(6));
	System.out.println("Substring(length-4)\t="+y.substring(y.length()-4));
	System.out.println("Substring(0,length-4)\t="+y.substring(0,y.length()-4));
	
	System.out.println("String boolean methods startsWith() and endsWith()");
	System.out.println(y.startsWith("Ecli")+" "+y.endsWith("iDa"));
	
	System.out.println("Replacing character P with #\t="+y.replace('P', '#'));
	System.out.println("Index of yiD from the string is \t= "+y.indexOf("yiD"));
	System.out.println("Index of s from the string is \t= "+y.indexOf("s"));
	String yida="YidA";
	// equalIgnoreCase 
	System.out.print("\n");
	System.out.println(" checking if the string YidA is equalsIgnoreCase to the substring of wtv you know "+yida.equalsIgnoreCase(y.substring(y.length()-yida.length())));
	System.out.print("\n");
	System.out.println(" checking if the string YidA is equalsIgnoreCase to the substring of wtv you know "+yida.equalsIgnoreCase(y.substring(y.length())));
	
	System.out.print("\n");
	y+=" | | | |";
	System.out.println("changing the reference variable of the string "+y);
	for(int i=0;i<y.length();i++)
		{
		System.out.print(y.charAt(i)+" ");	
		}
		System.out.print("\n");	
	
		//byte to string
	byte[] b_arr = {121, 105, 100, 97,111,111};
	String s3 = new String(b_arr, 0, 4);
	//char to string 

	char char_arr[] = {'-', 'y', 'i', 'd', 'a','-','0'};
	String s4 = new String(char_arr , 1, 4); 
	
	System.out.println(s3+" is equal to "+s4+" " +s3.equals(s4));
	}

	

	

	//https://www.geeksforgeeks.org/string-class-in-java/
}
