package com.wzl.domain;

import lombok.Data;


/**
 * @author wangzhilong
 * @dcreate 2022-02-14 11:30
 */
@Data
//@NoArgsConstructor
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;

}
