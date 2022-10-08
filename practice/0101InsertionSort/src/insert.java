public class insert {
    

   public static void main(String[] args){


    int arr[]={11,2,4,5,6,7,12,2,4,5,2};
    int temp;
    int index;
    for(int x=1;x<arr.length;x++){
        

        
        index=x;
        while(index> 0 && arr[index]<arr[index-1]  ){

        temp=arr[index-1];
        arr[index-1]=arr[index];
        arr[index]=temp;
        index--;    
        }

    }
    
    for(int a:arr)System.out.println(a);
    

   } 
}
