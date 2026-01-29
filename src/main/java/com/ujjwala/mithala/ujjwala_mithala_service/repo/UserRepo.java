package com.ujjwala.mithala.ujjwala_mithala_service.repo;

import com.ujjwala.mithala.ujjwala_mithala_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
