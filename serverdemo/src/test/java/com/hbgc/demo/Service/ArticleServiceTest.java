package com.hbgc.demo.Service;

import com.hbgc.demo.domain.Article;
import com.hbgc.demo.service.ArticleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceTest {

    @Resource
    private ArticleService articleService;

    @Test
    public void queryByType(){
        List<Article> articleList=null;
        articleList=articleService.queryAllByType("日记");
        for(Article a:articleList){
            System.out.println(a.getTitle());
            System.out.println(a.getType());
            System.out.println(a.getAuth());
            System.out.println(a.getContent());
        }
    }
}
