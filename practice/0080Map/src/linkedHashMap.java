
import java.util.*; 
public class linkedHashMap {
  
   
    public static void main(String args[]) 
    { 

        LinkedHashMap<String, Integer> paradigm = new LinkedHashMap<String, Integer>(); 
  
        paradigm.put("y", null);
        paradigm.put("i", 400); 
        paradigm.put("d", 400);
        paradigm.put("a", 400);
        paradigm.put("null", 100); 
        paradigm.put("L", 300); 
        paradigm.put("I", null); 

        
          

        for (Map.Entry<String, Integer> train : paradigm.entrySet()) { 

            System.out.print(train.getKey() + ":"); 
            System.out.println(train.getValue()); 
        } 
    }   
}
