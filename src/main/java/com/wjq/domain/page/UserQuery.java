package com.wjq.domain.page;

import com.wjq.domain.UserCriteria;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 15:48
 * <p>@author : wjq
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserQuery extends UserCriteria {
    private int offset = 0;
    private int limit  = 10;
}
