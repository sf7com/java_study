package 파일입출력;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MemberInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key : ID, Value : List(나머지 정보)
		Map<String, List<String>> memberInfo = new HashMap<>();
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\회원정보.txt"); 
		
		try(BufferedReader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8)){
			//첫 줄 비우기
			String line=reader.readLine();
			
			while((line=reader.readLine()) != null) {
				//파일 끝까지 읽기
				//문자열을 콤마기준으로 잘라 배열로 리턴
				var strArray = line.split(",",-1);
				for(int i=0; i<strArray.length;i++) {
					if(i==0) {
						//id
						memberInfo.put(strArray[0],new ArrayList<>());
					}else {
						//id가 아닌 나머지 정보는 list에 넣기
						memberInfo.get(strArray[0]).add(strArray[i]);
					}
				}
			}
		}catch (Exception e) {
			
		}
		System.out.println(memberInfo);
		///////////////////////////////////////////////////
		//Map
		System.out.println(memberInfo.keySet());
//		for(var key : memberInfo.keySet()) { //keySet으로 key값 불러와서 반복
//			var valList = memberInfo.get(key);
//			if(valList.get(3).contains("수원시")) {   //주소에서 수원시 검색
//				System.out.println(key+":"+valList);
//			}	
//		}	
		//이름 검색
		searchMember(memberInfo, o->o.get(1).equals("전지현"),
				o->System.out.printf("이름:%s,전화번호:%s,주소:%s\n",o.get(1),o.get(2),o.get(3)));
		
	}
	public static void searchMember(Map<String, List<String>> members, Predicate<List<String>> pred, Consumer<List<String>> con) {
		for(var key : members.keySet()) { //keySet으로 key값 불러와서 반복
			var valList = members.get(key);
			if(pred.test(valList)) {   //주소에서 수원시 검색
//				System.out.println(key+":"+valList);
				con.accept(valList);
				
			}	
		}	
		
	}
}
