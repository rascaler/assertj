package com.github.qing.assertj.core.calendar;
import com.github.qing.assertj.core.Assert;

import java.time.LocalDateTime;


public class LocalDateTimeAssert<SELF extends LocalDateTimeAssert<SELF>>
        extends AbstractCalendarAssert<SELF, LocalDateTime>
        implements Assert<SELF, LocalDateTime>, CalendarAssert<SELF, LocalDateTime>{

    public LocalDateTimeAssert(LocalDateTime dateTime) {
        super(dateTime, LocalDateTimeAssert.class);
    }
}
