package io.swagger.api;

import java.io.IOException;

import javax.annotation.Generated;
import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

@Generated(
        value = "io.swagger.codegen.v3.generators.java.SpringCodegen",
        date = "2022-05-16T12:39:15.018Z[GMT]")
public class ApiOriginFilter implements javax.servlet.Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        res.addHeader("Access-Control-Allow-Headers", "Content-Type");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
}
