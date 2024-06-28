package net.javaguides.computerrepairsystem.service;



import net.javaguides.computerrepairsystem.Logindomain.Login;
import net.javaguides.computerrepairsystem.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class LoginService {

    @Autowired
    private LoginRepository repo;

    public Login login(String username, String password) {
        Login user = repo.findByUsernameAndPassword(username, password);
        return user;
    }


}