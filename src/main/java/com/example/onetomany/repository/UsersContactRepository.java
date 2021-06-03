package com.example.onetomany.repository;

import com.example.onetomany.model.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}
