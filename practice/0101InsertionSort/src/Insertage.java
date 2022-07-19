
public class Insertage {

	public static void main(String[] args) {
	
		
		
		
		int[] arr= {4,7,1,24,14,60,2,13};
		
		int n= arr.length;
		
	
		for(int i=1;i<n;++i) {
			
				int index = arr[i];
					int j= i-1;
			
					while( j>=0 && arr[j] >index){
				     arr[j+1]= arr[j];
				     j= j-1;
				
			}
			arr[j+1]= index;
			
		}
		
		for( int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		} 
		

	}

}
