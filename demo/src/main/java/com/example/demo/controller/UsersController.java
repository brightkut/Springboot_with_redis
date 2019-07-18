package com.example.demo.controller;


import com.example.demo.model.Users;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;


    @GetMapping("/getAllUsers")
    public ResponseEntity<?> getAllUsers(){
        List<Users> listUsers = usersService.showAllUsers();
        return  ResponseEntity.ok(listUsers);

    }

    @GetMapping(params = "name")
    public ResponseEntity<?>getUserByName(@RequestParam String name){
        List<Users> listUsers = usersService.showUsersByName(name);
        return  ResponseEntity.ok(listUsers);

    }

    @PostMapping
    public  ResponseEntity<?>create(@RequestBody Users users){
        Users u = usersService.createUser(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(u);


    }




}
