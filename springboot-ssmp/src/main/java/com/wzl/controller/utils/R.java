package com.wzl.controller.utils;

import lombok.Data;


/**
 * @author wangzhilong
 * @dcreate 2022-02-15 17:24
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
