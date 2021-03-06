package com.coderbd.springoauthrestengine.repo;


import com.coderbd.springoauthrestengine.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByRolename(String rolename);
}
