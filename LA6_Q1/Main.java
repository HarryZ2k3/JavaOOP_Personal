//Huynh_Phuong_Dai_ITITWE21039
package LA6_Q1;

public class Main {
    public static void main(String[] args) {
        //a. b.
        MyPair<String,Integer> student = new MyPair<>("Lieutenant Dan",50);

        //c.
        MyPair<String,Double> record = new MyPair<>("Phoenix", 39.7);
        System.out.println(student);
        System.out.println(record);

        /*d. Answer to the question: Due to the invalid Type of the second parameter, 
        a value of type MyPair<String, Double> to a variable of type MyPair<String, Integer>
        */
        
        //e
        MyPair<String,Integer>[] grades = new MyPair[5];
        grades[0] = new MyPair<>("Dai",72);
        grades[1] = new MyPair<>("Nam",203);
        grades[2] = new MyPair<>("Hannah",483);
        for (MyPair elements : grades) {
            System.out.println(elements);
        }

        //g
        MyPair<MyPair<Integer, Integer>, String> second_appointment = new MyPair<>(new MyPair<>(32,22),"Quoc");

        //h
        System.out.println(grades[2].Swap());
    }
}
