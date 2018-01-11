package es.Victor.Assembler;

import javax.servlet.http.HttpServletRequest;

import es.Victor.Model.Console;

public class ConsoleAssembler {

	public static Console assembleUserFrom(HttpServletRequest request) {
		
		Console console = new Console();
		
		String cod = request.getParameter("CodCompany");
		Integer z = Integer.parseInt(cod);
		
		console.setName(request.getParameter("Name")); 
		console.setCodCompany(z);
		return console;
	}
}
