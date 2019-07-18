package com.example.demo.service;


import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



/* this  class is create for write code db from repository you can call orm or implemt your db*/

@Service
public class UsersService {


    private UsersRepository usersRepository;

    @Autowired
    public UsersService(UsersRepository usersRepository) {

        this.usersRepository = usersRepository;

    }

    // show all users in db
    public List<Users> showAllUsers(){
        return  (List<Users>)usersRepository.findAll();
    }


    // show all users that name = parameter in db
    public List<Users> showUsersByName(String name){
        return (List<Users>) usersRepository.findByFirstName(name);
    }


    // create user in db
    public Users createUser(Users users){
        return usersRepository.save(users);
    }






}
