package todo_item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TodoItemService {
	private List<TodoItemVO> todoItemList;
	
	//생성자
	public TodoItemService() {
		todoItemList = new ArrayList<>();
	}

	public List<TodoItemVO> getTodoList() {
		return todoItemList;
	}

	public void setTodoList(List<TodoItemVO> todoList) {
		this.todoItemList = todoList;
	}
	
	public void create(String itemName) {
		TodoItemVO todoItemVO = new TodoItemVO(itemName);
		todoItemVO.setItemName(itemName);
		todoItemList.add(todoItemVO);
	}
	
	public void update(int index, boolean isComplete) {
		TodoItemVO todoItemVo = todoItemList.get(index);
		todoItemVo.setComplete(isComplete);
	}
	
	public void delete(int index) {
		todoItemList.remove(index);
	}
	
	public void read() {
		todoItemList.forEach((todoItem)->{
			String ItemName = todoItem.getItemName();
			boolean flag = todoItem.getIsComplete();
			String flagTag;
			if(flag) {
				flagTag = "X";
			}else {
				flagTag = " ";
			}
			System.out.println("["+flagTag+"] "+ItemName);
		});
	}
	
	public boolean isExists(int index) {
		if(todoItemList.size() <= index) {
			System.out.println("아이템이 존재하지 않습니다.");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		TodoItemService todoItemService = new TodoItemService();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====================");
			System.out.println("1. 등록\r\n"
					+ "2. 수정\r\n"
					+ "3. 삭제\r\n"
					+ "4. 조회\r\n"
					+ "5. 종료");
			System.out.println("=====================");
			System.out.println("메뉴를 입력하세요:");
			int menu = scan.nextInt();
			scan.nextLine();
			if(menu == 1) {
				//등록
				System.out.println("TODO 명을 입력하세요:");
				String itemName = scan.nextLine();
				
				todoItemService.create(itemName);
				System.out.println("아이템이 등록되었습니다.");
			}else if(menu == 2) {
				//수정
				System.out.println("수정할 아이템 번호를 입력하세요:");
				int updateIndex = scan.nextInt();
				scan.nextLine();
				if(todoItemService.isExists(updateIndex)) {
					System.out.println("아이템이 완료되었다면 \"Y\"를 입력하세요:");
					String isYN = scan.nextLine();
					
					boolean isComplete;
					if(isYN.equals("Y")||isYN.equals("y")) {
						isComplete = true;
						todoItemService.update(updateIndex, isComplete);
						System.out.println("["+todoItemService.todoItemList.get(updateIndex).getItemName()+"]이 완료되었습니다.");
					}else if(isYN.equals("N")||isYN.equals("n")) {
						isComplete = false;
						todoItemService.update(updateIndex, isComplete);
						System.out.println("["+todoItemService.todoItemList.get(updateIndex).getItemName()+"]이 미완료되었습니다.");
					}else {
						System.out.println("Y 또는 N을 입력해주세요.");
					}
				}

			}else if(menu == 3) {
				//삭제
				System.out.println("삭제할 아이템 번호를 입력하세요:");
				int deleteNum = scan.nextInt();
				if(todoItemService.isExists(deleteNum)) {
					todoItemService.delete(deleteNum);
					System.out.println("아이템이 삭제되었습니다.");
				}
			}else if(menu == 4) {
				//조회
				todoItemService.read();
				System.out.println("총 "+todoItemService.todoItemList.size()+"개의 아이템이 조회되었습니다.");
			}else {
				//종료
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
	}
}
