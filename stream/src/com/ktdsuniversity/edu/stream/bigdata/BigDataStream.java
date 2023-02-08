package com.ktdsuniversity.edu.stream.bigdata;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.stream.baseball.AllStarFullVO;

public class BigDataStream {

	public static List<TextVO> readTextVO(){
		
		String path = "C:\\Devs\\data\\bigdata\\10K.ID.CONTENTS";
		try {
			List <TextVO> list = Files.readAllLines(Paths.get(path))
						.parallelStream()
						.map((line) -> {
							String [] strArr = line.split("\t");
							TextVO vo = new TextVO();
							vo.setKey(strArr[0].trim());
							if(strArr.length>1) {
								vo.setValue(strArr[1].trim());
							}
							return vo;
						})
						.collect(Collectors.toList());
			return list;
		} catch(IOException ioe) {
			ioe.printStackTrace();
			return new ArrayList<>();
		}
	}
	public static void main(String[] args) {
		
		List <TextVO> list = readTextVO();
		System.out.println(list.size());
		
		// 8-1. 10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		long startTime = System.currentTimeMillis();
		List <String> list12370584 = list.stream()
						   //readTextVO().stream()
										 .filter((vo)->vo.getKey().equals("12370584"))
										 .map(vo->vo.getValue())
										 .collect(Collectors.toList());
		System.out.println("8-1 실행 시간: "+(System.currentTimeMillis() - startTime));
		System.out.println(list12370584);
		
		 startTime = System.currentTimeMillis();
		// 8-2. (병렬)10K.ID.CONTENTS 파일에서 "12370584"의 내용을 출력
		List <String> parallelList12370584 = list.parallelStream()
							       //readTextVO().parallelStream()
												 .filter((vo)->vo.getKey().equals("12370584"))
												 .map(vo->vo.getValue())
												 .collect(Collectors.toList());
		System.out.println("8-2 실행 시간: "+(System.currentTimeMillis() - startTime));
		System.out.println(parallelList12370584);		
		// 9. (병렬)"7670637"에 몇개의 단어가 있는지 출력
		Optional<Integer> countLetter7670637 = list.parallelStream()
												   .filter(vo->vo.getKey().equals("7670637"))
												   .map(vo->vo.getValue().split(" ").length)
												   .findFirst();
		System.out.println("9. "+countLetter7670637.orElse(0));
		//10. (병렬)10K.ID.CONTENTS 파일에서 내용이 없는 "번호"는 몇개인지 출력
		List<String> countLetterEmpty = list.parallelStream()
												 .filter(vo->vo.getValue()==null ||vo.getValue().trim().length() == 0)
												 .map(vo->vo.getKey())
												 .collect(Collectors.toList());
		System.out.println("10. "+countLetterEmpty.size());
		//11. (병렬)10K.ID.CONTENTS 파일에서 두 개의 단어로만 이루어진 "번호"는 몇 개인지 출력
		List<String> consist2Letter = list.parallelStream()
										  .filter(vo->vo.getValue()!=null)
										  .filter(vo->vo.getValue().length()==2)
										  .map(vo->vo.getKey())
										  .collect(Collectors.toList());
		System.out.println("11. "+consist2Letter.size());
		//12. (병렬)10K.ID.CONTENTS 파일에서 내용에서 내용에 "that"이 포함된 글은 몇개인지
		List<String> containThatList = list.parallelStream()
										   .filter(vo->vo.getValue()!=null)
										   .filter(vo->vo.getValue().contains("that"))
										   .map(vo->vo.getKey())
										   .collect(Collectors.toList());
		System.out.println("12. "+containThatList.size());
		//13. (병렬)10K.ID.CONTENTS 파일에서 글 번호가 6자리 인 것은 몇 개인지
		List<String> keyLength6 = list.parallelStream()
									  .filter(vo->vo.getKey().length()==6)
									  .map(vo->vo.getKey())
									  .collect(Collectors.toList());
		System.out.println("13. "+keyLength6.size());
		//14. (병렬)10K.ID.CONTENTS 파일에서 글 번호가 7자리 인 것은 몇 개인지
		long keyLength7 = list.parallelStream()
							   .filter(vo->vo.getKey().length()==7)
							   .map(vo->vo.getKey())
							   .count();
		System.out.println("14. "+keyLength7);
		//15. (병렬)10K.ID.CONTENTS 파일에서 글 번호가 9로 시작하는 모든 글들의 첫 번째 단어만 출력
		System.out.print("15. ");
		list.parallelStream()
			.filter(vo->vo.getKey().startsWith("9"))
			.map(vo->vo.getValue() == null ? "" : vo.getValue().trim())
			.forEach(word->{
				if(word.trim().length() == 0) {
					System.out.println("");
				}else {
					String[] firstWord = word.split(" ");
					System.out.println(firstWord[0]+" ");
				}
			});
		//System.out.println("15. "+start91stWord);
		//16. (병렬)10K.ID.CONTENTS 파일에서 내용이 있으며, 글 번호가 7로 시작하는 모든 글들의 첫번째 단어만 출력
		System.out.print("\n16. ");
		list.parallelStream()
			.filter(vo->vo.getKey().startsWith("7"))
			.filter(vo->vo.getValue()!=null)
			.filter(vo->vo.getValue().length() != 0)
			.forEach(vo->{
				String[] firstWord = vo.getValue().split(" ");
				System.out.print(firstWord[0]+" ");
			});
	}
}
