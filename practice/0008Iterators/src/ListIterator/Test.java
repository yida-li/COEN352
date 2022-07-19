package ListIterator;// Java program to demonstrate ListIterator 
import java.util.ArrayList; 
import java.util.ListIterator; 
  
public class Test 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        for (int i = 0; i < 10; i++) 
            al.add(i); 
  
        System.out.println(al); 
  
        // at beginning ltr(cursor) will point to 
        // index just before the first element in al 
        ListIterator<Integer> ltr = al.listIterator(); 
  
        // checking the next element availabilty 
        while (ltr.hasNext()) 
        { 
            //  moving cursor to next element 
            int i = (Integer)ltr.next(); 
  
            // getting even elements one by one 
            System.out.print(i + " "); 
  
            // Changing even numbers to odd and 
            // adding modified number again in  
            // iterator 
            if (i%2==0) 
            { 
                i++;  // Change to odd 
                ltr.set(i);  // set method to change value 
                ltr.add(i);  // to add 
            } 
        } 
        System.out.println(); 
        System.out.println(al); 
    } 
}