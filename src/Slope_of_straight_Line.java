public class Slope_of_straight_Line {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        x1=4;
        x2=3;
        y1=8;
        y2=6;
        float slope =-(y2-y1)/(x2-x1);
        double c = y1 - (slope) * x1;
        System.out.println("The X-Intercept is "+c);
        System.out.println("The slope of the line is:"+slope);

    }
}
