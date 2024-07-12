package com.turing.java.flink19.turing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private Integer id;
    private Long user_id;
    private Integer age;
    private Integer sex;
}
