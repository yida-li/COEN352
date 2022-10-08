class YidaStatic {

    // static member
    static int strength = 10;
    
    // instance(non-static) member
    int agility = 20;
    
    // private member
    private static int defence = 30;


    // non-static method
    int dynamic(int x, int y){
        return x * y;
    }

    // static method
    static int idle(int x, int y){
        return x + y;
    }

    static class StaticNestedClass
    {         
        void display()
        {
            // can access static member of outer class
            System.out.println("strength = " + strength);
             
            // can access display private static member of outer class
            System.out.println("defence = " + defence);
             
            // The following statement will give compilation error
            // as static nested class cannot directly access non-static members
            // System.out.println("agility = " + agility);
         
        }
    }
    // inner class
    class InnerClass
    {
        void display()
        {
            // can access static member of outer class
            System.out.println("strength = " + strength);
            
            // can also access non-static member of outer class
            System.out.println("agility = " + agility);
            
            // can also access a private member of the outer class
            System.out.println("defence = " + defence);
        
        }
    }
}

public class Main {

   public static void main( String[] args ) {


    
        // Static methods can be accessed without creating an object of a class
        System.out.println(YidaStatic.idle(12,12));

        // But for non-static tis different
        YidaStatic yidaObject = new YidaStatic();
        System.out.println(yidaObject.dynamic(12,12));



        System.out.println("\nCreate an instance of the static mested class");
        YidaStatic.StaticNestedClass nestedYidaObject= new YidaStatic.StaticNestedClass();
        nestedYidaObject.display();

        
        System.out.println("\nCreate an instance of the inner class, clearly different initialization");
        YidaStatic.InnerClass innerObject= yidaObject.new InnerClass();
        innerObject.display();
   }
}