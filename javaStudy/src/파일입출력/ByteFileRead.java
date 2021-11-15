package 파일입출력;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바 7버전 이후부터 하는 방법
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\test1.txt");
		try {
			InputStream is = Files.newInputStream(path);
			int ch;
			//is.read() : 1byte씩 데이터를 읽어온다.
			while((ch=is.read()) != -1) {
				System.out.print((char) ch);
			}
//			do {
//				ch=is.read();
//				System.out.print((char) ch);
//			}
//			while(ch != -1); //파일 끝일때 -1
//				
			
//			while((ch=is.read()) != -1){
//				System.out.print((char) ch);
//			}
		} catch (Exception e) {
			
		}
	}

}
