package com.fileappendstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendStream {

	public static void main(String[] args) throws IOException {
		String str = "Welcome to Java";
		FileWriter fw;
		
		/*
		 * public FileWriter(file, boolean append) throws IOException��
		 * ���ݸ�����file������һ��FileWrite����
		 * ����ڶ�������Ϊtrue,�ͽ��ֽ�д���ļ�ĩβ����������д���ļ���ʼ��
		 */
		fw = new FileWriter("./filestream.txt", true); //�������
		fw.write(str); //д�ַ������ļ������
		fw.close(); //�ر��ļ������
		FileReader fr;
		fr = new FileReader("./filestream.txt"); //��������
		int value;
		while ((value = fr.read()) != -1) //���ļ�������������
			System.out.print((char) value);
		fr.close(); //�ر��ļ�������
	}

}
