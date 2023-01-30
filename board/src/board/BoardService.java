package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 게시판 기능 서비스
 * @author User
 *
 */
public class BoardService {
	
	/**
	 * 게시글 목록
	 */
	private List <BoardVO> boardList = new ArrayList<>();
	
	/**
	 * 게시글 등록
	 * 순번은 boardList의 size로 생성하고 조회수는 0으로 초기화한다.
	 * @param subject 제목
	 * @param writer 작성자
	 */
	public void create(String subject, String writer) {
		BoardVO boardVO = new BoardVO();
		boardVO.setNumber(boardList.size());
		boardVO.setSubject(subject);
		boardVO.setWriter(writer);
		boardVO.setReadCount(0);
		boardList.add(boardVO);
	}
	
	/**
	 * 게시글 수정
	 * 제목만 수정할 수 있다.
	 * @param index 게시글의 인덱스
	 * @param subject 제목
	 */
	public void update(int index, String subject) {
		BoardVO boardVO = boardList.get(index);
		boardVO.setSubject(subject);
	}
	
	/**
	 * 게시글 삭제
	 * 한 건의 게시글만 삭제할 수 있다.
	 * @param index 삭제하려는 게시글 인덱스
	 */
	public void delete(int index) {
		boardList.remove(index);
	}
	/**
	 * 게시글 조회
	 * @param index 조회하려는 게시글의 인덱스
	 */
	public void read(int index) {
		
		if(boardList.size() <= index) {
			System.out.println(index+"번 게시글은 존재하지 않습니다.");
			return;
		}
		
		BoardVO boardVO = boardList.get(index);
		int readCount = boardVO.getReadCount();
		readCount+=1;
		boardVO.setReadCount(readCount);
		
		System.out.println("순번:"+boardVO.getNumber());
		System.out.println("제목:"+boardVO.getSubject());
		System.out.println("작성자:"+boardVO.getWriter());
		System.out.println("조회수:"+boardVO.getReadCount());
	}
	
	public void readAll() {
		for(int i=0;i<boardList.size();i++) {
			int readCount = boardList.get(i).getReadCount();
			readCount+=1;
			boardList.get(i).setReadCount(readCount);
			System.out.println("인덱스: "+i);
			System.out.println("순번:"+boardList.get(i).getNumber());
			System.out.println("제목:"+boardList.get(i).getSubject());
			System.out.println("작성자:"+boardList.get(i).getWriter());
			System.out.println("조회수:"+boardList.get(i).getReadCount()+"\n");
		}
	}
	
	public void readAllWithOutIndex() {
		boardList.forEach((boardVO)->{
			int readCount = boardVO.getReadCount();
			readCount+=1;
			boardVO.setReadCount(readCount);
			System.out.println("순번:"+boardVO.getNumber());
			System.out.println("제목:"+boardVO.getSubject());
			System.out.println("작성자:"+boardVO.getWriter());
			System.out.println("조회수:"+boardVO.getReadCount()+"\n");
		});
	}
	
	public static void main(String[] args) {
		BoardService boardService = new BoardService();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 조회");
			System.out.println("5. 종료");
			int menu = scan.nextInt();
			scan.nextLine();	//enter를 한번 없애서 제목입력과 작성자입력이 동시에 뜨는 버그 해결
			if(menu == 1) {
				//등록
				System.out.println("제목을 입력하세요.");
				String subject = scan.nextLine();
				
				System.out.println("작성자를 입력하세요.");
				String writer = scan.nextLine();
				
				boardService.create(subject, writer);
				System.out.println("게시글이 등록되었습니다.");
			}else if(menu == 2) {
				//수정
				System.out.println("수정할 글의 번호를 입력하세요.");
				int updateNum = scan.nextInt();
				
				System.out.println("수정할 내용을 입력하세요(제목).");
				String subject = scan.nextLine();
				
				boardService.update(updateNum, subject);
				System.out.println("게시글이 수정되었습니다.");
			}else if(menu == 3) {
				//삭제
				System.out.println("삭제할 글의 번호를 입력하세요.");
				int deleteNum = scan.nextInt();
				
				boardService.delete(deleteNum);
				System.out.println("게시글이 삭제되었습니다.");
			}else if(menu == 4) {
				//조회
				boardService.readAllWithOutIndex();
				System.out.println("모든 게시글을 조회했습니다.");
			}else {
				//종료
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
