package LearnPackage;

import java.util.Objects;

public abstract class LearnClassDesign {
    public enum Numbers {ONE, TWO, THREE, FOUR, FIVE}
    public static class Quest {
        public static void main (String [] args) {
            Numbers n1 = Numbers.ONE;
            Numbers n2 = Numbers.ONE;//1
            if (n1 == n2) {System.out.print ("true");}
            else {System.out.print ("false");}
            System.out.println (Numbers.FIVE.ordinal ());//2


//            // статические метод и пременная их можно использовать в psvm
//            // если добавить final, то изменять их в psvm нельзя
//            static void method(){
//                System.out.println("Static method");
//            }
//            static int var = 10;
//            //
//            //
        }
    }
}
