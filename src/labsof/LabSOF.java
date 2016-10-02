package labsof;

import Code.Empresa;
import gfx.MainMenu;
import java.io.File;

public class LabSOF {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        File f = new File("Cliente.txt");
        if(f.exists()){
            e.load();
        }
        new MainMenu(e);
    }

}
