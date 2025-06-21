package com.example.mongodb_pracice.util;

import java.util.Date;

public record ErrorDetails(Date timestamp, String message, String details) {
}
