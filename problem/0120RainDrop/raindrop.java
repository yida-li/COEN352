public class raindrop {
    public static void main(String[] args) {
		// TODO Auto-generated method stub


        int leftIndex=0;
        int rightIndex=0;
        int total=0;
   
        int array[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        

        for (int i=0;i<array.length;i++){
          

            leftIndex=array[i];
            rightIndex=array[i];

            // for finding the highest element of the left side
            for (int j=i;j>=0;j--){
   
            if(array[j]>leftIndex){
                leftIndex=array[j];
                //System.out.println("left"+leftIndex);
                
            }
            
            }
            // for finding the highest element of the right side
            for (int k=i;k<array.length;k++){
   
                if(array[k]>rightIndex){
                    rightIndex=array[k];
                    //System.out.println("right"+rightIndex);
                }
                
            }
            if(leftIndex>array[i] && rightIndex >array[i]){
                System.out.println("at the position "+i+" with a height of "+array[i]);
                System.out.println("the left highest is "+leftIndex+" and the right highest is : "+rightIndex);
                System.out.println("Then the total amount of water trapped within these would equal"+(Math.min(leftIndex, rightIndex)-array[i]+"\n\n"));
                total+=(Math.min(leftIndex, rightIndex)-array[i]);
            }

            //

            
        }
        System.out.println("The total amount of water trapped would equal "+total);
	}

}
