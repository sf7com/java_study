package 파일입출력;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\test2.txt");
		try {
			BufferedReader is = Files.newBufferedReader(path,
					StandardCharsets.UTF_8);
			String line;
			//readLine(); 한줄씩 읽어온다. -\n 나올때까지 읽어들임.
			while((line=is.readLine()) !=null) {
				System.out.println(line);
			}
			
		} catch(IOException e) {
			System.out.println("읽고 쓰는데 실패했습니다.");
			// java 7버전 이후 IOException으로 통합
		} catch(Exception e) {
			// 그밖의 예외
		}
	}

}
