import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Hello, World!");
    
        Out.println("x-Koordinate des Punktes: ");
        double xKoordinate = In.readDouble();

        Out.println("y-Koordinate des Punktes: ");
        double yKoordinate = In.readDouble();

        double LängeUrsprung = Math.sqrt (xKoordinate * xKoordinate + yKoordinate * yKoordinate);

        if (xKoordinate <= 4 && xKoordinate >= 0 && yKoordinate <= 4 && yKoordinate >= 0 && LängeUrsprung > 4) {
            Out.println("Der Punkt ist im grünen Feld!");
        } else { 
            Out.println("Der Punkt ist nicht im grünen Feld.");
        }
    }
}