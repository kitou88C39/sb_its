package com.example.its.web.issue;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

import java.util.List;
import com.example.its.domainissue.IssueEntity;

@Controller
public class IssueController {

    // GET /issues
    @GetMapping("/issues")
    public String showList(Model model) {
        var issueList:List<IssueEntity> = List.of(
            new IssueEntity(1, "概要1", "説明1"),
            new IssueEntity(2, "概要2", "説明2"),
            new IssueEntity(3, "概要3", "説明3")

        );
        model.addAllAttribute(attributeName:"issueList",issueList);
        return "issues/list";
    }

}
