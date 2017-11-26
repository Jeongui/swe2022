package ToDo;

public class ToDoTheme {
    private TodoThemeColors themeColor;
    private TodoThemeImages themeImage;

    public ToDoTheme(){
        this.themeImage = TodoThemeImages.MOUNTAIN;
        this.themeColor = TodoThemeColors.BLUE;
    }

    public enum TodoThemeColors {BLUE,RED,PURPLE,SKYBLUE,GREEN}
    public enum TodoThemeImages {MOUNTAIN, TROPICAL, OCEAN, SKY, CITY, BLANK}

    public void changeThemeColor(TodoThemeColors color){
        this.themeColor =color;
    }
    public void changeThemeImage(TodoThemeImages image){
        this.themeImage =image;
    }

    public TodoThemeColors getThemeColor(){
        return this.themeColor;
    }
    public TodoThemeImages getThemeImage(){
        return this.themeImage;
    }
}

