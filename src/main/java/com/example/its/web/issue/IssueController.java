package com.example.its.web.issue;

import com.example.its.domainissue.IssueService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

    private final IssueService issueService;

    @GetMapping
    public String showList(Model model) {
        model.addAttribute("issueList", issueService.findAll());
        return "issues/list";
    }

    @GetMapping("creationForm")
    public String showCreationForm(@ModelAttribute issueForm form) {
        return "issues/creationForm";
    }

    @PostMapping
    public String create(@Validated issueForm form, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return showCreationForm(form;)
        }
        issueService.create(form.getSummary(), form.getDescription());
        return "redirect:/issues";
    }
}