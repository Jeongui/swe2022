package ToDo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    ArrayList <ToDoList> todoLists ;


    public static void main(ArrayList todoLists){
        Scanner in = new Scanner(System.in).useDelimiter("\\s");
        while (in.hasNext()){
            String name = in.next();
            int tasks = in.nextByte();
            if (name==null) break;
        }
    }

    public App(){
        this.todoLists = new ArrayList<>();
    }

    public void addList(ToDoList newList){
        todoLists.add(newList);
        return main(ArrayList);
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


    public void list (String list){
        Scanner in = new Scanner(list).useDelimiter("\\s");
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
