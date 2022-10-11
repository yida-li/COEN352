import java.util.*;
public class linkedHashSet {
    public static void main(String[] args)
    {
        // Creating object of Set of type String
        Set<String> pokeBall = new LinkedHashSet<String>();
 

        pokeBall.add("Pikach");
        pokeBall.add("Rayquaza");
        pokeBall.add("Mewtwo");
        pokeBall.add("Blazeken");
        pokeBall.add("Blazeken");
        

        Iterator<String> i = pokeBall.iterator();

        while (i.hasNext()){
          System.out.println(i.next());
        }
           
            
    }  
}
