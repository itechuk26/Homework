public class Wall {
    double width,height;

    public static void main(String[] args) {
        Wall wall = new Wall (5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    public Wall() {
    }

    public Wall(double width, double height) {
        if(width < 0)
            this.width = 0;
        else
            this.width = width;

        if(height < 0)
            this.height = height;
        else
            this.height = height;
    }

    public double getWidth(){
        double w = width;

        return w;
    }

    public double getHeight(){
        double h = height;

        return h;
    }

    public void setWidth(double w){
        if(w < 0)
            width = 0;
        else
            width = w;
    }

    public void setHeight(double h){
        if(h < 0)
            height = 0;
        else
             height = h;
    }

    public double getArea(){
        double area;
        area = width * height;

        return area;
    }
}


