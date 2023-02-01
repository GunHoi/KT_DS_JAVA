package todo_item;
/**
 * ToDoList 객체
 * @author gunhoe
 */
public class TodoItemVO {
	/**
	 * 완료여부
	 */
	private boolean isComplete;
	/**
	 * 아이템이름(TodoList)
	 */
	private String itemName;
	
	//생성자
	public TodoItemVO(String itemName) {
		setItemName(itemName);
		setComplete(false);
	}
	public boolean getIsComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
