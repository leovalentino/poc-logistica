package br.com.poc.logistica.filter;

import java.io.BufferedReader;
import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import br.com.poc.logistica.service.interfaces.LoginServico;

public class LoginFilter implements javax.servlet.Filter {

	public static final String AUTHENTICATION_HEADER = "Authorization";
	
	@EJB
	private LoginServico servico;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		if (request instanceof HttpServletRequest) {
			StringBuilder sb = new StringBuilder();
	        BufferedReader br = request.getReader();
	        String str = null;
	        while ((str = br.readLine()) != null) {
	            sb.append(str);
	        }
	        JSONObject jObj = new JSONObject(sb.toString());
	        String login = jObj.getString("login");
	        String senha = jObj.getString("senha");

			boolean authenticationStatus = false;

			if (authenticationStatus) {
				filter.doFilter(request, response);
			} else {
				if (response instanceof HttpServletResponse) {
					HttpServletResponse httpServletResponse = (HttpServletResponse) response;
					httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				}
			}
		}
	}

	@Override
	public void destroy() {
		
	}


}
