package com.yfy.dianping.service.impl;

import com.yfy.dianping.dal.UserModelMapper;
import com.yfy.dianping.model.UserModel;
import com.yfy.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author youfy
 * @date 2020-02-22 11:25分
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUser(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
