public class raindropAdvanced {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        

        // constraints 
        // 1 <= array length <= 20000
        // 0 <= array[N] <= 100000
   
        int array[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        
        if (array.length==0 || array.length>20000) System.out.println("fail");
        

        // using 2 point of reference to save time complexity
        int leftPointer = 0, rightPointer = array.length-1; 
        int HighestLeft=0, HighestRight=0; 
        int total = 0; 


        // iterate by moving the pointer towards one another
        while (leftPointer < rightPointer) {

            if (array[leftPointer] > HighestLeft || array[leftPointer]<100001) 
                {
                    HighestLeft = array[leftPointer]; 
                }
            if (array[rightPointer] > HighestRight || array[rightPointer]<100001) 
                {
                    HighestRight = array[rightPointer];
                }    
                
            
            // the volume for the water dropplet in that index is merely Minimum height between the highest right and highest left minus its own
            // if the left side has the the lowest height, we dont care about the highest height the on right because clearly there we dont want an overflow
            // hence the water dropplet at the index point would equal highestLeft minus the actual height of the point
            // increment the pointer or in layman's term, shift leftPointer
            if (HighestLeft < HighestRight) {
                total += (HighestLeft-array[leftPointer]); 
                leftPointer++; 
            } 
                        
            // now if the right side has the the lowest height, we dont care about the highest height the on left
            // hence the water dropplet at the index point would equal highestRight minus the actual height of the point
            // decrement the pointer or in layman's term, shift rightPointer
            else {
                total += (HighestRight-array[rightPointer]); 
                rightPointer--; 
            }
        }
        System.out.println("The total amount of water trapped would equal "+total);
	}



}
