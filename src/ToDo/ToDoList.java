package ToDo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ToDoList {
        private String listName;
        ArrayList<ToDoTask> todoTasks = new ArrayList<>();
        private ToDoTheme listTheme;
        boolean listSorted;

        public ToDoList(String listname){
            this.listName=listname;
            this.todoTasks = new ArrayList<>();
            this.listSorted = false;
            this.listTheme = new ToDoTheme();
        }

        public void setListName(String newName){
            this.listName=newName;
        }

        public Object getName() {
            return listName;
        }

        public enum sorting {CHR, REVERSE_CHR, DEADLINE,REVERSE_DEADLINE, CREATINGTIME, REVERSE_CREATINGTIME, COMPLETED, REVERSE_COMPLETED};
        public void sortTask(sorting sortingOption){
            this.listSorted = true;
            switch(sortingOption){
                case CHR:
                    Collections.sort(todoTasks, sortByChr);
                    break;
                case REVERSE_CHR:
                    Comparator sortByChr2 = Comparator.reverseOrder();
                    Collections.sort(todoTasks,sortByChr2);
                    break;
                case DEADLINE:Collections.sort(todoTasks, sortByDeadline);
                    break;
                case REVERSE_DEADLINE:
                    Comparator sortByDeadline2 = Comparator.reverseOrder();
                    Collections.sort(todoTasks, sortByDeadline2);
                    break;
                case CREATINGTIME:Collections.sort(todoTasks, sortByCreation);
                    break;
                case REVERSE_CREATINGTIME:
                    Comparator sortByCreation2 = Comparator.reverseOrder();
                    Collections.sort(todoTasks, sortByCreation2);
                    break;
                case COMPLETED:Collections.sort(todoTasks, sortByCompleted);
                    break;
                case REVERSE_COMPLETED:
                    Comparator sortByCompleted2 = Comparator.reverseOrder();
                    Collections.sort(todoTasks, sortByCompleted2);
                    break;
            }
        }

        public void changeThemeColor(ToDoTheme.TodoThemeColors newColor){
            listTheme.changeThemeColor(newColor);
        }
        public void changeThemeImage(ToDoTheme.TodoThemeImages newImage){
            listTheme.changeThemeImage(newImage);
        }

        //목록삭제 . 요청한 task가 목록 안에 있을 때만 삭제
        public void removeTask(ToDoTask task){
            if (todoTasks.contains(task)) {
                this.todoTasks.remove(task);
            }
        }

        public void addTask(ToDoTask newTask){
            this.listSorted=false;
            todoTasks.add(newTask);
        }

        public String getList(){
            if (todoTasks.isEmpty()) return "목록이 비어있습니다. 할 일을 추가해주세요";
            else return todoTasks.toString();
        }

        public final Comparator sortByChr = new Comparator<ToDoTask>() {
            @Override
            public int compare(ToDoTask o1, ToDoTask o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        public final Comparator sortByDeadline = new Comparator<ToDoTask>() {
            @Override
            public int compare(ToDoTask o1, ToDoTask o2) {
                return o1.getDeadline().compareTo(o2.getDeadline());
            }
        };

        public final Comparator sortByCreation = new Comparator<ToDoTask>() {

            @Override
            public int compare(ToDoTask o1, ToDoTask o2) {
                return o1.getCreatingTime().compareTo(o2.getCreatingTime());
            }
        };

        public final Comparator sortByCompleted = new Comparator<ToDoTask>() {

            @Override
            public int compare(ToDoTask o1, ToDoTask o2) {
                return o1.getCompleted().compareTo(o2.getCompleted());
            }
        };
    }
