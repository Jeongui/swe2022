package ToDo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class TodoList implements Serializable {
    private String listName;
    private TodoTheme listTheme;
    private ArrayList<TodoTask> todoTasks;
    private boolean listSorted;

    public TodoList(String name) {
        this.listName = name;
        this.todoTasks = null;
        TodoTheme defaultTheme = new TodoTheme();
        this.listTheme = defaultTheme;
        this.todoTasks = new ArrayList<>();
    }

    public void setListName(String name1) {
        this.listName = name1;
    }

    public void setTheme(TodoTheme newtheme) {
        this.listTheme = newtheme;
    }


    public void addtoTodoTasks(TodoTask t1) {
        this.todoTasks.add(t1);
    }

    public TodoTask findTodoTask(String completeTaskName) {
        TodoTask result = null;
        for (TodoTask t : todoTasks) {
            boolean k = t.getTaskname().equals(completeTaskName);
            if (k) { result = t; }
        }
        return result;
    }

    public enum TodoTaskSortingMethodop {
        SORTINGMETHOD_BY_TN,SORTINGMETHOD_BY_DL,SORTINGMETHOD_BY_GD,SORTINGMETHOD_BY_ISDONE;
    }

    public void doReverseSort(){
        Collections.reverse(this.todoTasks);
    }

    public void deleteTodoTask(TodoTask t1) {
        if (!(this.todoTasks.contains(t1))) {
            System.out.println("존재하지 않는 항목");
        }
        this.todoTasks.remove(t1);
    }

    public TodoTheme getListTheme() {
        return listTheme;
    }

    public String getListname() {
        return this.listName;
    }

    public ArrayList<TodoTask> getTodoTasks() {
        return this.todoTasks;
    }
}