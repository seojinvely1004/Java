package mvc;

import java.util.HashMap;

public class HandlerMapping {
	HashMap<String, Controller> mappings;
	HandlerMapping(){
		mappings = new HashMap();
		mappings.put("hello", new HelloController());
		//mappings.put("list", new ListController());
	}
	Controller getController(String url){//mapping에게받은 url> 해당url에맞는 controller를나에게찾아줘
		System.out.println("HandlerMapping 실행중");
		return mappings.get(url);
		
	}

}
