package com.dev.ecuzo_prj_dev.jpa;

import com.dev.ecuzo_prj_dev.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {

}
