package com.requisicaocabecalho.requisicaocabecalho;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "req", value = "/requisicao")
public class RequisicaoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("Método: " + request.getMethod() + "<br>");
        out.println("URI do Pedido: " + request.getRequestURI() + "<br>");
        out.println("Protocolo: " + request.getProtocol() + "<br>");
        out.println("Endereço remoto: " + request.getRemoteAddr() + "<br>");
    }

}

