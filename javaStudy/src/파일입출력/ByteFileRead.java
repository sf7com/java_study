package ���������;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ByteFileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹ� 7���� ���ĺ��� �ϴ� ���
		Path path = Paths.get("C:\\Users\\MIT\\git\\java_study\\test1.txt");
		try {
			InputStream is = Files.newInputStream(path);
			int ch;
			//is.read() : 1byte�� �����͸� �о�´�.
			while((ch=is.read()) != -1) {
				System.out.print((char) ch);
			}
//			do {
//				ch=is.read();
//				System.out.print((char) ch);
//			}
//			while(ch != -1); //���� ���϶� -1
//				
			
//			while((ch=is.read()) != -1){
//				System.out.print((char) ch);
//			}
		} catch (Exception e) {
			
		}
	}

}
