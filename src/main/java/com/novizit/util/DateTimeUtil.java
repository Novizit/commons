package com.novizit.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateTimeUtil {

	private static final String[] dateFormats = {
			"MM/dd/yyyy H:mm",
		    "yyyy-MM-dd",
		    "MM/dd/yyyy",
		    "dd/MM/yyyy",
		    "dd-MMM-yyyy",
		    "yyyy/MM/dd",
		    "dd MMM yyyy",
		    "yyyy/MMM/dd",
		    "yyyy-MM-dd HH:mm:ss",
		    "yyyy-MM-dd HH:mm:ss.SSS",
		    "E, dd MMM yyyy HH:mm:ss Z",
		    "MM/dd/yyyy h:mm:ss a",
		    "MM/dd/yyyy h:mm a",
		    "MM/dd/yyyy HH:mm a",
		    "MM/dd/yyyy HH:mm",
		    "MM/dd/yyyy h:mm"
		};

	public static LocalDateTime convertToUTC(String dateStr, String timeZone) {
		LocalDateTime localDateTime = parseDateTime(dateStr, null);
		if (localDateTime != null) {
			ZoneId zoneId = ZoneId.of(timeZone);
			ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
			ZonedDateTime utcZonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
			return utcZonedDateTime.toLocalDateTime();
		}
		return null;
	}

	public static LocalDateTime convertToUTC(String dateStr, String timeStr, String timeZone) {
		LocalDateTime localDateTime = parseDateTime(dateStr, timeStr);
		if (localDateTime != null) {
			ZoneId zoneId = ZoneId.of(timeZone);
			ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
			ZonedDateTime utcZonedDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
			return utcZonedDateTime.toLocalDateTime();
		}
		return null;
	}

	private static LocalDateTime parseDateTime(String dateStr, String timeStr) {
		String userDateTimeStr = timeStr != null ? dateStr + " " + timeStr : dateStr;
		LocalDateTime localDateTime = null;
		for (String dateFormat : dateFormats) {
			try {
				DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat);
				localDateTime = LocalDateTime.parse(userDateTimeStr, dateTimeFormatter);
				break;
			} catch (Exception e) {
				// Parsing failed for the current combination, continue to the next
			}

		}
		return localDateTime;
	}

	public static String preprocessTime(String timeStr, boolean is12HourFormat) { // Remove unnecessary spaces and
																					// convert to upper case
		// Remove unnecessary spaces and convert to upper case
		timeStr = timeStr.trim().toUpperCase();

		if (is12HourFormat) {
			// Append " AM" if it's 12-hour format without AM/PM indicator
			if (!timeStr.matches(".*\\s[AP]M") && !timeStr.matches(".*\\sAM") && !timeStr.matches(".*\\sPM")) {
				timeStr = timeStr.replaceFirst("(\\d{2}):(\\d{2})([ AP][Mm])", " $1:$2 $3");
			}
		} else {
			// Remove "AM" or "PM" if it's 24-hour format
			timeStr = timeStr.replaceAll("([ AP][Mm])", "");
			timeStr = timeStr.trim();
		}

		return timeStr;
	}
}
