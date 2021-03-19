package com.cybermax.assertj.core.calendar;
import com.cybermax.assertj.core.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeAssert<SELF extends LocalDateTimeAssert<SELF>>
        extends AbstractCalendarAssert<SELF, LocalDateTime>
        implements Assert<SELF, LocalDateTime>, CalendarAssert<SELF, LocalDateTime>{

    protected LocalDateTimeAssert(LocalDateTime dateTime, String pattern, Class<?> selfType) {
        super(dateTime, pattern, selfType);
    }

    protected LocalDateTime parse(String dateString) {
        return LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern(this.pattern));
    }
}
