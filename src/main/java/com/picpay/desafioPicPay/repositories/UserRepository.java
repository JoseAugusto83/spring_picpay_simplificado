package com.picpay.desafioPicPay.repositories;

import com.picpay.desafioPicPay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
