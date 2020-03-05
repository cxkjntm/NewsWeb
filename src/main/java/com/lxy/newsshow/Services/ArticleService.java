package com.lxy.newsshow.Services;

import com.lxy.newsshow.Mappers.ArticalMapper;
import com.lxy.newsshow.entities.ArticalComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    ArticalMapper articalMapper;
    public boolean InsertIntoArtical(ArticalComment articalComment){
        boolean flag = articalMapper.InsertIntoArtical(articalComment);
        if (flag) return true;
        else  return false;
    }
}
