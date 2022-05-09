package crp.kr.api.board.controllers;

import crp.kr.api.auth.domains.User;
import crp.kr.api.auth.services.UserService;
import crp.kr.api.board.domains.Article;
import crp.kr.api.board.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/article")
@RequiredArgsConstructor

public class ArticleController{

    private final ArticleService service;

    // Embeded Methods
    @GetMapping("/findAll")
    public List<Article> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Article> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Article> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Article Article) {
        return service.delete(Article);
    }

    @PostMapping("/join")
    public String save(@RequestBody Article Article) {
        return service.save(Article);
    }


}

