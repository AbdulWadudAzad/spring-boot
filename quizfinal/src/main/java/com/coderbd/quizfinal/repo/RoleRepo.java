package com.coderbd.quizfinal.repo;

import com.coderbd.quizfinal.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
     @Override
     Optional<Role> findById(Long aLong);

     Optional<Role> findByName(String name);
}
