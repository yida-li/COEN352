package SymbolTableList;

public class driver {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	linklist se= new linklist();
	se.insert(233, "A");
	se.insert(2, "B");
	se.insert(32, "C");
	se.insert(17, "D");
	se.insert(88, "E");
	
	

	System.out.println(se.printString());
	System.out.println("Searching :" +se.search("Acc"));
	se.remove("b");
	
	System.out.println(se.printString());
	
	}
}
