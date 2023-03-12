package LA3_Q2;
import java.lang.Math;
public class MyTriangle {
	private MyPoint vertice1;
	private MyPoint vertice2;
	private MyPoint vertice3;

	public MyTriangle(MyPoint vertice1, MyPoint vertice2, MyPoint vertice3) {
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}

	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		vertice1 = new MyPoint(x1, y1);
		vertice2 = new MyPoint(x2, y2);
		vertice3 = new MyPoint(x3, y3);
	}

	public double getPerimeter() {
		double d1 = Math.sqrt(java.lang.Math.pow(vertice1.getX() - vertice2.getX(), 2) + java.lang.Math.pow(vertice1.getY() - vertice2.getY(), 2));
		double d2 = Math.sqrt(java.lang.Math.pow(vertice1.getX() - vertice3.getX(), 2) + java.lang.Math.pow(vertice1.getY() - vertice3.getY(), 2));
		double d3 = Math.sqrt(java.lang.Math.pow(vertice2.getX() - vertice3.getX(), 2) + java.lang.Math.pow(vertice2.getY() - vertice3.getY(), 2));
		return d1 + d2 + d3;
	}

    public String getType()
    {
        Boolean isTriangle=true;
        double a = Math.sqrt(java.lang.Math.pow(vertice1.getX() - vertice2.getX(),2) + java.lang.Math.pow(vertice1.getY() - vertice2.getY(), 2));
		double b = Math.sqrt(java.lang.Math.pow(vertice1.getX() - vertice3.getX(), 2) + java.lang.Math.pow(vertice1.getY() - vertice3.getY(), 2));
		double c = Math.sqrt(java.lang.Math.pow(vertice2.getX() - vertice3.getX(), 2) + java.lang.Math.pow(vertice2.getY() - vertice3.getY(), 2));
        //Not triangle
        /* 
        if ((a+b)>c || (a+c)>b || (b+c)>a)
        {
            isTriangle = false;
            return "*ERROR: THIS IS NOT A TRIANGLE!";
        }
        */
        if (isTriangle == true)
        {
            //Equilateral
            if ((a==b && a==c) || (b==a && b ==c) || (c==a && c==b))
            {
                return "This is a Equlateral triangle!";
            }
            //Isoceles
            else if ((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a))
            {
                return "This is an Isoceles triangle!";
            }
            //Scalene
            else if (a!=b && a!=c && b!=c)
            {
                return "This is a Scalene triangle!";
            }   
        }
        return "Returns a String";
    }

    @Override
    public String toString()
    {
        return "My Triangle[v1=(" + vertice1.getX() + "," + vertice1.getY() + "),"
                        +  "v2=(" + vertice2.getX() + "," + vertice2.getY() + "),"  
                        +  "v3=(" + vertice3.getX() + "," + vertice3.getY() + ")]";
    }

}