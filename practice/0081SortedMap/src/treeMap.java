import java.util.SortedMap; 
import java.util.TreeMap; 
import java.util.Map;
public class treeMap { 
  
    // Essentially a dictionary in order of python equivalent
    public static void main(String args[]) 
    { 

        SortedMap<Integer, String> mapObject = new TreeMap<Integer, String>(); 
  
        
        mapObject.put(3, "d"); 
        mapObject.put(2, "i"); 
        mapObject.put(1, "y"); 
        mapObject.put(4, "a"); 
  
       
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

        
        for (Map.Entry mapElement : mapObject.entrySet()) { 
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue()); 
        } 
        
        
        

    } 
}