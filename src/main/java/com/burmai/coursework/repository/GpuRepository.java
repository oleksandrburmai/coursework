package com.burmai.coursework.repository;

import com.burmai.coursework.model.Gpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface GpuRepository extends JpaRepository<Gpu,Integer> {
}
