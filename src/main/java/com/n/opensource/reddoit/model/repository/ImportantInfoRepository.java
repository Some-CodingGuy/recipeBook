package com.n.opensource.reddoit.model.repository;

import com.n.opensource.reddoit.model.dto.ImportantInfoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImportantInfoRepository extends JpaRepository<ImportantInfoDTO, UUID> {
}
