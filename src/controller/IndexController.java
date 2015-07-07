package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexController
 */
@WebServlet({"/jquery/hello.do","/jquery/ch02.do","/jquery/ch03.do",
	"/jquery/ch04.do","/jquery/ch05.do","/jquery/ch06.do",
	"/jquery/ch07.do","/jquery/ch08.do","/jquery/ch09.do",
	"/jquery/ch10.do","/jquery/ch11.do","/index.do"
	})
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request,response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath().substring(+1);
		String url = "";
		
		switch (path) {
		case "jquery/hello.do": url="hello.jsp"; break;
		case "jquery/ch02.do": url="ch02"; break;
		case "jquery/ch03.do": url="ch03"; break;
		case "jquery/ch04.do": url="ch04"; break;
		case "jquery/ch05.do": url="ch05"; break;
		case "jquery/ch06.do": url="ch06"; break;
		case "jquery/ch07.do": url="ch07"; break;
		case "jquery/ch08.do": url="ch08"; break;
		case "jquery/ch09.do": url="ch09"; break;
		case "jquery/ch10.do": url="ch10"; break;
		case "jquery/ch11.do": url="ch11"; break;
		case "index.do": url="/index.jsp"; break;
		
		default: break;
		}
		if (path.substring(0, 5).equals("jquer")) {
			RequestDispatcher dispatcher 
				= request.getRequestDispatcher("/view/jquery/"+url);
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher 
				= request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
		
	}
	
	

	

}
