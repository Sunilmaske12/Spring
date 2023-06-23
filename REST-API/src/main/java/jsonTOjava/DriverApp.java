package jsonTOjava;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class DriverApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //creating object mapper 
        ObjectMapper mapper = new ObjectMapper();
        
        //read json file & convert to java
        try {
			Student student = mapper.readValue(new File( "data/sample-lite.json") , Student.class);
			Student1 student1 = mapper.readValue(new File( "data/sample-full.json") , Student1.class);
			
			
			
	//print data
			
			System.out.println("First name "+student.getfirstName());
			System.out.println("Last name "+student.getLastName());
			System.out.println("Active "+student.isActive());
			System.out.println("Id "+student.getId());


			System.out.println("\n\n First name "+student1.getFirstName());
			System.out.println("Last name "+student1.getLastName());
			System.out.println("Active "+student1.isActive());
			System.out.println("Id "+student1.getId());
			
			for(String arr:student1.getLanguages()) {
				System.out.println("Languages :" +arr);
			}
			
			Address address = student1.getAddress();
			
			System.out.println("city :"+address.getCity());
			
			
			
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
       
    }
}
