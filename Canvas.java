import java.util.ArrayList;
public class Canvas {
    ArrayList<Shape> shapes =new ArrayList<Shape>();
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public void removeShape(Shape test){
        for(int i=0;i<shapes.size();i++){
            Shape temp = shapes.get(i);
            if(temp.getType().equals(test.getType()) && temp.getStart().equals(test.getStart())){
                shapes.remove(i);
                break;
            }
        }
    }
    public Shape getShape(Shape point){
        Shape close=new Line();
        double distance=10000000;
        for(int i=0;i<shapes.size();i++){
            Shape temp = shapes.get(i);
            double xx=Math.abs(point.getStart().getX()-temp.getStart().getX());
            double yy=Math.abs(point.getStart().getY()-temp.getStart().getY());
            double dis=Math.sqrt(Math.pow(xx, 2)+Math.pow(yy, 2));
            if(i==0||dis<=distance){
                distance=dis;
                close=shapes.get(i);
            }
        }
        return close;
    }
    public void drawAll(){
        for(int i=0;i<shapes.size();i++){
            Shape temp=shapes.get(i);
            temp.draw();
        }
    }
}
