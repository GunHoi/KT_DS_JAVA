package bulletin_board;
import java.util.ArrayList;
import java.util.List;


public class BulletinBoard {
	private List<Information> infoList = new ArrayList<>();
	
	/**
	 * 등록
	 */
	public void enroll(String title, String writers, int views) {
		Information info = new Information();
		info.setTextNumber(infoList.size()+1);
		info.setTitle(title);
		info.setWriter(writers);
		info.setViews(views);
		infoList.add(info);
	}
	/**
	 * 조회
	 */
	public void lookUp(int index) {
		Information info = infoList.get(index);
		int viewCount = info.getViews();
		viewCount+=1;
		info.setViews(viewCount);
		System.out.println("No."+info.getTextNumber());
		System.out.println("	제목: "+info.getTitle());
		System.out.println("	작성자: "+info.getWriter());
		System.out.println("	조회수: "+info.getViews()+"\n");
	}
	/**
	 * 수정
	 */
	public void modify(int index, String title) {
		Information info = infoList.get(index);
		info.setTitle(title);
	}
	/**
	 * 삭제
	 */
	public void delete(int index) {
		infoList.remove(index);
	}
	public static void main(String[] args) {
		BulletinBoard board = new BulletinBoard();
		board.enroll("사과", "사과농부", 0);
		board.enroll("바나나", "바나나농부", 0);
		board.enroll("메론", "메론농부", 0);
		
		board.lookUp(0);
		board.lookUp(0);
		board.lookUp(0);
		
		board.lookUp(1);
		board.lookUp(2);
		
		board.modify(0, "왕사과");
		board.lookUp(0);
		
		board.delete(1);
		board.lookUp(1);
	}

}
