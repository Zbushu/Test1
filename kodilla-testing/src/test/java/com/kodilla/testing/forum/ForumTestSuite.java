package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;
import org.junit.runners.AllTests;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is beguning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        //When
        forumUser.addPost("kowalsky", "Lubie placki");
        //Then
        Assert.assertEquals(1, forumUser.getPostsQuanity());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        //When
        forumUser.addComment(thePost, "kowalsky", "Z ketchupem też");
        //Then
        Assert.assertEquals(1, forumUser.getCommentQuanity());
    }

    @Test
    public void testGetTest() {
        //given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        ForumComment theComment = new ForumComment(thePost, "Z ketchupem też", "kowalsky");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrievedComment = forumUser.getComment(0);
        //Then
        Assert.assertEquals(theComment, retrievedComment);

    }

    @Test
    public void testRemovePostNotExisting() {
        //given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovingCommentNotExisting() {
        //given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        ForumComment theComment = new ForumComment(thePost, "Z ketchupem też", "kowalsky");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentQuanity());
    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("Jan Kowalski", "kowalsky");
        ForumPost thePost = new ForumPost("hello" + "Lubie placki", "kowalsky");
        ForumComment theComment = new ForumComment(thePost, "Z ketchupem też", "kowalsky");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentQuanity());
    }
}
