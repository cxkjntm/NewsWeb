package com.lxy.newsshow.entities;


import javax.xml.crypto.Data;

public class News {

  private long id;
  private String author;
  private String title;
  private String content;
  private String catagory;
  private Data time;

  public Data getTime() {
    return time;
  }

  public void setTime(Data time) {
    this.time = time;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getCatagory() {
    return catagory;
  }

  public void setCatagory(String category) {
    this.catagory = category;
  }

  @Override
  public String toString() {
    return "News{" +
            "id"+this.getId()+
            "title"+this.getTitle()+
            "author"+this.getAuthor()+
            "}";
  }
}
