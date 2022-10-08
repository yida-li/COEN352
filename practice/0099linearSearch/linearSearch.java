import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner in = new Scanner(System.in);
        
    System.out.print("Which number are we searching for");
    int key = in.nextInt();

        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,224,12445,124241};

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("found at position "+i);
                break;

            }

        }
        


        in.close();

}
}
