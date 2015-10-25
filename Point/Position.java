public class Position {
    float x;
    float y ;
    
    //Constructor
    Position(float a, float b){
        x = a;
        y = b;
    }
    
    /*getters and setters*/
    void setX(float a){
        x = a;
    }
    void setY(float b){
        y=b;
    }
    float getX(){
        return x;
    }
    float getY(){
        return y;
    }
    
    //Distance from origin
    float getDistanceFromOrgin(){
        return (float)Math.sqrt(x*x+y*y);
    }
    //Distance from this position to another position given coordinates of that position
    float getDistanceFromPoint(float x1, float y1){
        return (float)Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
    //Distance from this position to another position
    float getDistanceFromPoint(Position p){
        float x1 = p.getX();
        float y1 = p.getY();
        return (float)Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
    //Are Origin, p and this point in a straight line
    boolean doesLineJoiningPassThroughOrigin(Position p){
        return doesLineJoiningPassThroughOrigin(this,p);
    }
    //Are Origin, a, b in a straight line
    static boolean doesLineJoiningPassThroughOrigin(Position a, Position b){
        float OA = a.getDistanceFromOrgin();
        float OB = b.getDistanceFromOrgin();
        float AB = a.getDistanceFromPoint(b);
        
        if(OA+OB == AB) return true;
        if(OA+AB == OB) return true;
        if(OB + AB == OA) return true;
        return false;
    }
    
    static boolean areInaStraightLine(Position a, Position b, Position c){
           //TODO
        return false;
    }
    public static void main(String[] args){
        Position p1,p2;
        p1 = new Position(6,10);
        p2 = new Position(3,5);
        boolean linePassesThroughOrigin = doesLineJoiningPassThroughOrigin(p1,p2);
        System.out.println(linePassesThroughOrigin);
        
        float distance = p1.getDistanceFromPoint(p2);
        System.out.println(p1.getDistanceFromOrgin());
    }
}
