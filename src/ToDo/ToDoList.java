package ToDo;

import java.util.ArrayList;
import java.util.Collections;

public class ToDoList {

    public static String listName;
    private ToDoTheme listTheme;
    private ArrayList<ToDoTask> todoTasks;
    private boolean listSorted;

    public ToDoList (String name) {
        this.listName = name;
        ToDoTheme defaultTheme = new ToDoTheme();
        this.listTheme = defaultTheme;
        this.todoTasks = new ArrayList<>();
        this.listSorted = false;
    }

    public void setListName(String listName1){
        this.listName = listName1;
    } // 목록 이름 설정

    public void setListTheme(ToDoTheme listTheme1){
        this.listTheme = listTheme1;
    } // 테마 설정

    public void addToDoTasks(ToDoTask todoTasks1){
        this.todoTasks.add(todoTasks1);
        this.listSorted = false;
    } //할 일 추가

    public void doSort(){
        Collections.sort(todoTasks);
        this.listSorted = true;
    } //정렬

    public ToDoTheme getListTheme() {
        return listTheme;
    }

    private String getListName() {
        return this.listName;
    }
}
