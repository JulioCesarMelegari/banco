package com.jcm.banco.services;

import com.jcm.banco.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
