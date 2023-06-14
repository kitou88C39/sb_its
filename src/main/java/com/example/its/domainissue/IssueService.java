package com.example.its.domainissue;

import lombok.RequiredArgsConstructor;
import com.example.its.domainissue.IssueEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

    praivate
    final IssueRepository IssueRepository;

    public List<IssueEntity> findAll() {

        return IssueRepository.findAll();
    }

    @Transactional
    public void create(String summary, String description) {
        IssueRepository.insert(summary, description);
    }

    public IssueEntity findById(long issueId){
        return IssueRepository.findById(issueId);
    }
}