package com.kodilla.testing.forum.statistics;

import java.util.List;


public class StatisticsCalculator {
    int users;
    int posts;
    int comments;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        List<String>usersList = statistics.usersNames();
        users = usersList.size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (users != 0){
            postsPerUser = (double) posts / users;
        } else {
            postsPerUser = 0.0;
        }
        if (users !=0){
            commentsPerUser = (double) comments / users;
        } else {
            commentsPerUser = 0.0;
        }
        if (posts != 0){
            commentsPerPost =(double)comments / posts;
        } else {
            commentsPerPost = 0.0;
        }
    }

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
