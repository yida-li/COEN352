package resizableArray;



public class ArrayStackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		ArrayStackage sf= new ArrayStackage();
		sf.push("Abedical");
		sf.push(" ");
		sf.push("Dadilion");
		sf.push("Helenium");
		sf.push("Canvas");
		System.out.println(sf.yida.length);
		
		
		
		
	}
		private String [] yida;
		private int N= 0; // clearly a counter

		public ArrayStackage(){
			yida= new String[8]; // 8-16-32-64 and so on.....
			
		}
		public boolean isEmpty() {
			
			return N==0;
		}
		public void push(String item) {
			if( N==yida.length)
				resize(2*yida.length);
			yida[N++]=item;  // puts string item inside string array yida all while simutaneously incrementing the N
		}
		private void resize(int capacity) {
			String[] copy= new String[capacity];
			for(int i=0;i<N;i++) {
				copy[i]=yida[i];
			}
			yida= copy;
			
		}
		
		public String pop() {
			String item = yida[--N]; // obviously decrements the array because of pop
			yida[N]=null;  // at the same time for good programing practice clear N
			
			if(N>0 && N == yida.length/4) resize(yida.length/2);
			// array is between 25% to 100% full
			
			return item;   
		}
		
		
}