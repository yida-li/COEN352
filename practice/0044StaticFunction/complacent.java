public class complacent {

    
    public static void main(String arg[]){

        comp.exam(); // static function dont even need object of that class to be instantiated

        //comp.test();  would yield error because the method test is not declared static
        //comp c= new comp(); c.quiz(); would yield error because method quiz is private
        
        comp c= new comp(); //non-static function need the object of that class to be instantiated
        c.assignment();
        c.test();
    }  
}
