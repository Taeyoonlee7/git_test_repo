import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TEST1 {
	public static void main(String args[]) throws IOException {
		Map<String, Object> param = new HashMap();
		
		param.put("foodRecognYn1", "ㅇ");
		
		Map<String,Object> paramMap = new HashMap<String,Object>();				        
    	
		paramMap.put("foodRecognYn", param.get("foodRecognYn"));
    	
		
		if(param.containsKey("foodRecognYn")) {
    		paramMap.put("foodRecognYn", param.get("foodRecognYn"));
    		System.out.println(param.get("foodRecognYn"));
    	}else {
    		paramMap.put("foodRecognYn", "");
    		System.out.println(param.get("foodRecognYn"));
    	}
		/*
		 * if(param.get("foodRecognYn").equals(obj)) { System.out.println("에잉"); }else {
		 * System.out.println("오잉"); }
		 */
	}
}





