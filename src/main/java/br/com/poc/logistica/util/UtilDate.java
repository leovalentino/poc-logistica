package br.com.poc.logistica.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

public class UtilDate {

	public static final String FORMATO_DD_MM_YYYY = "dd/MM/yyyy";
	public static final String FORMATO_YYYY_MM_DD = "yyyy-MM-dd";
	
	public static String getDateString(Date dataDevolucao, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		return sdf.format(dataDevolucao);
	}

	public static Date getStringToDate(String dataDevolucao, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		try {
			return sdf.parse(dataDevolucao);
		} catch (ParseException e) {
			Logger.getLogger("Erro ao converter String para Date");
		}
		return null;
	}

	public static Date converterDataAngularParaJava(String dataPedido) {
		return StringUtils.isEmpty(dataPedido) ? null : getStringToDate(dataPedido, "yyyy-MM-dd'T'HH:mm:ss.SSSX");
	}
		
}
