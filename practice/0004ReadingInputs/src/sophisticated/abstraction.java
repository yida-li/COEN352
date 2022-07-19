package sophisticated;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class abstraction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader Yidaconsole = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("How old are you?");
		
			// basically since i've decided to cinlude the bufferReader package, i initialize yidaconsole which is an object of bufferREader
				// and inputStreamReaderclass connects to input stream of keyboard..
		
		
					// no need to ask unimportant questions, just treat this as stream insertion operator from c++,
					
		String input = Yidaconsole.readLine();  //It is used for reading a line of text.
												
		
		System.out.println(input);
		
		
	}

}
