package com.jcm.banco.services;

import com.jcm.banco.entities.User;
import com.jcm.banco.entities.dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

    void delete(Long id);

    User update(Long id, UserDto userUpdate);

}
