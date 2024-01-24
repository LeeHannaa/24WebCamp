package org.example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {
    private Long commentId;
    private Long postId;
    private Long userId;
    private String comment;
}