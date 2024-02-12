package kiralynok;

import modell.Tabla;
import nézet.GUI;
import vezérlő.Vezerlo;

public class Program {

    public static void main(String[] args) {
        new Vezerlo(new Tabla('x'), new GUI());
    }
}
