public class bubble {
  

    public static void swap(int arr[],int x,int y){
        
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String arg[]){

        int arr[]={5,6,7,8,9,1,2,3,4,5,6,};
    



        for( int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                for(int q:arr)System.out.print(q+" ");  
                System.out.println();  
            }
                

                
            }

        }


        
     
        
    }  
}
