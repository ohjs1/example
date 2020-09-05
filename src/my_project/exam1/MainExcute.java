package my_project.exam1;

import org.json.simple.JSONObject;

public class MainExcute {

	public static void main(String[] args) {
		//cream출력
		JSONObject cream = new FactoryBread().print("cream").getBread();
		JSONObject recipe1 = (JSONObject)cream.get("recipe");
		System.out.println("breadType:" + cream.get("breadType"));
		System.out.println("recipe");
		System.out.println("flour:" + recipe1.get("flour"));
		System.out.println("water:" + recipe1.get("water"));
		System.out.println("cream:" + recipe1.get(cream.get("breadType")));
		
		System.out.println();
		
		//sugar출력
		JSONObject sugar = new FactoryBread().print("sugar").getBread();
		JSONObject recipe2 = (JSONObject)sugar.get("recipe");
		System.out.println("breadType:" + sugar.get("breadType"));
		System.out.println("recipe");
		System.out.println("flour:" + recipe2.get("flour"));
		System.out.println("water:" + recipe2.get("water"));
		System.out.println("sugar:" + recipe2.get(sugar.get("breadType")));
		
		System.out.println();
		
		//butter출력
		JSONObject butter = new FactoryBread().print("sugar").getBread();
		JSONObject recipe3 = (JSONObject)butter.get("recipe");
		System.out.println("breadType:" + butter.get("breadType"));
		System.out.println("recipe");
		System.out.println("flour:" + recipe3.get("flour"));
		System.out.println("water:" + recipe3.get("water"));
		System.out.println("butter:" + recipe3.get(butter.get("breadType")));
		
	}

}
