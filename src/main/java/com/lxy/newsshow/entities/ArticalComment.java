package com.lxy.newsshow.entities;

public class ArticalComment {
    String tableName;
    Integer articalID;
    Integer like;

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Integer getArticalID() {
        return articalID;
    }

    public void setArticalID(Integer articalID) {
        this.articalID = articalID;
    }
    public ArticalComment(String tableName, Integer ID,Integer like){
        this.tableName = tableName;
        this.articalID = ID;
        this.like = like;
    }
}
