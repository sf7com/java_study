package ���������;

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
		//Key : ID, Value : List(������ ����)
		Map<String, List<String>> memberInfo = new HashMap<>();
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\ȸ������.txt"); 
		
		try(BufferedReader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8)){
			//ù �� ����
			String line=reader.readLine();
			
			while((line=reader.readLine()) != null) {
				//���� ������ �б�
				//���ڿ��� �޸��������� �߶� �迭�� ����
				var strArray = line.split(",",-1);
				for(int i=0; i<strArray.length;i++) {
					if(i==0) {
						//id
						memberInfo.put(strArray[0],new ArrayList<>());
					}else {
						//id�� �ƴ� ������ ������ list�� �ֱ�
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
//		for(var key : memberInfo.keySet()) { //keySet���� key�� �ҷ��ͼ� �ݺ�
//			var valList = memberInfo.get(key);
//			if(valList.get(3).contains("������")) {   //�ּҿ��� ������ �˻�
//				System.out.println(key+":"+valList);
//			}	
//		}	
		//�̸� �˻�
		searchMember(memberInfo, o->o.get(1).equals("������"),
				o->System.out.printf("�̸�:%s,��ȭ��ȣ:%s,�ּ�:%s\n",o.get(1),o.get(2),o.get(3)));
		
	}
	public static void searchMember(Map<String, List<String>> members, Predicate<List<String>> pred, Consumer<List<String>> con) {
		for(var key : members.keySet()) { //keySet���� key�� �ҷ��ͼ� �ݺ�
			var valList = members.get(key);
			if(pred.test(valList)) {   //�ּҿ��� ������ �˻�
//				System.out.println(key+":"+valList);
				con.accept(valList);
				
			}	
		}	
		
	}
}
