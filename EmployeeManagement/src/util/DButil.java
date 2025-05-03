package util;
import java.io.*;
import java.util.*;

public class DButil {// DBproperty
// connection with db.properties
	public static Properties getProperties() 

	 {

	     Properties properties = new Properties(); // create a object for Properties

	   try (InputStream input = DButil.class

			.getClassLoader().getResourceAsStream("db.properties")) 

	   {

	          properties.load(input); // try to load the property file

	   } 

	   catch (Exception e)

	   {

	            e.printStackTrace(); // if not catch with exception

	   }

	   return properties;

    }

}
