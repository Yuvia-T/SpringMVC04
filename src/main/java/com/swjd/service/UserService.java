package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swjd.bean.User;

public interface UserService extends IService<User> {
    //根据账号和密码查询对象
    User userByUNameAndPwd(User user);
}
