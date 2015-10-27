package position;



public class Circle {
    Position center;
    float radius;
    
    //Constructor
    Circle(float r, float x, float y){
        radius = r;
        center = new Position(x,y);
    }
    
    /*getters and setters*/
    float getCenterX(){
        return center.getX();
    }
    float getCenterY(){
        return center.getY();
    }
    float getRadius(){
        return radius;
    }
    void setCenterX(float x){
        center.setX(x);
    }
    void setCenterY(float y){
        center.setY(y);
    }
    void setRadius(float r){
        radius = r;
    }
    
    float getArea(){
        return (float)(Math.PI*radius*radius);
    }
    
    boolean isInsideCircle(Position p){
        return (center.getDistanceFromPoint(p) < radius);
    }
    
    boolean isOnCircle(Position p){
        return (center.getDistanceFromPoint(p) == radius);
    }
    
    boolean isOutSideCircle(Position p){
        return (center.getDistanceFromPoint(p) > radius);
    }
    
}