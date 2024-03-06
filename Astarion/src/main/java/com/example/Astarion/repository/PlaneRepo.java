package com.example.Astarion.repository;

import com.example.Astarion.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepo extends JpaRepository<Plane, Long> {
}
