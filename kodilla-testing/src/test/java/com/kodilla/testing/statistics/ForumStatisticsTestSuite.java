package com.kodilla.testing.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    //    gdy liczba postów = 0,
//    gdy liczba postów = 1000,
//    gdy liczba komentarzy = 0,
//    gdy liczba komentarzy < liczba postów,
//    gdy liczba komentarzy > liczba postów,
//    gdy liczba użytkowników = 0,
//    gdy liczba użytkowników = 100.
    @Test
    public void TestStatisticsZeroPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> userNames = new ArrayList<>();
        userNames.add("User1");
        userNames.add("User2");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostPerUser(), 0.001);
        Assert.assertEquals(5, forumStatistics.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getCommentsPerPost(), 0.001);
    }

    @Test
    public void TestStatistics1000Post() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> userNames = new ArrayList<>();
        userNames.add("User1");
        userNames.add("User2");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500, forumStatistics.getPostPerUser(), 0.001);
        Assert.assertEquals(5, forumStatistics.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getCommentsPerPost(), 0.001);
    }

    @Test
    public void TestMorePostThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        List<String> userNames = new ArrayList<>();
        userNames.add("User1");
        userNames.add("User2");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500, forumStatistics.getPostPerUser(), 0.001);
        Assert.assertEquals(250, forumStatistics.getCommentsPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getCommentsPerPost(), 0.001);
    }

    @Test
    public void TestMoreCommentsThanPost() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        List<String> userNames = new ArrayList<>();
        userNames.add("User1");
        userNames.add("User2");
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(250, forumStatistics.getPostPerUser(), 0.001);
        Assert.assertEquals(500, forumStatistics.getCommentsPerUser(), 0.001);
        Assert.assertEquals(2, forumStatistics.getCommentsPerPost(), 0.001);

    }

    @Test
    public void TestStatistics0User() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, forumStatistics.getPostPerUser(), 0.001);
        Assert.assertEquals(0, forumStatistics.getCommentsPerUser(), 0.001);
        Assert.assertEquals(1, forumStatistics.getCommentsPerPost(), 0.001);
    }

    @Test
    public void TestStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        List<String> userNames = new ArrayList<>();
        for(int i =  1; i <= 100; i++) {
            userNames.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, forumStatistics.getPostPerUser(), 0.001);
        Assert.assertEquals(10, forumStatistics.getCommentsPerUser(), 0.001);
        Assert.assertEquals(1, forumStatistics.getCommentsPerPost(), 0.001);
    }
}
