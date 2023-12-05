package com.payu.service.converter;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDateFormat {
    static String formatDate(String date) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(date);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return offsetDateTime.toLocalDate().format(pattern);
    }
}
