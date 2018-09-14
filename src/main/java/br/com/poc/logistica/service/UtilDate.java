package br.com.poc.logistica.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDate {

	public static final String FORMATO_DD_MM_YYYY = "dd/MM/yyyy";

	public static String getDateString(Date dataDevolucao, String formato) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_DD_MM_YYYY);
		return sdf.format(cal.getTime());
	}
		
}
