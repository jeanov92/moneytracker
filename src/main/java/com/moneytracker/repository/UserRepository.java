package com.moneytracker.repository;

import com.moneytracker.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository  extends JpaRepository<User, Long> {
}
