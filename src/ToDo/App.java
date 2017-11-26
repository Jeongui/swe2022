package ToDo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    ArrayList <ToDoList> todoLists;

    //생성자
    public App(){
        this.todoLists = new ArrayList<>();
    }

    public void addList(ToDoList newList){
        todoLists.add(newList);

    }

    public void removeList(ToDoList list){
        if (!(todoLists.isEmpty())
                && todoLists.contains(list))
            todoLists.remove(list);
    }

    public String getList(){
        if (todoLists.isEmpty()) return "리스트를 추가해 주십시오";
        else return todoLists.toString();
    }

    //3번과제
    public void list (String list){
        Scanner in = new Scanner(list).useDelimiter("\\n");
        System.out.println("Set the list name");
        String listName = in.nextLine();
        System.out.println("Set the deadline");
        int deadline = in.nextInt();
        System.out.println("Check the alarm");
        boolean isAlarm = in.hasNext();
        if (isAlarm = true) return (listName, deadline, isAlarm);
        return (listName, deadline);
    }


}
