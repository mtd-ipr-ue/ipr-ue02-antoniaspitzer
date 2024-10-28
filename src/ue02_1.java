import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("Hello, World!");
        
        Out.println("Gib die erste Zahl ein!");
        int x = In.readInt();

        Out.println("Gibt die zweite Zahl ein!");
        int y = In.readInt();

        Out.println("Gib die dritte Zahl ein!");
        int z = In.readInt();

        if (x > y && x > z) {
            Out.println(x + " ist das Maximum.");
        } else if ( y > x && y > z) {
            Out.println(y + " ist das Maximum.");
        } else {
            Out.println(z + " ist das Maximum.");
        }
    }
}