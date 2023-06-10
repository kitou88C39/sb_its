package com.example.its.web.issue;

import com.example.its.domainissue.IssueEntity;
import java.util.List;
import org.springframework.stereotype.Service;

//ビジネスロジック・アルゴリズム等が書かれた処理を提供する
@Service
public class IssueService {

    public List<IssueEntity> findAll() {
        return List.of(
                new IssueEntity(1, "概要1", "説明1"),
                new IssueEntity(2, "概要2", "説明2"),
                new IssueEntity(3, "概要3", "説明3"));
    }
}
