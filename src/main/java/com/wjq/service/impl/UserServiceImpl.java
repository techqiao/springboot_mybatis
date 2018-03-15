package com.wjq.service.impl;

import com.wjq.common.GetRowBounds;
import com.wjq.common.Result;
import com.wjq.dao.UserMapper;
import com.wjq.domain.User;
import com.wjq.domain.UserCriteria;
import com.wjq.query.UserQuery;
import com.wjq.service.IUserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 10:20
 * <p>@author : wjq
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public Result<User> list(Long userId) {
        return Result.success(userMapper.selectByPrimaryKey(userId));
    }

    @Override
    public Result<List<User>> listAll(UserCriteria userCriteria,int pageNo,int pageSize) {
        userCriteria.setOrderByClause("phone desc");
        userCriteria.setDistinct(true);
        userCriteria.createCriteria().andNameLike("%WQ%");
        return Result.success(userMapper.selectByExampleWithRowbounds(userCriteria, GetRowBounds.getRowBounds(pageNo,pageSize)));
    }

    @Override
    public Result<List<User>> listAll2(UserQuery query) {
        return Result.success(userMapper.getUserList(query));
    }

    private RowBounds getRowBounds(int pageNo, int pageSize) {
        return new RowBounds(pageNo > 0 ? pageSize * (pageNo - 1) : 0,pageSize);
    }
}
