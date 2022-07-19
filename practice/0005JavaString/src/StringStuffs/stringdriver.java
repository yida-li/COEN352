package StringStuffs;

public class stringdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String y="EcliPseyiDa";
	System.out.println("Original String"+y);
	for(int i=0;i<y.length();i++){
		char caca= y.charAt(i);
		System.out.print(caca+" ");	
			}
		System.out.print("\n");
		for(int i=0;i<y.length();i++){
		System.out.print(i+" ");	
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
	System.out.println(" checking if the string YidA is equalsIgnoreCase to the substring of wtv you know "+yida.equalsIgnoreCase(y.substring(y.length()-yida.length())));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	System.out.print("\n");
	System.out.print("\n");
	y+=" ";
	System.out.println("add hidden space"+y);
	for(int i=0;i<y.length();i++){
		char caca= y.charAt(i);
		System.out.print(caca+" ");	
			}
		System.out.print("\n");
		for(int i=0;i<y.length();i++){
		System.out.print(i+" ");	
			}
		System.out.print("\n");
	
	System.out.println("trim() to remove extra spaces\t="+y.trim());// probably not gonna be used
	
	
	
	
	
	
	
	
	
	
	}

}
