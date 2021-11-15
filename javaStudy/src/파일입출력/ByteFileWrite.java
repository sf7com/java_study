package 파일입출력;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ByteFileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\writeTest.txt");
		try {
			OutputStream os = Files.newOutputStream(path,
					StandardOpenOption.TRUNCATE_EXISTING,//새로 실행구문 추가 됨.
//					StandardOpenOption.APPEND,//파일끝에 계속 실행구문 추가 됨.
					StandardOpenOption.CREATE,
					StandardOpenOption.WRITE);
			//TRUNCATE_EXISTING : 파일 처음부터 쓰기
			//CREATE : 파일을 새로 만들어서 연다.기존 파일이 있는 경우 기존파일 사용
			//WRITE : 쓰기 가능 모드
			//APPEND : 파일의 끝에 내용을 추가한다.
			byte[] data = {0x41,0x42,0x43};
			os.write(data);
			os.write(0x50);
			os.write('a');
			os.write('b');
			os.write('c');
			os.write('0');
			//os.write("hello"); 문자열 쓰기 안됨
			String str = "hello";
			os.write('\n');
			for (int i=0;i<str.length();i++) {
				os.write(str.charAt(i));
			}
		} catch (Exception e) {
			
		}
	}

}
