package org.platanus.tenynews;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DateService {
    public String get10YearsAgoToday(){
        LocalDate yyyymmdd = LocalDate.now();
        LocalDate yyyymmdd10YearsAgo = yyyymmdd.minusYears(10);
        return yyyymmdd10YearsAgo.toString();
    }
    public String getQuery(){
        return "%22%EB%93%B1%EB%A1%9D+%3A" + get10YearsAgoToday() + "%22";
    }
}
