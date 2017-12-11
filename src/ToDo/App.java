package ToDo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class App implements Serializable {
    private ArrayList<TodoList> appTodoList;
    public String appOwner;

    public App(String userName) {
        this.appOwner = userName;
        appTodoList = new ArrayList<TodoList>();
    }

    public void removeTodoList(TodoList list1) {
        appTodoList.remove(list1);
    }

    public void addTodoList(TodoList list1) {
        appTodoList.add(list1);
    }

    public void getTodoList() {
        for (TodoList a : this.appTodoList) {
            String b = a.getListname();
            System.out.println(b);
        }
    }

    public ArrayList<TodoList> getAppTodoList() {
        return appTodoList;
    }

    public String getAppOwner() {
        return appOwner;
    }

    public void viewTodoList() { //3주차 print
        for (TodoList a : this.appTodoList) {
            int sizeOfTodoList = a.getTodoTasks().size();
            String result = String.format("- %s %d", a.getListname(), sizeOfTodoList);
            System.out.println(result);
        }
    }

    public TodoList findAppTodoList(String aaa) {
        TodoList result = null;
        for (TodoList t : appTodoList) {
            boolean k = t.getListname().equals(aaa);
            if (k) {
                result = t;
            }
        }
        return result;
    }

    public void save() throws IOException {
        Path path = Paths.get("/c:/test");
        OutputStream out = Files.newOutputStream(path);
        Files.copy((Path) out, path, StandardCopyOption.REPLACE_EXISTING);
    }

}