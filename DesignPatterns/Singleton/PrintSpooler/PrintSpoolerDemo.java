package PrintSpooler;

public class PrintSpoolerDemo {
    public static void main(String[] args){
        PrintSpooler ps = PrintSpooler.getInstance();
        PrintSpooler ps2 = PrintSpooler.getInstance();

        System.out.println(ps == ps2);
    }
}
