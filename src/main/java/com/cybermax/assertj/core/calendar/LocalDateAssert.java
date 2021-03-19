package com.cybermax.assertj.core.calendar;
import com.cybermax.assertj.core.Assert;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class LocalDateAssert<SELF extends LocalDateAssert<SELF>>
        extends AbstractCalendarAssert<SELF, LocalDate>
        implements Assert<SELF, LocalDate>, CalendarAssert<SELF, LocalDate>{

    protected LocalDateAssert(LocalDate date, String pattern, Class<?> selfType) {
        super(date, pattern, selfType);
    }

    protected LocalDate parse(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern(this.pattern));
    }


}
