import javax.swing.JOptionPane;

public class Simplicity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = JOptionPane.showInputDialog("How old are you?");
		int age;
		age = Integer.parseInt(input);
		//if (input != null) age = Integer.parseInt(input);
		String input2 = JOptionPane.showInputDialog("What's the name?");
		
		System.out.println(input);
		System.out.println(input2);
		
	}

}
