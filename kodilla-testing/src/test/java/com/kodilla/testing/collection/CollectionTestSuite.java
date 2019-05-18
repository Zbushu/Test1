package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;


public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList= new ArrayList<Integer>();
        assertTrue(emptyList.isEmpty());

}
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminated(normalList);

        ArrayList<Integer> result = exterminator.getExterminate();
        for(int even: result) {

            System.out.println(even);

            Assert.assertEquals(2, result.size());
        }
    }
}
