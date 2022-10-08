import java.util.Scanner;
public class bisearch {
    public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner in = new Scanner(System.in);
        
    System.out.print("Which number are we searching for");
    int key = in.nextInt();

        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,224,12445,124241};

        boolean found=false;
        int low=0;
        int high = arr.length-1;
        
        while(!found){
        int mid=(low+high)/2;
        if(arr[mid]<key)low=mid;
        else if(arr[mid]>key)high=mid;
        else if(arr[mid]==key){

          System.out.println("found at"+mid);
          found=true;
        }
        }
        in.close();

}
}