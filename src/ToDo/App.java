package ToDo;


public class App {

    private String newName;

    public App (String listName){
        this.newName = listName;
    }

    public void resetListName{
        ToDoList.listName = null;
        ToDoList.listName = newName;
    }

    public void addList{
        ToDoList toDoList1 = new ToDoList();
    }

    public void addTask{
        ToDoTask toDoTask1 = new ToDoTask();
    }
}
