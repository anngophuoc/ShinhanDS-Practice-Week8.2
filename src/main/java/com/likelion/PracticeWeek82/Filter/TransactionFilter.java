package com.likelion.PracticeWeek82.Filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@Component
@Order(1)
public class TransactionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        Enumeration<String> headersNames = request.getHeaderNames();
        String string = request.getHeader("user-agent");
        if (string != null && string.contains("Postman")){
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.setHeader("Content-Type", "application/json");
            PrintWriter out = response.getWriter();
            out.println("Ban dang yeu cau tu Postman");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
