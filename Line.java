import javafx.geometry.Point2D;
public class Line extends Shape {
    Point2D end;
    Line(){}
    Line(double x1,double y1,double x2,double y2){
        super(x1,y1,"Line");
        end=new Point2D(x2,y2);
    }
    public void draw(){
        System.out.printf("Type:%s\nStart:%f - %f\nEnd:%f - %f\n----------\n",type,start.getX(),start.getY(),end.getX(),end.getY());
    }
}
