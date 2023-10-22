package com.csicn.client.service;

import com.csicn.client.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.csicn.client.utils.Result;

/**
* @author 10139
* @description 针对表【user】的数据库操作Service
* @createDate 2023-10-22 19:56:02
*/
public interface UserService extends IService<User> {

    Result getUserList();
}
