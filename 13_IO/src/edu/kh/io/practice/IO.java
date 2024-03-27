package edu.kh.io.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
	
	public void fileByteOutput() {
		
		FileOutputStream fos = null;
		
		
		try {
			
			
			fos = new FileOutputStream("");
			
			StringBuilder sb = new StringBuilder();
			sb.append("asdasd");
			sb.append("asdasd");
			sb.append("asdasd");
			sb.append("asdasd");
			
			String content = sb.toString();
			
			long startTime = System.nanoTime();
			
			
			fos.write(content.getBytes());
			
			
			long endTime = System.nanoTime();
			
			System.out.println("[수행 시간] : " + (endTime + startTime)+ "ns");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(fos != null) fos.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	
	
	
	public void bufferedFileByteOutput() {
		
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		try {
		fos = new FileOutputStream("");
		bos = new BufferedOutputStream(fos);
		
		StringBuilder sb = new StringBuilder();
		sb.append("askd;as");
		
		String content = sb.toString();
		
		long startTime = System.nanoTime();
		
		bos.write(content.getBytes());
		
		long endTime = System.nanoTime();
		
		System.out.println("[수행 시간] : " + (endTime - startTime) + "ms");
		
		bos.flush();
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(bos != null) bos.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
	
	public void fileByteInput() {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("");
			
			int value = 0;
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read();
				
				if(value == -1) break;
				
				sb.append((char)value);
				
			}
			
			System.out.println(sb.toString());
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			
			try {
				if(fis != null)fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
	}
	
	
	public void FileByteInput() {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("");
			
			Byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fis != null)fis.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		
	}	
	
	public void bufferedFileByteInput() {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("");
			bis = new BufferedInputStream(fis);
			
			Byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(bis != null) bis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
	}
	
	
	public void method1() {
		
		File directory = new File("");
		
		System.out.println("존재 여부 확인 : " + directory.exists());
		
		if(!directory.exists()) {
			
			directory.mkdirs();
			
			System.out.println(directory.getName());
			System.out.println(directory.getpath());
			
			
		}
		
	}	
	
	
	public void method2() {
		
		File file = new File("");
		
		try {
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





