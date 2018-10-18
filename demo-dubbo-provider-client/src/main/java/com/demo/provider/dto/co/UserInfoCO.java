package com.demo.provider.dto.co;

import java.io.Serializable;
import lombok.Data;

/**
 * @create 2018-10-17
 **/
@Data
public class UserInfoCO implements Serializable {

    private Long id;
    private String name;
    private Integer age;
}
