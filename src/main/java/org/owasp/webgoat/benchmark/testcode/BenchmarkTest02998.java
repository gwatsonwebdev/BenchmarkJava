package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest02998")
public class BenchmarkTest02998 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = request.getParameter("foo");
		
		
		String bar;
		
		// Simple ? condition that assigns constant to bar on true condition
		int i = 106;
		
		bar = (7*18) + i > 200 ? "This_should_always_happen" : param;
		
		
		
		try {	
			java.nio.file.Path path = java.nio.file.Paths.get(org.owasp.webgoat.benchmark.helpers.Utils.testfileDir + bar);
			java.io.InputStream is = java.nio.file.Files.newInputStream(path, java.nio.file.StandardOpenOption.READ);
		} catch (Exception e) {
			// OK to swallow any exception for now
			System.out.println("File exception caught and swallowed: " + e.getMessage());
		}
	}
}