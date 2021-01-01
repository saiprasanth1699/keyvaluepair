package keyvaluepair;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class READ {
public void ReadJSON() throws org.json.simple.parser.ParseException
{
	JSONParser parser = new JSONParser();
	String targetaddress="C:\\Users\\Admin\\eclipse-workspace_New\\keyvaluepair\\src\\myjson\\JSONfile.json";
	
	try {
		Object obj = parser.parse(new FileReader(targetaddress));
		JSONObject jsonobj= (JSONObject)obj;
		@SuppressWarnings("unused")
		String name=(String)jsonobj.get("location");
		System.out.println(name);
		JSONArray courses= (JSONArray)jsonobj.get("course");
		Iterator<String> iterator= courses.iterator();
		while(iterator.hasNext())
		{
			System.out.println("courses: "+iterator.next());
		}
		
		
		
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException e) {
		e.printStackTrace();
	}

}
}
