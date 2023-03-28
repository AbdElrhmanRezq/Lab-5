import javafx.geometry.Point2D;
public class Diamond extends Rectangle implements Movable {
    Diamond(double x,double y,double length,double width,String type){
        super(x,y,length,width,type);
    }
    public void move(double dx,double dy){
        this.start=new Point2D(start.getX()+dx,start.getY()+dy);
    }
}
