package com.rabbit.schedule.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("100001");
		list.add("000021");
		list.add("000031");
		list.add("000012");
		Collections.sort(list);
		
		System.out.println(list.get(0));
	}
}
