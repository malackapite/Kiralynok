package kiralynok;

import java.io.IOException;
import nézet.Tabla;
import nézet.GUI;
import vezérlő.Vezerlo;

public class Program {

    public static void main(String[] args) throws IOException {
        new Vezerlo(new Tabla('_'), new GUI());
    }
}
