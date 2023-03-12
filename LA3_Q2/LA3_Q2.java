package LA3_Q2;


public class LA3_Q2 {
	public static void main(String[] args) {
		MyPoint vertice1 = new MyPoint(0, 1);
		MyPoint vertice2 = new MyPoint(2, 3);
		MyPoint vertice3 = new MyPoint(4, 1);
		MyTriangle triangle1 = new MyTriangle(vertice1, vertice2, vertice3);
		MyTriangle triangle2 = new MyTriangle(5, 2, 3, 0, 7, 0);
        
        System.out.println(triangle1);
        System.out.println(triangle1.getType());
		System.out.println(triangle1.getPerimeter());
        
        System.out.println(triangle2);
        System.out.println(triangle2.getType());
		System.out.println(triangle2.getPerimeter());
	}
}