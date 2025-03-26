package com.jcm.banco.services;

import com.jcm.banco.entities.News;
import org.springframework.stereotype.Service;

@Service
public interface NewsService {

    News findById(Long id);

    News create(News newsToCreate);

    void delete(Long id);

    News update(Long id);

}
