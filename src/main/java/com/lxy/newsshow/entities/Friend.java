package com.lxy.newsshow.entities;

public class Friend {
    String tableFriend;
    Integer friend_ID;

    public String getTableFriend() {
        return tableFriend;
    }

    public void setTableFriend(String tableFriend) {
        this.tableFriend = tableFriend;
    }

    public Integer getFriend_ID() {
        return friend_ID;
    }

    public void setFriend_ID(Integer friend_ID) {
        this.friend_ID = friend_ID;
    }
    public Friend(String tableFriend, Integer friend_ID){
        this.tableFriend = tableFriend;
        this.friend_ID = friend_ID;
    }
}
