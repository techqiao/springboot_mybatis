package com.wjq.controller;

import com.wjq.common.Result;
import com.wjq.domain.User;
import com.wjq.domain.UserCriteria;
import com.wjq.query.UserQuery;
import com.wjq.service.IUserService;
import com.wjq.utils.DateTimeUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 10:25
 * <p>@author : wjq
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;

    @PostMapping(value = "getUserById", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<User> getUserById(@RequestParam(value = "userId") Long id) {

        return userService.list(id);
    }

    @PostMapping(value = "getUserAll2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<List<User>> getUserAll2(UserCriteria userCriteria,
                                          @RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
                                          @RequestParam(value = "pageSize", defaultValue = "20") int pageSize) {
        return userService.listAll(userCriteria, pageNo,pageSize);
    }

    @PostMapping(value = "getUserAll", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<List<User>> getUserAll2(UserQuery query) {
//        int pageNo = getBeginIndex(query.getPageNo(),query.getPageSize());
//        RowBounds rowBounds = new RowBounds(pageNo,query.getLimit());
//        Result<List<User>> listResult = userService.listAll(userCriteria, rowBounds);
//        Result<List<User>> listResult = userService.listAll2(query);
//        query.setOrderStr("id");
//        System.out.println(listResult.getData().size());
//        for (User user : listResult.getData()) {
//            System.out.println(user.getName());
//        }
        userService.listAll2(query);
        return null;
    }

//    public int getBeginIndex(int pageNo,int pageSize) {
//        return pageNo > 0 ? pageSize * (pageNo - 1) : 0;
//    }

}
