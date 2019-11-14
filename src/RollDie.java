

import java.util.Scanner;
import java.util.Random;
public class RollDie {
   int numofsides;


    public RollDie(int numofsides) {
        this.numofsides = numofsides;

    }

     public String toString(){
        return numofsides+"";
}
public int Roll(){
    int x = numofsides + 1;
    int random = (int) (Math.random() * x);
     return random;
    }

}
