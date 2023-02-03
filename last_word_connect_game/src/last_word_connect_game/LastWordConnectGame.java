package last_word_connect_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastWordConnectGame {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List <String> wordList = new ArrayList<>();
		String startWord = null;
		
		System.out.println("끝말잇기 게임 시작");
		while(true) {
			System.out.println("시작 단어를 입력하세요.");
			System.out.print("> ");
			
			startWord = scan.nextLine();
			startWord = startWord.trim();
			startWord = startWord.replace(" ", "");
			
			if(startWord.length()>=3) {
				break;
			}else {
				System.out.println('\"'+startWord+"\"은(는) "+startWord.length()+"글자 입니다. 3글자 이상 단어를 입력하세요.");
			}
		}
		
		String lastWord = startWord.substring(startWord.length()-1, startWord.length());
		wordList.add(startWord);
		
		while(true) {
			System.out.println('\"'+lastWord+"\"로 시작하는 단어를 입력하세요.");
			System.out.print("> ");
			String inputWord = scan.nextLine();
			
			inputWord = inputWord.trim();
			inputWord = inputWord.replace(" ", "");
			
			if(inputWord.equals("포기")) {
				System.out.println('\"'+inputWord+"\"를 입력했습니다.");
				break;
			}
			
			if(inputWord.length()<3) {
				System.out.println('\"'+inputWord+"\"은(는) "+inputWord.length()+"글자 입니다. 3글자 이상 단어를 입력하세요.");
				continue;
			}
			
			if(!(inputWord.startsWith(lastWord))) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			if(wordList.contains(inputWord)) {
				System.out.println("이미 입력한 단어입니다.");
				continue;
			}
			
			lastWord = inputWord.substring(inputWord.length()-1);
			wordList.add(inputWord);
			
		}
		
		System.out.println("게임이 종료됩니다.\n");
		System.out.println("입력된 단어들은");
		
		wordList.forEach(word->{
			System.out.println(word);
		});
		
		System.out.println("입니다.");
		scan.close();
	}

}
