package com.example.demo.constant;

import lombok.Getter;
import lombok.Setter;

public enum ResultCodeEnum {
    /*** 通用部分 100 - 599***/
    // 成功请求
    SUCCESS(200, "successful"),
    // 重定向
    REDIRECT(301, "redirect"),
    // 资源未找到
    NOT_FOUND(404, "not found"),
    // 服务器错误
    SERVER_ERROR(500, "server error"),


    ;
    /**
     * 响应状态码
     */
    @Getter
    @Setter
    private Integer code;
    /**
     * 响应信息
     */
    @Getter
    @Setter
    private String message;

    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

}
