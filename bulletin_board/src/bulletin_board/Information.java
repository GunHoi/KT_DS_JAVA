package bulletin_board;

/**
 * 등록
 * @author User
 *
 */
public class Information {
	/**
	 * 제목
	 */
	private String title;
	/**
	 * 작성자
	 */
	private String writer;
	/**
	 * 조회수
	 */
	private int views;
	/**
	 * 글번호
	 */
	private int textNumber;
	
	public int getTextNumber() {
		return textNumber;
	}
	public void setTextNumber(int textNumber) {
		this.textNumber = textNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
}
