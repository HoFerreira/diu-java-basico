package Equipamentos.multifuncional;

import Equipamentos.copiadora.Copiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar() {
        System.out.println("Copiando via equipamento multi funcinal");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multi funcinal");
    }

    public void imprimir() {
        System.out.println("Imprimindo via equipamento multi funcinal");
    }
}
