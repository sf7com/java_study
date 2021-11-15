package ���������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectoryMake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ����
		//Map - ���̸� : key��, ���װ��� List�� Value��
		
		Map<String, List<String>> regionMap = new HashMap<>();
		List<String> guList = new ArrayList<>();
		
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\����.csv");
		try(BufferedReader reader = Files.newBufferedReader(path,
				StandardCharsets.UTF_8)){
			String line = reader.readLine();//���� �б�
			var strArray = line.split(",",-1);
			for(var gu:strArray) {
				regionMap.put(gu,new ArrayList<>());
				guList.add(gu);
			}
			System.out.println(regionMap);
			while((line=reader.readLine()) !=null){
				if(!line.isBlank()) {
					strArray = line.split(",",-1);
					System.out.println(Arrays.toString(strArray));
					for(int i=0;i<guList.size();i++) {
						var guName = guList.get(i);
						var dongName = strArray[i];
						if(!dongName.isBlank())
							regionMap.get(guName).add(dongName);
					}
				}
					
			}
		}catch(Exception e) {
			
		}
		System.out.println(regionMap);
		
		//���� ���� ���� �����
		String defaultPath = "C:\\Users\\MIT\\git\\java_study2";
		String region = "����";
		Path dPath = Paths.get(defaultPath,region);
		System.out.println(dPath);
		try {
			Files.createDirectories(dPath);
		}catch (Exception e) {
			
		}
		for(var gu : guList) {
			dPath = Paths.get(defaultPath, region, gu);
			try {
				Files.createDirectories(dPath);
			}catch (Exception e) {
				
			}
			for(var dong : regionMap.get(gu)) {
				dPath = Paths.get(defaultPath,region,gu,dong);
				try {
					Files.createDirectories(dPath);
					dPath = Paths.get(defaultPath,region,gu,dong,dong+".hwp");
					Files.createFile(dPath);
				}catch(Exception e) {
					
				}
			}
		}
	}

}
