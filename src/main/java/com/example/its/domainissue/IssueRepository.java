package com.example.its.domainissue;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IssueRepository {

    @Select("Select * from issues")
    List<IssueEntity> findAll();

    @Insert("insert into issue(summary, description) values(#{summary},#{description})")
    void insert(String summary, String description);

    @Select("select * from issues where id = #{issueId}")
    IssueEntity findById(long issueId);
}