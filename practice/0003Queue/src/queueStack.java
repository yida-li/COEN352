
import java.util.Scanner;
import java.util.Stack;
  
public class queueStack {
   
    public static void main(String[] args) 
    { 

        Stack stack1 = new Stack(); 
        Stack reverseStqack= new Stack();
        int counter=0;

        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();

        while(x!=0)
        {
        counter++;
        stack1.push(x);
        x= sc.nextInt();
        }
        
        
       
        int counter2=counter;
        while(counter>0){
            reverseStqack.push(stack1.pop());
            counter--;   
        }
    
        while(--counter2>=0)
        System.out.print(reverseStqack.pop()+" ");
        
 
}
