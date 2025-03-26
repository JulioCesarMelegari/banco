package com.jcm.banco.services.impl;

import com.jcm.banco.entities.User;
import com.jcm.banco.entities.dtos.UserDto;
import com.jcm.banco.repositories.UserRepository;
import com.jcm.banco.services.UserService;
import com.jcm.banco.services.exceptions.DatabaseException;
import com.jcm.banco.services.exceptions.ResouceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    @Transactional(readOnly = true)
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    @Transactional
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User Id already exists.");
        }
        return userRepository.save(userToCreate);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if(!userRepository.existsById(id)){
            throw new ResouceNotFoundException("Recurso não encontrado");
        }try {
            userRepository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Falha de integridade referencial");
        }
    }

    @Override
    @Transactional
    public User update(Long id, UserDto dto) {
        try{
            User user = userRepository.getReferenceById(id);
            user.setName(dto.name());
            return  userRepository.save(user);
        }catch (EntityNotFoundException e){
            throw new ResouceNotFoundException("Id not found" + id);
        }
    }

}
