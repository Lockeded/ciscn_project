package com.csicn.client.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csicn.client.entity.User;
import com.csicn.client.service.UserService;
import com.csicn.client.mapper.UserMapper;
import com.csicn.client.utils.Result;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 10139
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-10-22 19:51:56
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public Result getUserList() {
        List<User> users =getBaseMapper().selectList(null);
        return Result.ok(users);
    }
}




