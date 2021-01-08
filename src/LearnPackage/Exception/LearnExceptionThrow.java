package LearnPackage.Exception;

public class LearnExceptionThrow {
    public static void main(String[] args) {
        int a = 42;
        if (a <= 0){
            throw new IllegalArgumentException(); // перекладываем на того кто вводит данные
        }
        double res = Math.pow(a, 2);

    }

}
