import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fileReader = new FileReader(new File("C:\\Users\\kamal\\eclipse-workspace\\JsonPractise\\target\\samp.json"));
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject)parse;
		Object object = jsonObject.get("data");
		JSONArray array = (JSONArray)object;
		Object object2 = array.get(3);
		JSONObject jsonObject1 = (JSONObject)object2;
		String string = jsonObject1.get("first_name").toString();
		System.out.println(string);
		
	}
}