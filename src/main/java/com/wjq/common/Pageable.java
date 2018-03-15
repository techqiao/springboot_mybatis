package com.wjq.common;

import java.io.Serializable;

/**
 * <p>Description : springboot
 * <p>Date : 2018\3\15 0015 14:08
 * <p>@author : wjq
 */
public interface Pageable extends Serializable {
    int getTotalCount();

    int getTotalPage();

    int getPageSize();

    int getPageNo();

    boolean isFirstPage();

    boolean isLastPage();

    int getOffset();
}
