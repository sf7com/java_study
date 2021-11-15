package ���������;

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
			//readLine(); ���پ� �о�´�. -\n ���ö����� �о����.
			while((line=is.readLine()) !=null) {
				System.out.println(line);
			}
			
		} catch(IOException e) {
			System.out.println("�а� ���µ� �����߽��ϴ�.");
			// java 7���� ���� IOException���� ����
		} catch(Exception e) {
			// �׹��� ����
		}
	}

}
