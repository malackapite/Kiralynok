package vezérlő;

import modell.Tabla;
import nézet.GUI;

public class Vezerlo {
    private Tabla modell;
    private GUI nezet;

    public Vezerlo(Tabla modell, GUI nezet) {
        this.modell = modell;
        this.nezet = nezet;
    
        nezet.megjelenit(modell.getTabla());
    }
}
