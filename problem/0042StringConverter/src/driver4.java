class driver4{ 
 
    public static void main(String[] args) 
    { 
        String s1="Testing to see if this string can be manipulated however i want\n";
        String replicate="";
    for(int i=0;i<s1.length();i++)
    {

    if(s1.charAt(i)==' ')replicate+='#';
    else replicate+=s1.charAt(i);
    }

        System.out.println(s1);
        System.out.println(replicate);
        
    } 
    } 
    