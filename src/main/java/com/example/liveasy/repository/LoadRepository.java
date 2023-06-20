package com.example.liveasy.repository;
import com.example.liveasy.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoadRepository extends JpaRepository<Load, Long> {
    List<Load> findByShipperId(String shipperId);
}
