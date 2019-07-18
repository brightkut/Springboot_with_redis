package com.example.demo.repository;

import com.example.demo.model.Users;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


@EnableRedisRepositories
public interface UsersRepository extends CrudRepository<Users,Integer> {


    List<Users>findByFirstName(String firstName);
}
