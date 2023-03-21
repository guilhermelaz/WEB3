package com.requisicaocabecalho.requisicaocabecalho;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cabecalho", value = "/cabecalho")
public class CabecalhoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        String host = req.getHeader("host");
        String useragent= req.getHeader("user-agent");
        String acceptencoding = req.getHeader("accept-encoding");
        String acceptlanguage = req.getHeader("accept-language");

        out.println("host: " + host + "<br>");
        out.println("user-agent: " + useragent + "<br>");
        out.println("accept-encoding: " + acceptencoding + "<br>");
        out.println("accept-language: " + acceptlanguage + "<br>");
    }

}
