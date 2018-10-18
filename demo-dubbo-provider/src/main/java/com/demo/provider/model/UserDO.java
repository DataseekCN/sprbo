package com.demo.provider.model;

import java.io.Serializable;
import lombok.Data;

/**
 * Table：USER
 *
 * @create 2018-10-17
 **/
@Data
public class UserDO implements Serializable {

    private Long id;
    private String name;
    private Integer age;
}
