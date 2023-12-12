package com.gucardev.collaborativewebbe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Result {
    @Id
    private String id;
    private String room;
    private String username;
    private String screenShot;
    private String email;
    private String feedback;
    private String createdAt;
}
