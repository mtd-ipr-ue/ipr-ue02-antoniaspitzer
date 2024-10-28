import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Hello, World!");

        Out.println("Jahreszahl: ");
        int Jahreszahl = In.readInt();

        Out.println("Monats-Wert: ");
        int MonatsWert = In.readInt();

        int FebruarT;

        if ((Jahreszahl % 4 == 0 && Jahreszahl % 100 != 0) || (Jahreszahl % 400 == 0)) {
            FebruarT = 29;
        } else {
            FebruarT = 28;
        }

        switch (MonatsWert) {
            case 1:
                Out.println("Jänner, 31 Tage");
                break;
            case 2:
                Out.println("Februar, " + FebruarT + " Tage");
                break;
            case 3:
                Out.println("März, 31 Tage");
                break;
            case 4:
                Out.println("April, 30");
                break;
            case 5:
                Out.println("Mai, 31 Tage");
                break;
            case 6:
                Out.println("Juni, 30");
                break;
            case 7:
                Out.println("Juli, 31 Tage");
                break;
            case 8:
                Out.println("August, 31 Tage");
                break;
            case 9:
                Out.println("September, 30 Tage");
                break;
            case 10:
                Out.println("Oktober, 31 Tage");
                break;
            case 11:
                Out.println("November, 30 Tage");
                break;
            case 12:
                Out.println("Dezember, 31 Tage");
                break;
        
            default:
                Out.println("Nur Zahlen von 1 bis 12 sind erlaubt!");
                break;
        }
    } 
}