package com.ua.knuca.committee.repository;

import com.ua.knuca.committee.entity.StatementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatementRepository extends JpaRepository<StatementEntity, Integer> {
}
