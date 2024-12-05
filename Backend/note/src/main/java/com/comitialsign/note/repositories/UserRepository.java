package com.comitialsign.note.repositories;

import com.comitialsign.note.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
