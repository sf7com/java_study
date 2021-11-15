package 파일입출력;

import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\writeTest2.txt");
		//java 7버전 - 객체할당시 try()문안에 선언, 객체 자동닫기가 됨.
		try(BufferedWriter bw = Files.newBufferedWriter(path,
				StandardCharsets.UTF_8)) {
			String[] animals = {"Lion","Dog","Cat"};
			for(var val : animals) {
				bw.append(val);
				bw.newLine();
			}
//			bw.append("Lion");
//			bw.newLine();
//			bw.append("Dog\n");
//			bw.append("Cat");

		} catch (Exception e) {
			
		}
	}

}
