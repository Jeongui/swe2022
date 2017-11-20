package ToDo;
public class ToDoTheme {

    public enum Color {RED, GREEN, BLUE};

    private static ToDoTheme.Color color;

    public ToDoTheme(ToDoTheme.Color $color){
        final ToDoTheme.Color color = $color;
        this.color = color;
    }

    public static String toString(String listTheme1, String listTheme2, String listTheme3){
        switch (color){
            case RED: return listTheme1;
            case GREEN: return listTheme2;
            case BLUE: return listTheme3;
        }
    }
}
