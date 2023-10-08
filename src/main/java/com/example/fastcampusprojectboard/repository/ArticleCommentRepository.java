package com.example.FastCampusProjectBoard.repository;

import com.example.FastCampusProjectBoard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
