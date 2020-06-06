package com.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

public class CircularTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cArray[]= new int[] {1,3,2,3};
		int result=circularArray(cArray,3);
		System.out.println("Result-->"+result);
	}
	
	public static int circularArray(int cArray[],int noOflength) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<cArray.length-1;i++) {
			int startinex=cArray[i];
			int endpoint=cArray[i+1];
			while(startinex!=endpoint) {
				startinex = elementTraverse(noOflength, map, startinex);
			}
			if(startinex==endpoint) {	
				startinex = elementTraverse(noOflength, map, startinex);	
			}	
		}
		Comparator<? super Entry<Integer, Integer>> maxValueComparator = (
	            entry1, entry2) -> entry1.getValue().compareTo(
	            entry2.getValue());	
		Optional<Entry<Integer, Integer>> maxValue = map.entrySet()
	            .stream().max(maxValueComparator);
		return maxValue.get().getKey();
	}

	private static int elementTraverse(int noOflength, Map<Integer, Integer> map, int startinex) {
		if(startinex>noOflength) {
			startinex=startinex%noOflength;
		}
		if(map.get(startinex)==null) {
			map.put(startinex, 1);
		}else{
			map.put(startinex, map.get(startinex)+1);
		}
		startinex++;
		return startinex;
	}

}
