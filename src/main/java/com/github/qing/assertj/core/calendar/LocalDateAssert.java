package com.github.qing.assertj.core.calendar;
import com.github.qing.assertj.core.Assert;

import java.time.LocalDate;


public class LocalDateAssert<SELF extends LocalDateAssert<SELF>>
        extends AbstractCalendarAssert<SELF, LocalDate>
        implements Assert<SELF, LocalDate>, CalendarAssert<SELF, LocalDate>{

    public LocalDateAssert(LocalDate date) {
        super(date, LocalDateAssert.class);
    }
}
