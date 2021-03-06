package com.mogujie.bigdata.admin.client.service;

import com.mogujie.bigdata.admin.client.entity.Result;
import com.mogujie.bigdata.admin.core.entity.User;

/**
 * Created by lixun on 2017/7/25.
 */
public interface UserService {

    public Result<User> get(String uname, String app, String secret);

    public Result<User> add(User user, String app, String secret);
}
