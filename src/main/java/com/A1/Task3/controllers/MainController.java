package com.A1.Task3.controllers;

import com.A1.Task3.domain.LoginsA1;
import com.A1.Task3.domain.PostingsA1;
import com.A1.Task3.repos.LoginsRepo;
import com.A1.Task3.repos.PostingsRepo;
import com.A1.Task3.service.LoginsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
public class MainController {

    public static Set<String> appAccountNames = new HashSet<>();

    @Autowired
    private LoginsRepo loginsRepo;

    @Autowired
    private PostingsRepo postingsRepo;

    @GetMapping("/logins")
    public Iterable<LoginsA1> showLoginData() {
        Iterable<LoginsA1> loginsA1s = loginsRepo.findAll();
        LoginsService.addToList(loginsA1s);
        return loginsRepo.findAll();
    }

    @GetMapping("/postings")
    public Iterable<PostingsA1> showPostingData() {
        Iterable<PostingsA1> postingsA1s = postingsRepo.findAll();
        for (PostingsA1 postingA1 : postingsA1s) {
            postingA1.isAuthorizePosting(appAccountNames);
            postingsRepo.save(postingA1);
        }
        return postingsRepo.findAll();
    }

    @PostMapping("/postings")
    public Iterable<PostingsA1> filter(@RequestParam(required = false) boolean filter) {
        Iterable<PostingsA1> postingsA1s;
        if (!postingsRepo.findByAuthPosting(filter).isEmpty()) {
            postingsA1s = postingsRepo.findByAuthPosting(filter);
        } else {
            postingsA1s = postingsRepo.findAll();
        }
        return postingsA1s;
    }

}
