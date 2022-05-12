package programapernasswitch;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ProgramaPernasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?");
        int perna = tec.nextInt();
        String tipo;
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpe";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
                
        }
        System.out.println("Isso é um " + tipo);
    }
    
}
