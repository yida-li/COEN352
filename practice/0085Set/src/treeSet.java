import java.util.Comparator; 
import java.util.*;


class Helper implements Comparator<String> { 
  
    // Method 
    // To compare two strings 
    public int compare(String str1, String str2) 
    { 
        return str1.compareTo(str2); 
    } 
} 

public class treeSet {
    public static void main(String[] args)
    {
        // Creating object of Set of type String
        TreeSet<String> pokeBall = new TreeSet<String>(new Helper());
 

        pokeBall.add("Pikach");
        pokeBall.add("Rayquaza");
        pokeBall.add("Mewtwo");
        pokeBall.add("Blazeken");
        pokeBall.add("Blazeken");
        pokeBall.add("Alakazam");// will be first because alphabet A is first:)()

        Iterator<String> i = pokeBall.iterator();

        while (i.hasNext()){
          System.out.println(i.next());
        }
           
            
    }  
}
