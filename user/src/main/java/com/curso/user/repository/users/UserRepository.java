package com.curso.user.repository.users;

import com.curso.user.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    @Query(nativeQuery = true,value = "SELECT * FROM user u WHERE u.hashactive = :hash")
    User findHash(@Param("hash")String hash);
}
