package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {
    int users;
    int posts;
    int comments;
    int postsPerUser;
    int commentsPerUser;
    int commentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        List<String>usersList = statistics.usersNames();
        users = usersList.size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        if (users != 0){
            postsPerUser = posts / users;
        } else {
            postsPerUser = 0;
        }
        if (users !=0){
            commentsPerUser = comments / users;
        } else {
            commentsPerUser = 0;
        }
        if (posts != 0){
            commentsPerPost = comments / posts;
        } else {
            commentsPerPost = 0;
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

    public int getPostsPerUser() {
        return postsPerUser;
    }

    public int getCommentsPerUser() {
        return commentsPerUser;
    }

    public int getCommentsPerPost() {
        return commentsPerPost;
    }
}
