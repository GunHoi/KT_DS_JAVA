package com.ktdsuniversity.edu.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseballStream1 {
	
	public static List<AllStarFullVO> readAllStarFull() {
		
		List<AllStarFullVO> list = null;
		try {
			list = Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\AllstarFull.csv"))
											.stream()
											.skip(1)
											//.peek(System.out::println) 중간연산으로 작동하여, 에러가 나게된 부분을 보여주는 역할도 할 수 있다.
											.map((line) -> {
												String [] strArr = line.split(",");
												AllStarFullVO vo = new AllStarFullVO();
												vo.setPlayerID(strArr[0]);
												vo.setYear(strArr[1]);
												vo.setGameNum(Integer.parseInt(strArr[2]));
												vo.setGameID(strArr[3]);
												vo.setTeamID(strArr[4]);
												vo.setLgID(strArr[5]);
												vo.setGp(Integer.parseInt(strArr[6]));
												if(strArr.length == 8) {
													vo.setStartingPos(Integer.parseInt(strArr[7]));
												}else {
													vo.setStartingPos(0);
												}
												return vo;
											}).collect(Collectors.toList());
			return list;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public static void main(String[] args) {
		List <AllStarFullVO> list = readAllStarFull();
		System.out.println(list.size());
		
		list.stream()
			.filter( (vo)->vo.getYear().equals("1933"))
			.forEach( (vo) -> {
				System.out.print(vo.getPlayerID()+" ");
				System.out.println(vo.getYear());
			});
		System.out.println("================================================================");
		
		//위와 같은 코드인데, playIn1933 List에 저장한 것
		List <AllStarFullVO> playIn1933 = list.stream()
											  .filter( (vo) -> vo.getYear().equals("1933") )
											  .collect(Collectors.toList());	//최종함수
		
		AllStarFullVO vo = list.stream()
							   .filter( (vo1) -> vo1.getYear().equals("2933"))
							   .findFirst()		//최종함수 (1건만 찾아오는 경우)
//							   .get();		//Optional의 method -> No value present Error 발생
							   .orElse(new AllStarFullVO());	//data가 없으면 new AllStarFullVO()를 리턴해라. (자주 쓰인다)
		System.out.println(vo.getPlayerID());
		
		System.out.println("================================================================");
		//이름이 f로 시작하는 모든 PlayerId (대문자 F가 있다면 소문자 f로 변경하여 모두 뽑아내 바로 출력)
		list.stream()
			.filter( (value) -> value.getPlayerID().toLowerCase().startsWith("f"))
			.forEach( (name) -> {
				System.out.println(name.getPlayerID());
			});
		
		System.out.println("================================================================");
		list.stream()
		.filter( (value) -> value.getPlayerID().toLowerCase().substring(0, 1).equals("f"))
		.forEach( (name) -> {
			System.out.println(name.getPlayerID());
		});
		
		
		//이름이 f로 시작하는 모든 PlayerId (소문자 f를 대문자F로 변경하여 f,F 모두 뽑아내 리스트에 저장함)
		List <AllStarFullVO> startsWithF = list.stream()
											  .filter( (allStarVO) -> allStarVO.getPlayerID().toUpperCase().startsWith("F"))
											  .collect(Collectors.toList());
		
		System.out.println("================================================================");
		// 2중 filter
		list.stream()
		.filter( (allStarVO) -> allStarVO.getYear().equals("2004"))	//filter를 걸때는 수가 가장 적어지는 방향으로 한다.
		.filter( (allStarVO) -> allStarVO.getTeamID().equals("TEX"))
		.forEach( (allStarVO) -> {
			System.out.println(allStarVO.getPlayerID());
			System.out.println(allStarVO.getYear());
			System.out.println(allStarVO.getTeamID());
		});
		
		System.out.println("================================================================");
		// && 연산자를 이용한 2중 filter
		list.stream()
		.filter( (allStarVO) -> allStarVO.getYear().equals("2004") && allStarVO.getTeamID().equals("TEX"))
		.forEach( (allStarVO) -> {
			System.out.println(allStarVO.getPlayerID());
			System.out.println(allStarVO.getYear());
			System.out.println(allStarVO.getTeamID());
		});
		
		System.out.println("================================================================");
		list.stream()
		.filter( (allStarVO) -> allStarVO.getStartingPos() == 0)
		.forEach( (allStarVO) -> {
			System.out.print(allStarVO.getStartingPos()+" ");
			System.out.print(allStarVO.getPlayerID()+" ");
			System.out.print(allStarVO.getYear()+" ");
			System.out.println(allStarVO.getTeamID());
		});
		
		System.out.println("================================================================");
		//gp가 0, teamID NYA, PlayerID에 fo가 포함되어있으면
		list.stream()
		.filter( (allStarVO) -> allStarVO.getGp() == 0)
		.filter( (allStarVO -> allStarVO.getTeamID().toUpperCase().equals("NYA")))
		.filter( (allStarVO) -> allStarVO.getPlayerID().toLowerCase().contains("fo"))
		.forEach( (allStarVO) ->{
			System.out.print(allStarVO.getPlayerID()+" ");
			System.out.print(allStarVO.getYear()+" ");
			System.out.println(allStarVO.getTeamID());
		});
		
		System.out.println("================================================================");
		list.parallelStream()	//병렬처리시 출력하는 과정에서 서로 개입하기 때문에 순서가 뒤죽박죽으로 나오게 된다.
		.filter( (allStarVO) -> allStarVO.getGp() == 0)
		.filter( (allStarVO -> allStarVO.getTeamID().toUpperCase().equals("NYA")))
		.filter( (allStarVO) -> allStarVO.getPlayerID().toLowerCase().contains("fo"))
		.forEach( (allStarVO) ->{
			System.out.print(allStarVO.getPlayerID()+" ");
			System.out.print(allStarVO.getYear()+" ");
			System.out.println(allStarVO.getTeamID());
		});
		
		System.out.println("================================================================");
		//distinct : 중복제거 , 처음 5517 -> 중복제거 후 1930
		List<String> playerIdList = list.stream()
										.map( (allStarVO) -> allStarVO.getPlayerID())
										.distinct()	//중복제거
										.sorted()	//정렬
										.collect(Collectors.toList());
		playerIdList.forEach(System.out::println);
		System.out.println("================================================================");
		//startingPos가 4인 data들의 playerID만 가져와서 중복제거 및 정렬
		List<String> playerIdListWithStartingPos4 = list.stream()
														.filter( (allStarVO) -> allStarVO.getStartingPos() == 4)
														.map( (allStarVO) -> allStarVO.getPlayerID())
														.distinct()
														.sorted()
														.collect(Collectors.toList());
		playerIdListWithStartingPos4.forEach(System.out::println);
		System.out.println("================================================================");
		// 1. gameNUm이 0이 아닌 것을 추출해 출력하세요.
		List<AllStarFullVO> gameNumList = list.stream()
										.filter( (allStarVO) -> allStarVO.getGameNum()!=0)
										.collect(Collectors.toList());
		gameNumList.forEach((allStarVO)->{
			System.out.print(allStarVO.getGameNum()+" ");
			System.out.println(allStarVO.getPlayerID());
		});
		System.out.println("================================================================");
		// 2. gameNum이 0인 것을 추출해 출력하세요.
		List <AllStarFullVO> gameNumList2 = list.stream()
												.filter( (allStarVO) -> allStarVO.getGameNum()==0)
												.collect(Collectors.toList());
		System.out.println("================================================================");
		// 3. 1950년대에 플레이한 선수의 이름만 출력하세요.
		list.stream()
			.filter( (allStarVO) -> allStarVO.getYear().startsWith("195"))
			.map( (allStarVO) -> allStarVO.getPlayerID())
			.forEach(System.out::println);
		System.out.println("================================================================");
		// 4. 2000년대 BOS 팀의 선수 이름을 중복제거한 후 출력하세요.
		list.stream()
			.filter( (allStarVO) -> allStarVO.getYear().startsWith("200"))
			.filter( (allStarVO) -> allStarVO.getTeamID().toUpperCase().equals("BOS"))
			.map((allStarVO)->allStarVO.getPlayerID())
			.distinct()
			.forEach(System.out::println);
		System.out.println("================================================================");
		// 5. 1937년 DET 팀의 선수 중 첫 번째 선수 이름을 출력하세요.
		AllStarFullVO name1937DET = list.stream()
		 								.filter( (allStarVO) -> allStarVO.getYear().equals("1937"))
										.filter( (allStarVO) -> allStarVO.getTeamID().toUpperCase().equals("DET"))
										.findFirst()
										.orElse(new AllStarFullVO());
								 
		System.out.println(name1937DET.getPlayerID());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 16번문제 7번 이건회
		
	}
}
