package chap19.sec06;

import java.io.*;
import java.nio.charset.Charset;

import org.json.*;

public class CreateJsonExample {

	public static void main(String[] args) throws IOException {
		JSONObject root=new JSONObject();	//JSON 객체 생성
		
		root.put("id", "winter");
		root.put("name", "한겨울");
		root.put("age", 25);
		root.put("student", true);
		
		JSONObject tel = new JSONObject();	//JSON 객체 생성
		tel.put("home", "02-123-1234");
		tel.put("mobile", "010-1234-1234");
		
		root.put("tel", tel);
		
		JSONArray skill=new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		
		root.put("skill", skill);
		
		//JSON 얻기
		String json=root.toString();
		
		System.out.println(json);	//콘솔에 추력
		
		//파일로 저장
		Writer writer=new FileWriter("C:/Temp/member.json",Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();

	}

//새로운 내용을 저장

}
