package com.lxy.newsshow.Controllers;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxy.newsshow.Mappers.NewsMapper;
import com.lxy.newsshow.Services.NewsService;
import com.lxy.newsshow.entities.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class NewsDisplayController {
    @Autowired
    NewsService newsService ;
   @GetMapping("/news/{page}")
    public String getAllNews( Model model, @PathVariable String page){
       int pageNum = Integer.parseInt(page);
       PageInfo<News>pageInfo = newsService.getNewsByPage(pageNum);
       model.addAttribute("pageInfo", pageInfo);
       return "News/list";
   }
}
