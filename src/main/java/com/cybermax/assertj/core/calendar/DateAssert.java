package com.cybermax.assertj.core.calendar;
import com.cybermax.assertj.core.Assert;

import java.util.Date;


public class DateAssert<SELF extends DateAssert<SELF>>
        extends AbstractCalendarAssert<SELF, Date>
        implements Assert<SELF, Date>, CalendarAssert<SELF, Date>{

    protected DateAssert(Date date, String pattern, Class<?> selfType) {
        super(date, pattern, selfType);
    }

    @Override
    protected Date parse(String dateString) {
        return null;
    }

}
