public class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(){}
    Rectangle(double x,double y,double length,double width,String type){
        super(x,y,type);
        this.length=length;
        this.width=width;
    }
    public void draw(){
        System.out.printf("Type:%s\nStart:%f - %f\nLength:%f\nWidth:%f\n----------\n",type,start.getX(),start.getY(),length,width);
    
    }
}
