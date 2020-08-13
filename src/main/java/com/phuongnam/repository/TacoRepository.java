package com.phuongnam.repository;

import com.phuongnam.model.Orders;
import com.phuongnam.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends JpaRepository<Taco,Long> {
}
