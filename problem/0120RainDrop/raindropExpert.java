public class raindropExpert {
    



    public static void main(String[] args) {
		// TODO Auto-generated method stub
        

        int total=0;
        int north,south,east,west;

        int array[][]= {{12,13,1,12},{13,4,13,12},{13,8,10,12},{12,13,12,12},{13,13,13,13}};


        int m = array.length;
        int n = array[0].length;
        int[][] transposedMatrix = new int[n][m];

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < m; y++) {
                transposedMatrix[x][y] = array[y][x];
            }
        } 


        if (array.length==0 || array.length < 3){
            System.out.println("thats a fail");
        }

   
        for (int i=1;i<array.length-1;i++){

            for (int j=1;j<array[i].length-1;j++){
                System.out.println("The height is "+ array[i][j]+" at "+i+","+j);
                west=array[i][j];
                east=array[i][j];
                south=array[i][j];
                north=array[i][j];

     

                // find the highest number on the south side(bottom)
                for(int u=i;u<transposedMatrix[j].length;u++){
                    if(transposedMatrix[j][u]>south){
                        south=transposedMatrix[j][u];
                    }
                }

                // find the highest number on the north side(top)
                for(int k=i;k>0;){
                    if(transposedMatrix[j][--k]>north){
                        north=transposedMatrix[j][k];
                    }
                }                

                // find the highest number on the west side(left)
                for(int k=j;k>0;){
                    if(array[i][--k]>west){
                        west=array[i][k];
                    }
                }
                // find the highest number on the east side(right)
                for(int k=j;k<array[i].length;k++){
                    if(array[i][k]>east){
                        east=array[i][k];
                    }
                }

                System.out.println("Highest number to the left is "+west+" and the highest number to the right is "+east);
                System.out.println("Highest number to the south is "+south+" and the highest number to the north is "+north);


                // under the condition that each side is higher than the original block, or else water gonna leak duh
                if(west>array[i][j] && east >array[i][j] && north >array[i][j] && south>array[i][j]){
                
                System.out.println("total of the block is :"+(Math.min(Math.min(west, east), Math.min(north, south))-array[i][j]));
                total+=(Math.min(Math.min(west, east), Math.min(north, south))-array[i][j]);
                }


            }
            System.out.println("\n\n");  
            
            
            
           
        }     
        System.out.println("Total volume is "+total);
	}




}
