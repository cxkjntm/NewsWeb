package com.lxy.newsshow.Services;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxy.newsshow.Mappers.NewsMapper;
import com.lxy.newsshow.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsService  {
    @Autowired
    NewsMapper newsMapper;
   public PageInfo<News> getNewsByPage(int pageNum){
       PageHelper.startPage(pageNum,6);
       List<News> list=newsMapper.getAllNews();
       PageInfo<News> pageInfo = new PageInfo<>(list,pageNum);
       return pageInfo;
   }
}
