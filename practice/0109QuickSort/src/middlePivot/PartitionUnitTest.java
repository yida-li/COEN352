package coen352.ch07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionUnitTest {
    //initialize arrays to verify the 4 test cases for the function int partition(E[] A, int l, int r, E pivot)
    public static Integer t1[]= new Integer[]{69,240,229,3,97,96};
    public static Integer t2[]= new Integer[]{69,240,229,3,95,96};
    public static Integer t3[]= new Integer[]{10,240,229,3,97,96};
    public static Integer t4[]= new Integer[]{100,240,229,3,95,96};
    public static int pivot=96;

    @BeforeAll
    public static void setUp()
    {

    }

    //All assertEqual expected values calculated prior

    @Test
    public void TestCase1()
    {
        int k=QuickSort.partition(t1,-1,t1.length-2,pivot);
        assertEquals(2,k);
    }


    @Test
    public void TestCase2()
    {
        int k=QuickSort.partition(t2,-1,t2.length-2,pivot);
        assertEquals(2,k);
    }


    @Test
    public void TestCase3()
    {
        int k=QuickSort.partition(t3,-1,t3.length-2,pivot);
        assertEquals(2,k);
    }

    @Test
    public void TestCase4()
    {
        int k=QuickSort.partition(t4,-1,t4.length-2,pivot);

        assertEquals(1,k);

    }






}
