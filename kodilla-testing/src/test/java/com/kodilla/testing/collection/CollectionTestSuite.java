package com.kodilla.testing.collection;
import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        assertTrue(emptyList.isEmpty());

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numberlist = new ArrayList<>();
        numberlist.add(2);
        numberlist.add(3);
        numberlist.add(4);


        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(numberlist);
        System.out.println(numberlist);
        Assert.assertEquals(2, numberlist.size());
    }
}
