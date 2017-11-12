package ToDo;

public class ToDoTheme {

    private String BackGround;
    private String Color;

    public void setTheme() {
        this.BackGround = getBackGround();
        this.Color = getColor();
    }
    private String getBackGround(){
        return BackGround;
    }
    private String getColor(){
        return Color;
    }
}
