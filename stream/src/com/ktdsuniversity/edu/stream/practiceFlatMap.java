package com.ktdsuniversity.edu.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practiceFlatMap {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();
		words.add("Java");
		words.add("In");
		words.add("Action");
		List<String> uniqueCharacters = words.stream()
											 .map(w -> w.split(""))
											 .flatMap(Arrays::stream)	//Stream<Object>로 변환됨
											 .distinct()
											 .collect(Collectors.toList());
		uniqueCharacters.forEach(el->System.out.print(el+" "));
		System.out.println("\n============================================================");
		List<Stream<String>> uniqueCharacters2 = words.stream()
													  .map(w -> w.split(""))
													  .map(arr->Arrays.stream(arr))	//Stream<Stream<Object>>로 변환됨
													  .distinct()
													  .collect(Collectors.toList());
											 
		uniqueCharacters2.forEach(el->{
			System.out.print(el+"  :  ");
			List <String> a = el.collect(Collectors.toList());
			System.out.println(a);
		});
	}
}
