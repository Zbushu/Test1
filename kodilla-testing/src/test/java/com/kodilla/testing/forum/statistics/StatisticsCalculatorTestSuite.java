package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;
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
        assertEquals(100,statisticsCalculator.getUsers());
        assertEquals(0,statisticsCalculator.getPosts());
        assertEquals(1,statisticsCalculator.getComments());
        assertEquals(0,statisticsCalculator.getPostsPerUser(),0.0);
        assertEquals(0.01,statisticsCalculator.getCommentsPerUser(),0.0);
        assertEquals(0,statisticsCalculator.getCommentsPerPost(),0.0);

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
        assertEquals(100,statisticsCalculator.getUsers());
        assertEquals(1000,statisticsCalculator.getPosts());
        assertEquals(10,statisticsCalculator.getComments());
        assertEquals(10.0,statisticsCalculator.getPostsPerUser(),0.0);
        assertEquals(0.01,statisticsCalculator.getCommentsPerUser(),0.1);
        assertEquals(0.01,statisticsCalculator.getCommentsPerPost(),0.0);

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
        assertEquals(100,statisticsCalculator.getUsers());
        assertEquals(1000,statisticsCalculator.getPosts());
        assertEquals(0,statisticsCalculator.getComments());
        assertEquals(10,statisticsCalculator.getPostsPerUser(),0.0);
        assertEquals(0,statisticsCalculator.getCommentsPerUser(),0.0);
        assertEquals(0,statisticsCalculator.getCommentsPerPost(),0.0);

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
        int comments = 570;

        when(statisticMock.usersNames()).thenReturn(users);
        when(statisticMock.postsCount()).thenReturn(posts);
        when(statisticMock.commentsCount()).thenReturn(comments);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        //When
        statisticsCalculator.calculateAdvStatistics(statisticMock);
        //Then
        assertEquals(100,statisticsCalculator.getUsers());
        assertEquals(1000,statisticsCalculator.getPosts());
        assertEquals(570,statisticsCalculator.getComments());
        assertEquals(10.0,statisticsCalculator.getPostsPerUser(),0.1);
        assertEquals(5.7,statisticsCalculator.getCommentsPerUser(),0.1);
        assertEquals(0.57,statisticsCalculator.getCommentsPerPost(),0.1);

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
        assertEquals(100,statisticsCalculator.getUsers());
        assertEquals(10,statisticsCalculator.getPosts());
        assertEquals(1000,statisticsCalculator.getComments());
        assertEquals(0.1,statisticsCalculator.getPostsPerUser(),0.0);
        assertEquals(10,statisticsCalculator.getCommentsPerUser(),0.0);
        assertEquals(100,statisticsCalculator.getCommentsPerPost(),0.0);

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
        assertEquals(0,statisticsCalculator.getUsers());
        assertEquals(1000,statisticsCalculator.getPosts());
        assertEquals(10,statisticsCalculator.getComments());
        assertEquals(0,statisticsCalculator.getPostsPerUser(),0.0);
        assertEquals(0,statisticsCalculator.getCommentsPerUser(),0.0);
        assertEquals(0.01,statisticsCalculator.getCommentsPerPost(),0.0);

    }
}
