package last_word_connect_game;

/**
 * 잘못된 단어를 입력한 경우 혹은 "포기"를 입력한 경우 던질 예외
 * @author gunhoe
 */
public class WrongWordException extends RuntimeException{

	private static final long serialVersionUID = -2917344251902192491L;
	
	public WrongWordException() {
		super();
	}
}
