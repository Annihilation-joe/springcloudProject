package com.yz.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yz
 * @create 2021-08-24 21:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    //404
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
