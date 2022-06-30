package variationjava;

public class Main {

    public static void main(String[] args) {
        var earth1 = Earth.getSingleton();
        var earth2 = Earth.getSingleton();

        // This will print out the same object reference!
        System.out.println(earth1.toString());
        System.out.println(earth2.toString());
    }
}
