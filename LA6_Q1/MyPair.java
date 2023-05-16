//Huynh_Phuong_Dai_ITITWE21039
package LA6_Q1;

public class MyPair<T, U> {
    public final T Fst; 
    public final U Snd; 
    
    public MyPair(T fst, U snd) { 
        this.Fst = fst; 
        this.Snd = snd; 
    }

    public String Swap(){
        return "(" + Snd + ", " + Fst + ")";
    }
@Override
    public String toString() { 
        return "(" + Fst + ", " + Snd + ")"; 
    }
}
