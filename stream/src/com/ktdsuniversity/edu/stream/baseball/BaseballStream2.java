package com.ktdsuniversity.edu.stream.baseball;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaseballStream2 {
	
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
		
		// 1. 1933년 NYA팀의 3번째 선수의 playerID를 출력.
		Optional <String> pid1933NYA3rd = list.stream()
										  .filter((allStarFullVO) -> allStarFullVO.getYear().equals("1933"))
										  .filter((allStarFullVO) -> allStarFullVO.getTeamID().toUpperCase().equals("NYA"))
										  .map((allStarFullVO) -> allStarFullVO.getPlayerID())
										  .skip(2)
										  .limit(1)
										  .findFirst();
		System.out.println(pid1933NYA3rd.orElse("없음")+"\n");
		
		// 2. 1700년 NYA팀의 3번째 선수의 playerID를 출력.
		
		Stream <AllStarFullVO> listStreamIn1700NYA3rd = list.stream();
		Stream <AllStarFullVO> playersIn1700 = listStreamIn1700NYA3rd.filter((vo)->vo.getYear().equals("1700"));
		Stream <AllStarFullVO> playersInNYA = playersIn1700.filter((vo)->vo.getTeamID().toUpperCase().equals("NYA"));
		Stream <String> playersConvertStringId = playersInNYA.map((vo)->vo.getPlayerID());
		Stream <String> playersSkiped2 = playersConvertStringId.skip(2);
		Stream <String> playersLimited1 = playersSkiped2.limit(1);
		Optional <String> playersFindFirst = playersLimited1.findFirst();
		String playersOrElse = playersFindFirst.orElse("없음");
		
		System.out.println(playersOrElse+"\n");
		
		// 3. 1934년 CHA 팀에서 startingPos가 8인 선수의 playerID를 출력.
		Optional <String> player1934CHASP81st = list.stream()
												 .filter((vo)->vo.getYear().equals("1934"))
												 .filter((vo)->vo.getTeamID().toUpperCase().equals("CHA"))
												 .filter((vo)->vo.getStartingPos()==8)
												 .map((vo)->vo.getPlayerID())
												 .findFirst();
		System.out.println(player1934CHASP81st.orElse("없음")+"\n");
		
		// 4. 1934년 CHA 팀에서 startingPos가 8인 두 번째 선수의 playerID를 출력.
		Optional <String> player1934CHASP82nd = list.stream()
													 .filter((vo)->vo.getYear().equals("1934"))
													 .filter((vo)->vo.getTeamID().toUpperCase().equals("CHA"))
													 .filter((vo)->vo.getStartingPos()==8)
													 .map((vo)->vo.getPlayerID())
													 .skip(1)
													 .findFirst();
		System.out.println(player1934CHASP82nd.orElse("없음")+"\n");		
		
		// 5. gomezle01 선수가 속한 팀의 매니저 playerID를 출력(flatMap)
		Optional<String> managerId = list.stream()
										 .filter((vo)->vo.getPlayerID().equals("gomezle01"))
										 .map((vo)->vo.getTeamID())
										 .flatMap(teamId -> {
											 String searchTeamId = "," +teamId+",";
											 try {					
												 return Files.readAllLines(Paths.get("C:\\Devs\\data\\baseball\\core\\Managers.csv"))
															  .stream()
															  .filter(line -> line.contains(searchTeamId))
															  .map(line -> line.split(",")[0]);
											 }catch(IOException ioe) {
												 return Stream.empty();
											 }
										 })
										 .findFirst();
		System.out.println(managerId.orElse("없음"));
		
		// 5-1. 1933년에 출전한 TeamID별 playerID를 모두 출력.(group)
		Map<String, List<AllStarFullVO>> playerId1933TeamId = list.stream()
														  		  .filter(vo->vo.getYear().equals("1933"))
														  		  .collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		playerId1933TeamId.forEach((key,value)->{
			System.out.print("\n"+key+" : ");
			value.forEach(vo->{
				System.out.print(vo.getPlayerID()+" ");
			});
		});
		
		System.out.println();
		// 5-2. 1933년에 출전한 TeamID별 playerId의 수를 모두 출력. (group)
		Map<String, List<AllStarFullVO>> playerId1933TeamIdCount = list.stream()
																	   .filter(vo->vo.getYear().equals("1933"))
																	   .collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		playerId1933TeamIdCount.forEach((key, value)->{
			System.out.print("\n"+key+" : "+value.size());
		});
		System.out.println();
		
		// 6,7. TeamID별 출전연도를 모두 출력(중복제거)
		Map<String, List<AllStarFullVO>> yearByTeamId = list.stream()
															.collect(Collectors.groupingBy(AllStarFullVO::getTeamID));
		yearByTeamId.forEach((key, value)->{
			System.out.print("\n"+key+" > ");
			value.stream()
				 .map(vo->vo.getYear())
				 .distinct()
				 .forEach(vo->{
						System.out.print(vo+" ");
				  });
		});
		
		System.out.println("\n\n6,7 번 동일한 문제를 Key값에 맞춰 내림차순");
		yearByTeamId.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(entry -> {
			System.out.print("\n"+entry.getKey()+" > ");
			entry.getValue().forEach(value->{
				System.out.print(value.getYear()+" ");
			});
		});
	
	}
}








































