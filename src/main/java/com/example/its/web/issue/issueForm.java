package com.example.its.web.issue;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
public class issueForm {

    @NotBlankBlank
    @Size(max = 256)
    private String summary;

    @NotBlankBlank
    @Size(max = 256)
    private String description;
}
