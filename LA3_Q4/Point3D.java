package LA3_Q4;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x,float y,float z)
    {
        super(x,y);
        this.z=z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    @Override
    public String toString()
    {
        return "(" + x +","+y+","+z+")";
    }
}
