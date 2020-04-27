package com.kod.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private TrackStatistics trackStatistics;
    private Statistics statistics;

    @Before
    public void before() {
        System.out.println("Test case: begin");

        trackStatistics = new TrackStatistics();
        statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(1000);
        List<String> list = generateListOfStrings(100);
        when(statistics.usersNames()).thenReturn(list);
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostsEqualsZero(){
        //Given
        when(statistics.postsCount()).thenReturn(0);

        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(0, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(0, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(10, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(0,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostsEqualsThousands(){
        //Given
        when(statistics.postsCount()).thenReturn(1000);

        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(10, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(10, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(1,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsEqualsZero(){
        //Given
        when(statistics.commentsCount()).thenReturn(0);

        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(0, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(10, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(0, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(0,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsLesserThanNumberOfPosts(){
        //Given
        when(statistics.postsCount()).thenReturn(100);
        when(statistics.commentsCount()).thenReturn(10);

        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(100, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(10, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(1, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(0.1, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(0.1,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsGreaterThanNumberOfPosts(){
        //Given
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(100);

        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(10, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(100, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(0.1, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(1, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(10,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersEqualsZero(){
        //Given
        List<String> list = generateListOfStrings(0);
        when(statistics.usersNames()).thenReturn(list);
        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(0, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(0, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(1,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }
    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersEqualsHundred(){
        //Given
        //OR LEAVE IT WITHOUT ANYTHING IN GIVEN BECAUSE IT'S BEEN STARTED WITH 100
        List<String> list = generateListOfStrings(100);
        when(statistics.usersNames()).thenReturn(list);
        //When
        trackStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, trackStatistics.getUsersNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getPostsNumber(),0.0001);
        Assert.assertEquals(1000, trackStatistics.getCommentsNumber(),0.0001);
        Assert.assertEquals(10, trackStatistics.getAverageNumberOfPostsPerUser(),0.0001);
        Assert.assertEquals(10, trackStatistics.getAverageNumberOfCommentsPerUser(),0.0001);
        Assert.assertEquals(1,trackStatistics.getAverageNumberOfCommentsPerPost(),0.0001);
    }

    private List<String> generateListOfStrings(int number) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < number; i++) {
            list.add("User" + i);
        }
        return list;
    }

}
