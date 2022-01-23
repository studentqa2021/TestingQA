package com.util;
public static String getValue(String value) throws Exception {
			//code = how to read notepad config data==> Java dev class = Property
			
			String path ="./config.properties";
			
			FileInputStream fis = new FileInputStream(path);
			Properties pro = new Properties();
			pro.load(fis);
			// object=any thing ==> var = anything
			
			//System.out.println(pro.get(value));
			
			return pro.get(value).toString();
		}
		public static void main(String[] args) throws Exception {
			BaseConfig.getValue("password");
		}
}
