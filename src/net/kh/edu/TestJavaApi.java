package net.kh.edu;

import java.util.Date;

public class TestJavaApi {
	public static void main(String[] args) {
		Date date = new Date();
		// date.printDate(); 안쓰는 이유
		// 자바 내에 있는 date 파일을 가져다 쓰는거라 필요가 없다.
		System.out.println(date);
	}

}
