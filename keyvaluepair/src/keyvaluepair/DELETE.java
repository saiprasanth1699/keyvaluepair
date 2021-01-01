package keyvaluepair;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DELETE {
	
	public void deleteJSON() throws ParseException, InterruptedException {
	
	JSONParser parser = new JSONParser();
	String targetaddress="C:\\Users\\Admin\\eclipse-workspace_New\\keyvaluepair\\src\\myjson\\JSONfile.json";
	try {
		Object obj = parser.parse(new FileReader(targetaddress));
		JSONObject jsonobj= (JSONObject)obj;
		System.out.println("before deletion"+obj);
		@SuppressWarnings("unused")
		
		String name=(String)jsonobj.remove("location");
		Thread.sleep(500);
		System.out.println("after deletion"+obj);

}catch(FileNotFoundException e) {
	e.printStackTrace();
}
catch(IOException e) {
	e.printStackTrace();
}

}
}
