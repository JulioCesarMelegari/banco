package com.jcm.banco.repositories;

import com.jcm.banco.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
