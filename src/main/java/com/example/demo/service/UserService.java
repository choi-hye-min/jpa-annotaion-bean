package com.example.demo.service;

import com.example.demo.entity.Memo;
import com.example.demo.entity.User;
import com.example.demo.repository.MemoRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    MemoRepository memoRepository;

    public User getUser(Long id) {
        return userRepository.findById(id).get();
    }

    public Memo getMemo(Long id){
        return memoRepository.findById(id).get();
    }
}
