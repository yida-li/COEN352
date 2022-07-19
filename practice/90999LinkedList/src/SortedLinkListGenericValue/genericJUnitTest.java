package SortedLinkListGenericValue;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class genericJUnitTest {

    private static generic<String, Integer> testlist;
    /**
     * This method is automatically called once before each test case method,
     * so that all the variables are cleanly initialized for each test.
     */
    @BeforeAll
    public static void setUp()
    {
        testlist= new generic<String, Integer>();
    }


    @Test
    public void testInsert1()
    {
        testlist.insert("Pikachu", 450);
        testlist.insert("Bulbasaur", 230);
        assertEquals("Bulbasaur 230  \nPikachu 450\n", testlist.printString());
    }
    @Test
    public void testRemove()
    {
        testlist.insert("Squirtle", 550);
        testlist.remove("Squirtle");
        assertEquals("Bulbasaur 230  \nPikachu 450\n", testlist.printString());
    }
    @Test
    public void testCompare()
    {
        assertEquals(-14 , testlist.compare("Bulbasaur","Pikachu"));
    }
    @Test
    public void testSearch()
    {
        assertEquals("Value associated with the Key Bulbasaur is :230", testlist.Search("Bulbasaur"));
    }


}
