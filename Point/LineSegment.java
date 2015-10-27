package position;
public class LineSegment {
    
    Position p1,p2;
    LineSegment(float x1, float y1, float x2, float y2){
        p1 = new Position(x1,y1);
        p2 = new Position(x2,y2);
    }
    
    float getLength(){
        return p1.getDistanceFromPoint(p2);
    }
    
    boolean onSameLine(Position p){
        return Position.areInaStraightLine(p1, p2, p);
    }
    
    boolean onSameLineSegment(Position p){
        float p_p1 = p.getDistanceFromPoint(p1);
        float p_p2 = p.getDistanceFromPoint(p2);
        float p1_p2 = getLength();
        
        return (p_p1 + p_p2 == p1_p2);
    }
    
}

