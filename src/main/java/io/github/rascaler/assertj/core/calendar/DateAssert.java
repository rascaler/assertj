package io.github.rascaler.assertj.core.calendar;
import io.github.rascaler.assertj.core.Assert;

import java.util.Date;


public class DateAssert<SELF extends DateAssert<SELF>>
        extends AbstractCalendarAssert<SELF, Date>
        implements Assert<SELF, Date>, CalendarAssert<SELF, Date>{

    public DateAssert(Date date) {
        super(date, DateAssert.class);
    }

}
