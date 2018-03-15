package com.wjq.service;

import com.wjq.common.Result;
import com.wjq.domain.User;
import com.wjq.domain.UserCriteria;
import com.wjq.query.UserQuery;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * <p>Description : 用户接口
 * <p>Date : 2018\3\15 0015 10:18
 * <p>@author : wjq
 */
public interface IUserService {

    Result<User> list(Long userId);

    Result<List<User>> listAll(UserCriteria userCriteria, int pageNo, int pageSize);

    Result<List<User>> listAll2(UserQuery query);
}
