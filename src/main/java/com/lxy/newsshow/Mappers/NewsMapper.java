package com.lxy.newsshow.Mappers;

import com.lxy.newsshow.entities.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsMapper {
    @Select("select * from news where id =#{id}")
    public News getNewsById(Integer id);

    @Select("select * from news")
    @Results({
            @Result(id=true,column="id",property="id",javaType=Integer.class),
            @Result(column="author",javaType=String.class,property="author"),
            @Result(column="title",property="title",javaType=String.class),
            @Result(column = "content",javaType = String.class,property = "content")
    })
    public List<News> getAllNews();


}
