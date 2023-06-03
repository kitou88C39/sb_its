package com.example.its.domainissue;

public class IssueEntity {
    private long id;
    private String summary;
    private String description;

    public IssueEntity(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummry(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}