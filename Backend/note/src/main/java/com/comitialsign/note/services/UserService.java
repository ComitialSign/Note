package com.comitialsign.note.services;

import com.comitialsign.note.domain.user.User;
import com.comitialsign.note.dtos.UserDto;
import com.comitialsign.note.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById(Long userId) {
        /**
         * Procura um usuário pelo ID
         *
         * @param userId o ID do usuário
         *
         * @return um {@link Optional} contendo o usuário, caso encontrado; vazio caso contrário
         *
         * @throws IllegalArgumentException caso o usuário não seja encontrado
         */

        return userRepository.findById(userId);
    }

    public User createUser(UserDto data) {
        User newUser = new User(data);
        this.userRepository.save(newUser);
        return newUser;
    }

    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }


}
