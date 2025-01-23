package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3_school")
public class W3_Controller {

	@RequestMapping(value="/html" ,method = RequestMethod.GET)
	public String html() {
		return "HTML is the standard markup language for Web pages With HTML you can create your own Website HTML is easy to learn - You will enjoy it!";
	}
	
	@RequestMapping(value="/css" ,method = RequestMethod.POST)
	public String css() {
		return "CSS is the language we use to style an HTML document CSS describes how HTML elements should be displayed This tutorial will teach you CSS from basic to advanced.";
	}
	
	@RequestMapping(value="/java" ,method = RequestMethod.PUT)
	public String java() {
		return " Java is a popular programming language Java is used to develop mobile apps, web apps, desktop apps, games and much more.";	
		}
	
	@RequestMapping(value="/python" ,method = RequestMethod.GET)
	public String python() {
		return "Python is a popular programming language Python can be used on a server to create web applications.\n";
				
		}
	
	@RequestMapping(value="/sql" ,method = RequestMethod.POST)
	public String sql() {
		return " SQL is a standard language for storing, manipulating and retrieving data in databases Our SQL tutorial will teach you how to use SQL in: MySQL, SQL Server, MS Access, Oracle, Sybase, Informix, Postgres, and other database systems.\r\n";
		}
	
	@RequestMapping(value="/javascript" ,method = RequestMethod.POST)
	public String javascript() {
		return "JavaScript is the world's most popular programming language JavaScript is the programming language of the Web JavaScript is easy to learnThis tutorial will teach you JavaScript from basic to advanced." ;
		
		}
}


