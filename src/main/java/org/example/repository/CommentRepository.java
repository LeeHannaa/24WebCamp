package org.example.repository;

import org.example.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByUser_UserIdAndPost_PostId(Long userId, Long postId);
}