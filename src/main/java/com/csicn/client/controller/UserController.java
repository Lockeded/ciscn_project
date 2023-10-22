package com.csicn.client.controller;
import com.csicn.client.service.UserService;
import com.csicn.client.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/listAll")
    public Result listAll(){
        return userService.getUserList();
    }
}
