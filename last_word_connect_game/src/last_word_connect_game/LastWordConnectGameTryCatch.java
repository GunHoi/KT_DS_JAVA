package last_word_connect_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastWordConnectGameTryCatch {

	public static void checkWord(String inputWord, String lastWord) {
		
		if (inputWord.equals("포기")) {
			throw new WrongWordException();
		}
		
		if (inputWord.length() < 3) {
			throw new InvalidWordException();
		}
		
		if (!(inputWord.startsWith(lastWord))) {
			throw new WrongWordException();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> wordList = new ArrayList<>();
		String startWord = null;

		System.out.println("끝말잇기 게임 시작");
		while (true) {
			System.out.println("시작 단어를 입력하세요.");
			System.out.print("> ");

			startWord = scan.nextLine();
			startWord = startWord.trim();
			startWord = startWord.replace(" ", "");

			if (startWord.length() >= 3) {
				break;
			} else {
				System.out.println('\"' + startWord + "\"은(는) " + startWord.length() + "글자 입니다. 3글자 이상 단어를 입력하세요.");
			}
		}

		String lastWord = startWord.substring(startWord.length() - 1, startWord.length());
		wordList.add(startWord);

		while (true) {
			System.out.println('\"' + lastWord + "\"로 시작하는 단어를 입력하세요.");
			System.out.print("> ");
			String inputWord = scan.nextLine();
			inputWord = inputWord.replace(" ", "");

			try {
				checkWord(inputWord, lastWord);
				if (wordList.contains(inputWord)) {
					System.out.println("이미 입력한 단어입니다.");
					continue;
				}
				lastWord = inputWord.substring(inputWord.length() - 1);
				wordList.add(inputWord);
			} catch (InvalidWordException iwe) {
				System.out.println(inputWord + "는 " + inputWord.length() + "자리 단어 입니다.");
				System.out.println("3자리 이상의 단어를 입력하세요.");
				break;
			} catch (WrongWordException wwe) {
				System.out.println(inputWord + "을 입력했습니다. 게임을 종료합니다.");
				break;
			}
		}

		System.out.println("게임이 종료됩니다.\n");
		System.out.println("입력된 단어들은");

		wordList.forEach(word -> {
			System.out.println(word);
		});

		System.out.println("입니다.");
		scan.close();
	}

}
