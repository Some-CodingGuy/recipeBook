package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Integer> {
}
