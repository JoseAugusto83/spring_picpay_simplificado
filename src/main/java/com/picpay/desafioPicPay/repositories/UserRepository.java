package com.picpay.desafioPicPay.repositories;

import com.picpay.desafioPicPay.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User>findUserByDocument(String document);
    Optional<User>findUserById(Long id);
=======
public interface UserRepository extends JpaRepository<User, Long> {
>>>>>>> 44af957c259112285e0ff608a5db4a6fe13e918d
}
