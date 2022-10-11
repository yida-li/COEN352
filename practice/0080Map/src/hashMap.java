import java.util.*; 
public class hashMap {
  
   
    public static void main(String args[]) 
    { 

        Map<String, Integer> paradigm = new HashMap<String, Integer>(); 
  
        /* 
        mapObject.values()
        mapObject.keySet()
        mapObject.headMap(3)
        mapObject.clear()
        mapObject.containsKey(Object)
        mapObject.containsValue(Object) 
        mapObject.equals(Object)
        mapObject.get(Object)
        mapObject.hashCode()
        mapObject.isEmpty()
        mapObject.keySet()
        mapObject.size()
        mapObject.remove(Object)
        mapObject.putAll(Map)
        */
        paradigm.put("y", 100); 
        paradigm.put("l", null); 
        paradigm.put("d", 300); 
        paradigm.put("a", 400);
        paradigm.put("null", 400); 
        paradigm.put("I", 400); 
        paradigm.put("i", null);  
  
        
        for (Map.Entry<String, Integer> me : 
             paradigm.entrySet()) { 
  
            // Printing keys 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
    }   
}
