package org.platanus.tenynews;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DateServiceTest {
    private static DateService dateService;

    @BeforeAll
    static void beforeAll(){
        dateService = new DateService();
    }

    @Test
    public void getDate(){
        System.out.println(dateService.get10YearsAgoToday());
    }

    @Test
    public void getQuery(){
        System.out.println(dateService.getQuery());
    }
}
