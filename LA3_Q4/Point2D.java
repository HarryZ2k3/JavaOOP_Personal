package LA3_Q4;

public class Point2D {
    protected float x;
    protected float y;
    
    public Point2D(float x,float y)
    {
        this.x = x;
        this.y = y;
    }
    public Point2D()
    {

    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
