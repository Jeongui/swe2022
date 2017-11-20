package ToDo;

import java.util.Date;

public class ToDoTask implements Comparable<ToDoTask>{
    private String taskname;
    private Date deadline;
    private boolean done;


    public ToDoTask(String taskname) {
        this.taskname = taskname;
        this.deadline = new Date();
        this.done = false;
    }

    public void setTaskname(String settingname) {
        this.taskname = settingname;
    } // 할 일

    public void setDeadline(int year1, int month1, int date1){
        this.deadline.setYear(year1);
        this.deadline.setDate(date1);
        this.deadline.setMonth(month1);
    } //기한 설정

    public void setDone(boolean status){
        this.done = status;
    } // 완료 여부 확인

    public String getTaskname() {
        return this.taskname;
    }

    public String getDeadline() {
        int year1 = deadline.getYear();
        int month1 = deadline.getMonth();
        int date1 = deadline.getDate();
        String yyyymmdd = year1 + "/" + month1 + "/" + date1;
        return yyyymmdd;
    }

    public Boolean getDone() {
        return this.done;
    }

    @Override
    public int compareTo(ToDoTask o) {
        return 0;
    }
}

