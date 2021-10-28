package com.qing.assertj.core.calendar;
import com.qing.assertj.core.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDateAssert<SELF extends LocalDateAssert<SELF>>
        extends AbstractCalendarAssert<SELF, LocalDate>
        implements Assert<SELF, LocalDate>, CalendarAssert<SELF, LocalDate>{

    public LocalDateAssert(LocalDate date) {
        super(date, LocalDateAssert.class);
    }
}
