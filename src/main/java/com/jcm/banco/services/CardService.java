package com.jcm.banco.services;

import com.jcm.banco.entities.Card;
import com.jcm.banco.entities.News;
import org.springframework.stereotype.Service;

@Service
public interface CardService {

    Card findById(Long id);

    Card create(Card cardToCreate);

    void delete(Long id);

    Card update(Long id);
    
}
