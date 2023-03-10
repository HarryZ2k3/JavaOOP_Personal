package LA3_Q1;
class MyShape
{
    protected int x;
    protected int y;
    protected int height;
    protected int width;
    public MyShape(int inX, int inY, int inHeight, int inWidth)
    {
        inX = x;
        inY = y;
        inHeight = height;
        inWidth = width;
    }
    
//Getter Setter
    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public int getWidth() {
        return width;
    }


    public void setWidth(int width) {
        this.width = width;
    }
    public void getArea()
    {
        //does nothing
    }

    public void Draw()
    {
        //draws
    }
}