interface yida1{  
    public void sayHello();  
}  
interface yida2{  
    public int calculateInterest(int x,int y,int z); 
} 

public class expression {   
    public static void main(String[] args) {  
    
        
        yida1 yidaObject=()->{  
            System.out.println("Hello world");  
        };  
        yidaObject.sayHello();  


        
        yida2 twotwo=(x,y,z)->(x*y*z);
        System.out.println(twotwo.calculateInterest(2, 1, 3));
        System.out.println(twotwo.calculateInterest(1, 0, 0));
        System.out.println(twotwo.calculateInterest(1, 0, 3));
        System.out.println(twotwo.calculateInterest(1, 0, 2));
        System.out.println(twotwo.calculateInterest(1, 2, 0));

    }  
}  