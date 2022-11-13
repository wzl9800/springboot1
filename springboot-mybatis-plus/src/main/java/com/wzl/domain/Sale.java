package com.wzl.domain;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author wangzhilong
 * @dcreate 2022-02-13 19:11
 */
//@TableName("sale")
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer nums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }
}
