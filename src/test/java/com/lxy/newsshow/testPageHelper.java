package com.lxy.newsshow;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxy.newsshow.Mappers.NewsMapper;
import com.lxy.newsshow.entities.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class testPageHelper {
    @Autowired
    NewsMapper newsMapper;
    @Test
    void testselectall() {
        //1.使用PageHelper类设置起始页和每页显示的条数
        int pageNum=5;//当前页码   从网页中可以获取
        int pageSize=20;//pageSize：自定义
        PageHelper.startPage(pageNum,pageSize);
        //2调用查询所有的方法
        List<News> list=newsMapper.getAllNews();
        for (News user : list) {
            System.out.println(user);
        }
        //3.把查询的结果封装到Pageinfo中
        PageInfo<News> pageinfo=new PageInfo<>(list,4);
        System.out.println("上一页:"+pageinfo.getPrePage());
        System.out.println("当前页:"+pageinfo.getPageNum());
        System.out.println("下一页:"+pageinfo.getNextPage());
        System.out.println("总页数:"+pageinfo.getPages());
        int[] navigatepageNums = pageinfo.getNavigatepageNums();
        for (int i : navigatepageNums) {
            System.out.print(i+"\t");
        }
    }
}
