package ToDo;

import java.time.LocalDate;

public class ToDoTask {
        private String taskName;
        private boolean completed = false;
        private LocalDate deadline; //기본 마감기한은 오늘
        private LocalDate alarmTime=null;
        private final LocalDate creatingTime=LocalDate.now(); //생성 시점은 final

        public ToDoTask(String taskName){
            this.taskName= taskName;
            this.completed = false;
            this.deadline = LocalDate.now();//오늘
            this.alarmTime = null;
        }

        public boolean isCompletedTask(ToDoTask task){
            if (task.completed==true) return true;
            else
                return false;
        }

        public String taskComplete(ToDoTask task){
            task.completed = true;
            return "task is completed";
        }
        public void taskNotComplete(ToDoTask task){
            task.completed=false;
        }

        public void setSelectedDeadline(int yy, int mm, int dd){
            this.deadline=LocalDate.of(yy,mm,dd);
        }
        public void setDeadlineOptions(String option){
            switch (option){
                case "today" : this.deadline=LocalDate.now(); break;
                case "tomorrow": this.deadline=LocalDate.now().plusDays(1);break;
                case "nextWeek": this.deadline=LocalDate.now().plusWeeks(1);break;
                default: System.out.println("plz enter option: today, tomorrow, or nextWeek");
            }
        }

        public void getAlarmTime(int yy, int mm, int dd){
            this.alarmTime = LocalDate.of(yy,mm,dd);
        }
        public void removeAlarmTime(){
            this.alarmTime=null;
        }
        private boolean check(){
            if (this.alarmTime==null) return false;//알람타임이 없다
            if (this.alarmTime.compareTo(LocalDate.now())<=0) return false; //미리 알림 시간을 현재보다 과거로 설정할 경우
            return LocalDate.now().equals(this.alarmTime);
        }
        public boolean isAlarm(ToDoTask task){
            if (task.check()==true) return true;
            else return false;
        }

        public String getName() {
            return this.taskName;
        }

        public LocalDate getDeadline() {
            return this.deadline;
        }

        public LocalDate getCreatingTime() {
            return creatingTime;
        }

        public boolean getCompleted() {
            return this.completed;
        }
}

