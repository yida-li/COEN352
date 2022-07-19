
public class Selectation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {4,1,2,244,12,53,124,543};
		
		
		int size= arr.length;
		
		for( int i=0;i<size-1;i++) {
			
			int key=i;
			
			for( int j=i+1;j<size;j++) {
				
				
				
				if( arr[j]<arr[key])
					key=j;
			}
			int tempo= arr[key];
			
			arr[key]= arr[i];
			arr[i]= tempo;
			
		}
		
		
		for ( int yida=0;yida<size;yida++)
			System.out.println(arr[yida]);
		
	}

}
