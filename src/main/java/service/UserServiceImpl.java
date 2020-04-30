package service;

import model.User;
import repository.UserRepository;

import java.time.LocalDate;

public class UserServiceImpl implements UserService{
    UserRepository userRepository;
    public UserServiceImpl(){
        userRepository = new UserRepository();
    }

    @Override
    public String registerUser(User user) {
        //user.registerDate = LocalDate.now();
        int i = userRepository.addUser(user);
        System.out.println(i+"");
        return null;
    }
}
