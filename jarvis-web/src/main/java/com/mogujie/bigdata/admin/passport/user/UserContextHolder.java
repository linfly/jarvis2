package com.mogujie.bigdata.admin.passport.user;

import com.mogujie.bigdata.admin.core.entity.User;

/**
 * Created by lixun on 2017/7/25.
 */
public class UserContextHolder {

    public static User getUser() {
        User user = new User();
        user.setUname("linfly");
        user.setId(1);
        user.setNick("linfly");
        return user;
    }
}
