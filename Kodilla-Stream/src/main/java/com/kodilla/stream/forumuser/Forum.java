package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser>userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"user1", 'M', LocalDate.of(1990,1,1),100));
        userList.add(new ForumUser(2,"user2", 'M', LocalDate.of(1992,2,2),0));
        userList.add(new ForumUser(3,"user3", 'F', LocalDate.of(1993,3,3),100));
        userList.add(new ForumUser(4,"user4", 'F', LocalDate.of(1994,4,4),100));
        userList.add(new ForumUser(5,"user5", 'M', LocalDate.of(2009,5,5),100));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
