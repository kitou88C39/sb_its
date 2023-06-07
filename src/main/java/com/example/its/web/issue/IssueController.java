package com.example.its.web.issue;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

import java.util.List;

@Controller
public class IssueController {

    private final IssueService issueService = new IssueService();

    @GetMapping("/issues")
    public String showList(Model model) {
        model.addAllAttribute("issueList", issueService.findAll());
        return "issues/list";
    }

}
