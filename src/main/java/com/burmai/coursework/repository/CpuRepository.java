package com.burmai.coursework.repository;

import com.burmai.coursework.model.Cpu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CpuRepository extends JpaRepository<Cpu, Integer> {

}
