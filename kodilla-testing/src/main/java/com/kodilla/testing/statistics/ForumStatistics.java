package com.kodilla.testing.statistics;

public class ForumStatistics {
    private int numberOfUsers;
    private int numberOfPost;
    private int numberofComments;
    private double postPerUser;
    private double commentsPerUser;
    private double commentsPerPost;
    private Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPost = statistics.postsCount();
        numberofComments = statistics.commentsCount();
        if (numberOfUsers!=0 && numberOfUsers!=0){
            postPerUser = numberOfPost/numberOfUsers;
        }else{
            postPerUser = 0;
        }
        if (numberofComments != 0 && numberOfUsers!=0){
            commentsPerUser = numberofComments/numberOfUsers;
        }else{
            commentsPerUser = 0;
        }
        if (numberOfPost!=0){
            commentsPerPost = numberofComments/numberOfPost;
        }else{
            commentsPerPost = 0;
        }

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPost() {
        return numberOfPost;
    }

    public int getNumberofComments() {
        return numberofComments;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
