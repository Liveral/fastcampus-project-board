package com.example.FastCampusProjectBoard.repository;

import com.example.FastCampusProjectBoard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}