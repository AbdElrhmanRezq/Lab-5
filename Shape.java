import javafx.geometry.Point2D;
public abstract class Shape {
    String type;
    Point2D start;
    Shape(){
    }
    Shape(double x,double y,String type){
        start=new Point2D(x,y);
        this.type=type;
    }
    public abstract void draw();
    public String getType(){
        return type;
    }
    public Point2D getStart(){
        return start;
    }
}
