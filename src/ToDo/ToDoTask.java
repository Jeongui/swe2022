package ToDo;

import java.sql.Time;
import java.util.Date;

public class ToDoTask implements Comparable<ToDoTask>{
    private String taskname;
    private Date deadline;
    private boolean done;
    private Time alarmTime;


    public ToDoTask(String taskname) {
        this.taskname = taskname;
        this.deadline = new Date();
        this.done = false;
        this.alarmTime = new Time();
    }

    public void setTaskname(String settingname) {
        this.taskname = settingname;
    }

    public void setDeadline(int year1, int month1, int date1){
        this.deadline.setYear(year1);
        this.deadline.setDate(date1);
        this.deadline.setMonth(month1);
    }

    public void setDone(boolean status){
        this.done = status;
    }

    public void isAlarm(Time alarm){
        this.alarmTime = alarm;
        if (Time == alarmTime) {
            return true;
        }
    }

    @Override
    public int compareTo(ToDoTask o) {
        return 0;
    }
}

