package todo_item;

public class TodoItemVO {
	private boolean isComplete;
	private String itemName;
	
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
