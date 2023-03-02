package com.dev.ecuzo_prj_dev.jpa;

import com.dev.ecuzo_prj_dev.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {

}
