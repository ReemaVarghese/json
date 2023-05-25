package com.example.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class json_class {
	
		private String path;
		
		public json_class(String path) {
			super();
			this.path = path;
		}
		
		public Map<String,String> getLine() throws IOException {
			
			Map<String,String> line= new LinkedHashMap<String,String>();
			FileInputStream inputStream = null;
			Scanner sc = null;
			try {
				String res;
			    inputStream = new FileInputStream(path);
			    sc = new Scanner(inputStream);
			    while (sc.hasNextLine()) {
			    	String str=sc.nextLine();
			    	res=str.substring(85, 93);
			    	line.put(res,str);
			    	//return line;
			        
			    }
			    if (sc.ioException() != null) {
			        throw sc.ioException();
			    }
			} finally {
			    if (inputStream != null) {
			        inputStream.close();
			    }
			    if (sc != null) {
			        sc.close();
			    }
			}
			return line;
		}
		public String getPath()
		{
			return this.path;
		}
		public void setPath(String path) {
			this.path = path;
		}
	
		
	
}
