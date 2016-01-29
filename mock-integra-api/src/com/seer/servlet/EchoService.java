package com.seer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EchoService extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		System.out.println("RequestURL="+req.getRequestURL());
		System.out.println("QueryString="+req.getQueryString());
		out.println("{\"data\":{\"method\":\"GET\",\"request_url\":\""+req.getRequestURL()+"\",\"query_string\":\""+req.getQueryString()+"\"}}");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("application/json; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		System.out.println("RequestURL="+req.getRequestURL());
		System.out.println("QueryString="+req.getQueryString());
		out.println("{\"data\":{\"method\":\"POST\",\"request_url\":\""+req.getRequestURL()+"\",\"query_string\":\""+req.getQueryString()+"\"}}");
	}

}
