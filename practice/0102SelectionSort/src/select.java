public class select {
    

    public static void main(String arg[]){

        
        int arr[]={5,6,7,8,9,1,2,3,4,5,6,};
        int index;
        int smallestnumber;
        for(int i=0;i<arr.length;i++)
            {
            
           index=i;
           smallestnumber=arr[i]; 
           for(int j=i;j<arr.length;j++)
           {

                if(arr[j]<smallestnumber)
                {
            
                smallestnumber=arr[j]; 
                index=j;
                }
            }

            arr[index]=arr[i];
            arr[i]=smallestnumber;
        
            }

        for(int q:arr)System.out.println(q);



    }
}
