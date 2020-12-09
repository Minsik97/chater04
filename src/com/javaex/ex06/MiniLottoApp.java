package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLottoApp {

	public static void main(String[] args) {
		//로또 번호 생성기 -->중복체크 포함
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		
		
		while(lottoSet.size()<6) {
		int num = (int)(Math.random()*45)+1;
		lottoSet.add(num);
		}
		
		
		for(int no: lottoSet) {
			System.out.print(no + "   ");
		}
		

	}

}
