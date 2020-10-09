
public class yida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.out.println(saySomething());
		
		// run as- configuration -> input arguments to args hehehehhee
		for(int i=0; i<args.length; i++)        // a for loop from 0 to length of args in terms of how many string char it holds?
			System.out.println(i +": " + args[i]);
		
		
	}
	public static String saySomething() {
		return "Hello, this is the first serious java code\n"
		+" from eclipse, in order to access the contents of Strin[] args,\n"
		+" go into run-> run configuration-> arguments\n"
		+" remember that time during the summer, the ta tried so hard to explain this procedure?, gave us a brain aneurysm";
	}
	    
	}