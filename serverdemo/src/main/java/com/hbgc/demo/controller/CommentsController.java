package com.hbgc.demo.controller;

import com.hbgc.demo.domain.Comment;
import com.hbgc.demo.json.Json;
import com.hbgc.demo.service.CommentsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("comments")
public class CommentsController extends BaseController{

    @Resource
    private CommentsService commentsService;

    @PostMapping("save")
    public Map<String, Object> saveComment(@RequestBody Comment comment) {
        try {
            commentsService.save(comment);
            return Json.success(null, "发表成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("发表失败!");
        }
    }

    @GetMapping("find")
    public Map<String,Object> findAllByAid(int aid){
        try{
            List<Comment> commentList=null;
            commentList=commentsService.findAllByAid(aid);
            if(commentList!=null) {
                return Json.success(commentList, "查询评论成功！");
            }
            return Json.fail("查询评论失败！");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("更新评论失败！");
        }
    }
}
