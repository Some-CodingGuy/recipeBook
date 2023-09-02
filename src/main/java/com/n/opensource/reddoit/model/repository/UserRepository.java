package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.dto.UserDTO;
import com.n.opensource.reddoit.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
