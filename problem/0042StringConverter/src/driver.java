class driver{ 
 
public static void main(String[] args) 
{ 
    String s = "123";
    int integ = 0;
    double doubl=0;
      
        
    for(int i = 0; i < s.length(); i++) {  

            integ = integ * 10 + ((int)s.charAt(i) - 48); 
            doubl = doubl * 10.00 + ((double)s.charAt(i) - 48); 
        

    }
    System.out.println(((Object)integ).getClass().getSimpleName());
    System.out.println(((Object)doubl).getClass().getSimpleName());
} 
} 
