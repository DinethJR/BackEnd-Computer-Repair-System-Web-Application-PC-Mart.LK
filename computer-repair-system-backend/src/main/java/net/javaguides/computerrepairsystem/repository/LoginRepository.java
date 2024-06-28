package net.javaguides.computerrepairsystem.repository;

import net.javaguides.computerrepairsystem.Logindomain.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsernameAndPassword(String username, String password);

}