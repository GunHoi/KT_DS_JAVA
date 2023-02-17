package prcatice_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrcaticeString {
	public static void main(String[] args) {
		
		Date d = new Date();
		
		String date = "2023-02-03 11:01:15";
		
		String year1 = date.substring(0,4);
		String month1 = date.substring(5,7);
		String day1 = date.substring(8,10);
		String hour1 = date.substring(11,13);
		String min1 = date.substring(14,16);
		String sec1 = date.substring(17);
		
		System.out.println("년:"+year1+" 월:"+month1+" 일:"+day1+ " 시:"+hour1+" 분:"+min1+" 초:"+sec1);
		
		String[] dateArray = date.split("[-: ]");
		System.out.println("년:"+dateArray[0]+" 월:"+dateArray[1]+" 일:"+dateArray[2]+ " 시:"+dateArray[3]+" 분:"+dateArray[4]+" 초:"+dateArray[5]);
		
		List<String> dateList = Arrays.asList(dateArray);
		List<String> dateList2 = Arrays.asList(date.split("[-: ]"));
		
		System.out.println(dateList);
		System.out.println(dateList2);
		
		for(String word : dateList) {
			System.out.println(word);
		}
		System.out.println("----------------------------------------------------------");
		
		String url = "https://www.google.co.kr/asdadasda";
		System.out.println(url.indexOf("://"));
		
		String urlProtocol = Arrays.asList(url.split("://")).get(0);
		System.out.println(urlProtocol);
		
		String protocol = url.substring(0,url.indexOf("://"));
		
		System.out.println("\n-----[:.] split 후 // repalce로 없애는 방법-----");
		List<String> urlList = Arrays.asList(url.split("[:.]"));
		
		System.out.println(urlList);
		urlList.set(1, urlList.get(1).replace("//", ""));
		
		System.out.println(urlList+"\n");
		
		System.out.println("-----[://./] split으로 한번에 자르는 방법-----");
		List<String> urlList2 = Arrays.asList(url.split("(://|\\.)"));
		List<String> urlList3 = Arrays.asList(url.split("[(://)./]"));
		
		System.out.println(urlList2);
		System.out.println(urlList3);
		
		
		System.out.println("\n-----( ) Test------");
		
		String abc = "aaabaaabaacd";
		List<String> abcList = Arrays.asList(abc.split("[(ab)]"));
		List<String> abcList2 = Arrays.asList(abc.split("^(010|011|017|019|080|02).[0-9]{4}"));
		List<String> abcList3 = Arrays.asList(abc.split("ab"));
		System.out.println(abcList);
		System.out.println(abcList2);
		System.out.println(abcList3);
		
		
	}
}
