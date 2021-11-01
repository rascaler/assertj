package com.github.qing.assertj.exception;

import java.util.HashMap;
import java.util.Map;

public class ExceptionMessage {
    public static final String FAIL = "1001";
    public static final String SUCCESS = "1000";
    public static final String OBJECT_CANNOT_BE_EMPTY = "1002";
    public static final Map<String, String> messages = new HashMap<>();
    static {
        /**
         * 消息提示你可以放入资源文件 key-value,然后加载如
         * 如：
         * 1001=失败
         * 1000=成功
         */
        messages.put(SUCCESS, "失败");
        messages.put(FAIL, "失败");
        messages.put(OBJECT_CANNOT_BE_EMPTY, "不能为空");
    }
}
