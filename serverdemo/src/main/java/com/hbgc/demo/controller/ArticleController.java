package com.hbgc.demo.controller;

import com.hbgc.demo.domain.Article;
import com.hbgc.demo.json.Json;
import com.hbgc.demo.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("article")
public class ArticleController extends BaseController {

    @Resource
    private ArticleService articleService;

    @GetMapping("queryAll")
    public Map<String, Object> queryAllByType(String type) {
        List<Article> articleList = null;
        try {
            articleList = articleService.queryAllByType(type);
            if (articleList != null) {
                return Json.success(articleList, "查询成功！");
            }
            return Json.fail("内容为空！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("查询失败！");
        }
    }

    @GetMapping("findAll")
    public Map<String,Object> queryAllByAuth(String auth){
        List<Article> articleList=null;
        try {
            articleList=articleService.queryAllByAuth(auth);
            if (articleList!=null){
                return Json.success(articleList,"查询成功!");
            }
            return Json.fail("不存在!");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("查询失败!");
        }
    }

    @GetMapping("queryById")
    public Map<String, Object> queryById(int id) {
        Article article = null;
        try {
            article = articleService.getOne(id);
            if (article != null) {
                return Json.success(article, "查询成功!");
            }
            return Json.fail("该文章不存在！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("查询失败！");
        }
    }

    @PostMapping("publish")
    public Map<String, Object> saveArticle(@RequestBody Article article) {
        try {
            articleService.save(article);
            return Json.success(null, "发表成功！");
        } catch (Exception ex) {
            ex.printStackTrace();
            return Json.fail("发表失败!");
        }
    }

    @PostMapping("delete")
    public Map<String, Object> deleteById(int id){
        try {
            articleService.deleteById(id);
            return Json.success("删除成功！");
        }catch (Exception ex){
            ex.printStackTrace();
            return Json.fail("删除失败!");
        }
    }
}
