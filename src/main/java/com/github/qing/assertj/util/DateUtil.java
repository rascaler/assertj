package com.github.qing.assertj.util;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class DateUtil {

    public static Date parseDate(String dateString, String pattern) {
        try {
            return DateUtils.parseDate(dateString, pattern);
        } catch (Exception e) {
            throw new RuntimeException("时间格式化失败");
        }
    }
}
