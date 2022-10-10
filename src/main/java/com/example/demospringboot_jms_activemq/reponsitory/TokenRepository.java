package com.example.reponsitory.authenReponsitory;


import com.example.entity.Authentication.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);
}
