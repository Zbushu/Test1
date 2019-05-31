package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    private static int testCounter;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("fakeUser");
        }
        int posts = 0;
        int comments = 1;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(100,statisticsCalculator.getUsers());
        Assert.assertEquals(0,statisticsCalculator.getPosts());
        Assert.assertEquals(1,statisticsCalculator.getComments());
        Assert.assertEquals(0,statisticsCalculator.getPostsPerUser());
        Assert.assertEquals(0,statisticsCalculator.getCommentsPerUser());
        Assert.assertEquals(0,statisticsCalculator.getCommentsPerPost());

    }
    @Test
    public void testCalculateAdvStatisticsThousandPosts(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("fakeUser");
        }
        int posts = 1000;
        int comments = 10;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(100,statisticsCalculator.getUsers());
        Assert.assertEquals(1000,statisticsCalculator.getPosts());
        Assert.assertEquals(10,statisticsCalculator.getComments());
        Assert.assertEquals(1000 / 100,statisticsCalculator.getPostsPerUser());
        Assert.assertEquals(10 / 100,statisticsCalculator.getCommentsPerUser());
        Assert.assertEquals(10 / 1000,statisticsCalculator.getCommentsPerPost());

    }
    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("fakeUser");
        }
        int posts = 1000;
        int comments = 0;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(100,statisticsCalculator.getUsers());
        Assert.assertEquals(1000,statisticsCalculator.getPosts());
        Assert.assertEquals(0,statisticsCalculator.getComments());
        Assert.assertEquals(1000 / 100,statisticsCalculator.getPostsPerUser());
        Assert.assertEquals(0 ,statisticsCalculator.getCommentsPerUser());
        Assert.assertEquals(0,statisticsCalculator.getCommentsPerPost());

    }
    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPosts(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("fakeUser");
        }
        int posts = 1000;
        int comments = 10;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(100,statisticsCalculator.getUsers());
        Assert.assertEquals(1000,statisticsCalculator.getPosts());
        Assert.assertEquals(10,statisticsCalculator.getComments());
        Assert.assertEquals(1000 / 100,statisticsCalculator.getPostsPerUser());
        Assert.assertEquals(10 / 100,statisticsCalculator.getCommentsPerUser());
        Assert.assertEquals(10 / 1000,statisticsCalculator.getCommentsPerPost());

    }
    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            users.add("fakeUser");
        }
        int posts = 10;
        int comments = 1000;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(100,statisticsCalculator.getUsers());
        Assert.assertEquals(10,statisticsCalculator.getPosts());
        Assert.assertEquals(1000,statisticsCalculator.getComments());
        Assert.assertEquals(10 / 100,statisticsCalculator.getPostsPerUser());
        Assert.assertEquals(1000 / 100,statisticsCalculator.getCommentsPerUser());
        Assert.assertEquals(1000 / 10,statisticsCalculator.getCommentsPerPost());

    }
    @Test
    public void testCalculateAdvStatisticsZeroUsers(){
        //Given
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<String>();
        int posts = 1000;
        int comments = 10;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        Assert.assertEquals(0,statisticsCalculator.getUsers());
        Assert.assertEquals(1000,statisticsCalculator.getPosts());
        Assert.assertEquals(10,statisticsCalculator.getComments());
        Assert.assertEquals(0,statisticsCalculator.getPostsPerUser());
        Assert.assertEquals(0,statisticsCalculator.getCommentsPerUser());
        Assert.assertEquals(10 / 1000,statisticsCalculator.getCommentsPerPost());

    }
}
