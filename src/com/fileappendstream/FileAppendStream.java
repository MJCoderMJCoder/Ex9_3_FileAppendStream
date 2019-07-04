package com.fileappendstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppendStream {

	public static void main(String[] args) throws IOException {
		String str = "Welcome to Java";
		FileWriter fw;
		
		/*
		 * public FileWriter(file, boolean append) throws IOException。
		 * 根据给定的file对象构造一个FileWrite对象。
		 * 如果第二个参数为true,就将字节写入文件末尾处，而不是写入文件开始处
		 */
		fw = new FileWriter("./filestream.txt", true); //打开输出流
		fw.write(str); //写字符串到文件输出流
		fw.close(); //关闭文件输出流
		FileReader fr;
		fr = new FileReader("./filestream.txt"); //打开输入流
		int value;
		while ((value = fr.read()) != -1) //从文件输入流读数据
			System.out.print((char) value);
		fr.close(); //关闭文件输入流
	}

}
