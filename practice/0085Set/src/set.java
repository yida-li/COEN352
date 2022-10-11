

// Java program Illustrating Set Interface
 
// Importing utility classes
import java.util.*;
 
// Main class 
public class set {
   
    
    // Main driver method
    public static void main(String[] args)
    {
        Set<Character> hash_Set = new HashSet<Character>();

        hash_Set.add('2');
        hash_Set.add('V');
        hash_Set.add('2');
        hash_Set.add('#');
        hash_Set.add('B');
 
        // Printing elements of HashSet object
        System.out.println(hash_Set);


    }
}