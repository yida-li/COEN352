import java.util.*;
public class hashSet {
       // Main driver method
       public static void main(String[] args)
       {
           // Creating object of Set of type String
           Set<String> pokeBall = new HashSet<String>();
    

           pokeBall.add("Pikach");
           pokeBall.add("Rayquaza");
           pokeBall.add("Mewtwo");
           pokeBall.add("Blazeken");
           

           Iterator<String> i = pokeBall.iterator();

           while (i.hasNext()){
             System.out.println(i.next());
           }
              
               
       }
}
