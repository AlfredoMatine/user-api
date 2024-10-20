package com.alfredo.java.back.end.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alfredo.java.back.end.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByCpf(String cpf);

    
    List <User> queryByNomeLike(String nome); 


}
