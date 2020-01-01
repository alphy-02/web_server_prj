package com.hbgc.demo.Service;

import com.hbgc.demo.domain.Comment;
import com.hbgc.demo.service.CommentsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentsServiceTest {

    @Resource
    private CommentsService commentsService;

    @Test
    public void saveComment(){
        Comment c=new Comment();
        c.setAid(5);
        c.setContent("沙发");
        c.setUsername("李四");
        c.setCreateTime("2019-10-12 10:25");
        commentsService.save(c);
    }

    @Test
    public void findAllByAid(){
        List<Comment> commentList =commentsService.findAllByAid(5);
        for (Comment c: commentList){
            System.out.println(c);
        }
    }
}
