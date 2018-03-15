package com.wjq.query;

import com.wjq.common.Pagination;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 14:13
 * <p>@author : wjq
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQuery extends Pagination{
    private String name;
    private Date date;
}
