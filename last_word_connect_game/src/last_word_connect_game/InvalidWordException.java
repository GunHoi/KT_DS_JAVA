package last_word_connect_game;

/**
 * 3자리 미만의 단어를 입력했을 경우 던질 예외
 * @author gunhoe
 *
 */

public class InvalidWordException extends RuntimeException {

	private static final long serialVersionUID = -6902830800437766283L;
	
	public InvalidWordException() {
		super();
	}
	
}
