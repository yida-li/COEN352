package ch07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortUnitTest {


    //initialize random array
    public static Integer a[]= new Integer[]{1,6,2,3,4,5,7,8};

    //initialize array to hold the sequence for each cases
    public static Integer worseCase[]=new Integer[a.length];
    public static Integer bestCase[]=new Integer[a.length];
    public static Integer averageCase[]=new Integer[a.length];

    //initialize highest,lowest,and average value for the partitions
    public static int highestPartition=0;
    public static int lowestPartition=10000;
    public static int averagePartition=0;


    @BeforeAll
    public static void setUp()
    {

        //Nvidia RTX 2060 can perform 100000 trials in 143 millisecond
        //Please set total below 10000 if your device do not possess a gpu
        int total=100000;
        //2D array to hold the trial number, and its respective array sequence
        Integer[][]tempArray=new Integer[total][a.length];
        //2D array to hold the trial number and how much partition it takes
        int reference[][]= new int[total][1];



        // Line 37- 75 : Measuring the highest/lowest possible partition and store its sequence
        for(int trials=0;trials<total;trials++){
            //randomize sampling array
            QuickSort.permute(a);
            for(int i=0;i<a.length;i++) {
                tempArray[trials][i]=a[i];
            }
            QuickSort.sort(a);
            reference[trials][0]=QuickSort.counter;
            if (QuickSort.counter>highestPartition){
                highestPartition=QuickSort.counter;
            }
            else if(QuickSort.counter<lowestPartition){
                lowestPartition=QuickSort.counter;
            }
            QuickSort.counter=0;
        }
        highestPartition=highestPartition-3;
        int semaphore1=1;
        int semaphore2=1;
        int unit=0;
        while(semaphore1 + semaphore2 > 0){
            if(reference[unit][0]==lowestPartition && semaphore1>0){
                System.out.println("\nThe lowest number of partitions required is : "+lowestPartition+"");
                for(int i=0;i<a.length;i++){
                    System.out.print(tempArray[unit][i]+" ");
                    bestCase[i]=tempArray[unit][i];
                }
                semaphore1--; //semaphore--;
            }
            if(reference[unit][0]==highestPartition && semaphore2>0){
                System.out.println("\nThe highest number of partitions required is : "+(highestPartition+3)+" ");
                for(int i=0;i<a.length;i++){
                    System.out.print(tempArray[unit][i]+" ");
                    worseCase[i]=tempArray[unit][i];
                }
                semaphore2--; //semaphore--;
            }
            unit++;
        }

        // Line 77-97 : Measuring the average by calculating the sum total of all trials
        int sumPartitions=highestPartition-lowestPartition+1;
        //System.out.println();
        int yida = sumPartitions+3;

        int partitions[][]= new int[yida][1];
        for (int p=0;p<yida;p++){
            partitions[p][0]=0;
        }
        for ( int i=0;i<total;i++){
            for(int j=0;j<partitions.length;j++){
                if (reference[i][0]==sumPartitions+j) {
                    partitions[j][0]++;
                }
            }
        }
        int averagePartitionNumber=0;

        for(int i=0;i<yida;i++){
            System.out.print("\n"+partitions[i][0]+"/"+total+" cases takes "+(sumPartitions+i)+" partitions");
            if(partitions[i][0]>averagePartitionNumber)
            {averagePartitionNumber=partitions[i][0];
                averagePartition=(sumPartitions+i);
            }
        }
        System.out.println("\nAverage partition is :"+averagePartition+"\n");


        // Line 101-116 : Find a random sequence with the average partition case
        int temp[]=new int[a.length];
        boolean flag=true;
        while(flag){
            QuickSort.permute(a);
            for(int j=0;j<a.length;j++){
                temp[j]=a[j];
            }
            QuickSort.sort(a);
            if(QuickSort.counter==averagePartition){
                for(int j=0;j<a.length;j++){
                    averageCase[j]=temp[j];
                }
                flag=false;
            }
            QuickSort.counter=0;
        }
    }


    @Test // Testing the quicksort itself
    public void testSort()
    {
        QuickSort.sort(a);
        String temp="";
        for(int i=0;i<a.length;i++) {
            temp+=a[i];
        }
        assertEquals("12345678", temp);
        QuickSort.counter=0;
    }



    @Test // Testing the best perfect Case
    public void bestCaseTest()
    {
        QuickSort.sort(bestCase);
        assertEquals(lowestPartition, QuickSort.counter);
        QuickSort.counter=0;
    }


    @Test // Testing the worse imperfect Case
    public void worseCaseTest()
    {
        QuickSort.sort(worseCase);
        assertEquals(highestPartition, QuickSort.counter);
        QuickSort.counter=0;
    }

    @Test // Testing the generic average Case
    public void averageCaseTest()
    {
        QuickSort.sort(averageCase);
        assertEquals(averagePartition, QuickSort.counter);
        QuickSort.counter=0;
    }





    // Testing the 3 way partition to properly put items
    public static Integer t1[]= new Integer[]{24,44,4,44,1,2,3,44};
    @Test
    public void TestCase1()
    {
        QuickSort.threewaypartition(t1,0,t1.length-1);
        assertEquals(QuickSort.print(t1,t1.length),"  24  3  4  2  1  44  44  44");
    }

    public static Integer t2[]= new Integer[]{24,44,4,2334,1,2,3,44};
    @Test
    public void TestCase2()
    {
        QuickSort.threewaypartition(t2,0,t2.length-1);
        assertEquals(QuickSort.print(t2,t2.length),"  24  3  4  2  1  44  44  2334");
    }

    public static Integer t3[]= new Integer[]{24,22,22,344,44,4,22,2334,12,22,3,22};
    @Test
    public void TestCase3()
    {
        QuickSort.threewaypartition(t3,0,t3.length-1);
        assertEquals(QuickSort.print(t3,t3.length),"  4  3  12  22  22  22  22  22  24  2334  344  44");
    }

    public static Integer t4[]= new Integer[]{24,44,4,2334,1,22,3,22};
    @Test
    public void TestCase4()
    {
        QuickSort.threewaypartition(t4,0,t4.length-1);
        assertEquals(QuickSort.print(t4,t4.length),"  1  3  4  22  22  44  24  2334");
    }

}
