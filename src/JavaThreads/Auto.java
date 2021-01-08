package JavaThreads;

public class Auto extends Thread {
    private String nameAuto;
    private int valueAuto;

    Auto(){
        this.nameAuto = "Auto with number ";
        this.valueAuto = +100 + (int)(Math.random() * 700);
    }

    @Override
    public synchronized String toString() {return nameAuto + ' ' + String.valueOf(valueAuto); }
}
