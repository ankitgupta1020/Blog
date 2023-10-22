//package com.blog.API.repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface UserRepo extends JpaRepository<T, ID> {
//
//}
package com.blog.API.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.API.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
