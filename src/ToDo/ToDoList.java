package ToDo;

import java.util.ArrayList;

public class ToDoList {

    private static ArrayList<String> doList = new ArrayList<>() ;

    private String name;

    public ToDoList (String name) throws Exception{
        if(doList.contains(name)) throw new Exception();
        this.name = name;
        doList.add(this.name);
    }

    public void setName(String name) throws Exception{
        if (name == this.name) return;
        if(doList.contains(name)) throw new Exception();
        doList.remove(this.name);
        this.name = name;
        doList.add(this.name);
    }

    public void setDirection() {

    }

    public void setTheme(){

    }

    public void hideList(){

    }

    public void delList() {
        doList.remove(this.name);
    }

    public void sendList() {
        System.out.println(doList.hashCode());
    }
}
