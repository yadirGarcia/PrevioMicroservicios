package com.previo.servicio.loker.util;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.Data;

/**
 * @project Pastley-Variable.
 * @author Sergio Stives Barrios Buitrago.
 * @Github https://github.com/SerBuitrago.
 * @contributors leynerjoseoa.
 * @version 1.0.0.
 */
@Data
public class Common implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public static String [] isRangeDateRegisterValidateDate(String start, String end) {
		if (Common.isChain(start) && Common.isChain(end)) {
			LockerDate date = new LockerDate();
			try {
				String array_date[] = { date.formatToDateTime(date.convertToDate(start.replaceAll("-", "/")), null),
						date.formatToDateTime(date.convertToDate(end.replaceAll("-", "/")), null) };
				return array_date;
			} catch (ParseException e) {
				throw new LockerException(HttpStatus.NOT_FOUND,
						"El formato permitido para las fechas es: 'Año-Mes-Dia'.");
			}
		} else {
			throw new LockerException(HttpStatus.NOT_FOUND, "No se ha recibido la fecha inicio o la fecha fin.");
		}
	}
	
	public static boolean isChain(String chain) {
		return chain != null && chain.trim().length() > 0;
	}
	

	public static boolean isLong(Long value) {
		return value != null && value > 0;
	}

}
