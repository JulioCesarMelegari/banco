package com.jcm.banco.services;

import com.jcm.banco.entities.Feature;
import org.springframework.stereotype.Service;

@Service
public interface FeatureService {

    Feature findById(Long id);

    Feature create(Feature featureToCreate);

    void delete(Long id);

    Feature update(Long id);
    
}
