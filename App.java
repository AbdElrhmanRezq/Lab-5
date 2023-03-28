public class App {
    public static void main(String[] args) throws Exception {
        /*Canvas canvas=new Canvas();
        Line line=new Line(1,2,3,4);
        Rectangle rect=new Rectangle(2,3,4,5,"Rectangle");
        Rectangle eli=new Rectangle(3,4,5,6,"Elipse");
        Rectangle eli2=new Rectangle(4,5,6,7,"Elipse");
        canvas.addShape(line);
        canvas.addShape(rect);
        canvas.addShape(eli);
        canvas.addShape(eli2);
        canvas.removeShape(eli2);
        canvas.drawAll();
        Shape x=canvas.getShape(eli2);
        x.draw();*/
        Diamond diamond = new Diamond(1,2,3,4,"Diamond");
        diamond.move(1,2);
        diamond.draw();
    }
}
