package com.dell.sit.demo.controller;

import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {

	@GetMapping("/getcsv")
	public String getCsv(HttpServletRequest request, HttpServletResponse response) throws Exception {

		StringWriter sw = new StringWriter();
		CSVPrinter csvPrinter = new CSVPrinter(sw, CSVFormat.DEFAULT.withHeader("Name","State","Department"));
		
		try {

			csvPrinter.printRecord("Naruto", "Konohagakure", "Leaf's Hokage Office");
			csvPrinter.printRecord("Sai", "Konohagakure", "Anbu");
			response.setContentType("text/csv");
			response.setHeader("Content-Disposition", "attachment; filename=\"shinobi.csv\"");
			
			return sw.toString();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			throw e;
			
		} finally {
			if(csvPrinter != null) {
				csvPrinter.close();
			}
			sw.flush();
		}
	}
	
	@GetMapping("/hello")
	public String helloworld(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return "Hello World!!!";
	}
}
