package com.ua.knuca.committee.repository;

import com.ua.knuca.committee.entity.FacultyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FacultyRepository extends JpaRepository<FacultyEntity, Integer> {
    @Override
    Optional<FacultyEntity> findById(Integer integer);
}
