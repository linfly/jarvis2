package com.mogujie.bigdata.admin.passport.user.session;

import com.mogujie.bigdata.admin.core.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lixun on 2017/7/25.
 */
public interface SessionHelper {
    public User getCurrentUser(HttpServletRequest request);

    public void updateSession(User user, HttpServletRequest request, HttpServletResponse response);
}
