package com.example.Astarion.repository;

import com.example.Astarion.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepo  extends JpaRepository<Zone, Long> {
}
