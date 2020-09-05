package my_project.exam1;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Cream extends Bread {
	@Override
	public JSONObject getBread() {
		String json = "{\n" + 
				"    \"breadType\": \"cream\",\n" + 
				"    \"recipe\": {\n" + 
				"      \"flour\": 100,\n" + 
				"      \"water\": 100,\n" + 
				"      \"cream\": 200\n" + 
				"    }\n" + 
				"  }";
		
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(json);
			JSONObject jobj = (JSONObject)obj;
			
			return jobj;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
