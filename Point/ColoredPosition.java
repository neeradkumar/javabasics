package position;
public class ColoredPosition extends Position{
    
    String color;
    
    ColoredPosition(float x, float y, String color){
        super(x,y);
        this.color = color;
    }
    ColoredPosition(){
        super();
        this.color = "";
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    boolean isRed(){
        return color.equals("red");
    }
    public static void main(String[] args){
        ColoredPosition cp = new ColoredPosition();
        cp.setX(1);
        cp.setColor("red");
        ColoredPosition cp1 = new ColoredPosition(3,4,"jumba");
    }
}
