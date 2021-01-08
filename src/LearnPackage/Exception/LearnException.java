package LearnPackage.Exception;


public class LearnException {
    public static void main(String[] args) {

        // случай преобразовать строку к числу NumberFormatException
//        String [] numbers = {"42", "0", "Y-"};
//        int result = Integer.parseInt(numbers[2]);
//        System.out.println(result);

        String [] numbers = {"42", "0", "Y-"};
        int result;
        try {
            result = Integer.parseInt(numbers[2]);
        } catch (NumberFormatException e){
            result = -1;
        } // иногда сюда добавляется finally{} на случай вывода доп блока при исключении
        System.out.println(result);
        //----------------------

        // еще один пример NumberFormatException
        double value = Double.parseDouble("42.0.5");
        System.out.println(value);


    }
}
