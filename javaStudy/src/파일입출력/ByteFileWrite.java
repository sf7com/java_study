package ���������;

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
					StandardOpenOption.TRUNCATE_EXISTING,//���� ���౸�� �߰� ��.
//					StandardOpenOption.APPEND,//���ϳ��� ��� ���౸�� �߰� ��.
					StandardOpenOption.CREATE,
					StandardOpenOption.WRITE);
			//TRUNCATE_EXISTING : ���� ó������ ����
			//CREATE : ������ ���� ���� ����.���� ������ �ִ� ��� �������� ���
			//WRITE : ���� ���� ���
			//APPEND : ������ ���� ������ �߰��Ѵ�.
			byte[] data = {0x41,0x42,0x43};
			os.write(data);
			os.write(0x50);
			os.write('a');
			os.write('b');
			os.write('c');
			os.write('0');
			//os.write("hello"); ���ڿ� ���� �ȵ�
			String str = "hello";
			os.write('\n');
			for (int i=0;i<str.length();i++) {
				os.write(str.charAt(i));
			}
		} catch (Exception e) {
			
		}
	}

}
