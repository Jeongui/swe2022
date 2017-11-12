package ToDo;

import java.util.ArrayList;

public class ToDoTask {

    private static ArrayList<String> task = new ArrayList<>() ;

    private final String name;
    private final int date;

    public ToDoTask(String name) throws Exception{
        if(task.contains(name)) throw new Exception();
        this.name = getName();
        this.date = getDate();
        task.add(this.name);
    }

    private String getName() {
        return name;
    }

    private int getDate() {
        return date;
    }

    private int today = 171112;
    public boolean ifComplete(){
        if (date > today) return false;
        return true;
    }

}

