package keyvaluepair;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CREATE {
	@SuppressWarnings("unchecked")
	public synchronized void JSONCreate() 
	{

JSONObject obj= new JSONObject();

if(obj.containsKey("name")) {
	System.out.println("error");
}
obj.put("qualification", "B.E.");
obj.put("name","saiprasanth");
obj.put("location","chennai");



JSONArray lang = new JSONArray();
lang.add("java");
lang.add("python");
lang.add("php");
obj.put("course", lang);


 
 String targetaddress = "C:\\Users\\Admin\\eclipse-workspace_New\\keyvaluepair\\src\\myjson\\JSONfile.json";
 
 try(FileWriter f = new FileWriter(targetaddress)){

	 f.write(obj.toJSONString());
	 f.flush();
	 }
 catch(IOException e) {
	 e.printStackTrace();
 }
 System.out.println(obj);

 
 
	}
}
