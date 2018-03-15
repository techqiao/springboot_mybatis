package com.wjq.common;

import org.apache.ibatis.session.RowBounds;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 15:46
 * <p>@author : wjq
 */
public class GetRowBounds {
    public static RowBounds getRowBounds(int pageNo, int pageSize) {
        return new RowBounds(pageNo > 0 ? pageSize * (pageNo - 1) : 0,pageSize);
    }
}
