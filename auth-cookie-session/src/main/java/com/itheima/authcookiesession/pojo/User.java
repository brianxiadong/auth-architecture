package com.itheima.authcookiesession.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author brianxia
 * @version 1.0
 * @date 2020/12/21 18:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String address;
}
