package com.linya.blhxtools;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

@Component
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest hsr = (HttpServletRequest) request;
//        HttpServletResponse hsp = (HttpServletResponse) response;
//        String test = hsr.getParameter("test");
////        hsr.getSession()
//        if ("test1".equals(test)) {
            chain.doFilter(request, response);
//        } else {
//            hsp.setStatus(HttpStatus.FORBIDDEN.value());
//            System.out.println();
//            PrintWriter out = hsp.getWriter();
//            out.println("Hello World~");
//            out.flush();
//            out.close();
//        }
    }

}
