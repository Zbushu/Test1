package com.kodilla.testing.forum;
import java.util.ArrayList;
import java.util.LinkedList;

public class ForumUser {
    private String realName;
    private String name;
    private ArrayList<ForumPost>posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String realName, String name) {
        this.realName = realName;
        this.name = name;
    }
    public void addPost(String author, String postBody) {
    ForumPost thePost = new ForumPost(postBody, author);
    posts.add(thePost);
    }
    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, author, commentBody);
        comments.add(theComment);

    }
    public int getPostsQuanity(){
        return posts.size();
    }
    public int getCommentQuanity(){
        return 100;
    }
    public ForumPost getPost(int postNumber){
        return null;
    }
    public ForumComment getComment(int commentNumber){
        return null;
    }
    public boolean removePost (ForumPost thePost){
        return true;
    }
    public boolean removeComment(ForumComment theComment){
        return true;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
