package com.example.caotruongtoan_2011063795.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.management.relation.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    @Query("SELECT r.id FORM Role r WHERE r.name = ?1")
    Long getRoleIdByName(String rolename);
}
