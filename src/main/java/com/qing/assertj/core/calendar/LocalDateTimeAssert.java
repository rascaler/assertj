package com.qing.assertj.core.calendar;
import com.qing.assertj.core.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class LocalDateTimeAssert<SELF extends LocalDateTimeAssert<SELF>>
        extends AbstractCalendarAssert<SELF, LocalDateTime>
        implements Assert<SELF, LocalDateTime>, CalendarAssert<SELF, LocalDateTime>{

    public LocalDateTimeAssert(LocalDateTime dateTime) {
        super(dateTime, LocalDateTimeAssert.class);
    }
}
