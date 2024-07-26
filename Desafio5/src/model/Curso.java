package model;

import java.time.LocalDate;

public class Curso extends Conteudo {

    private int cargaHoraria;

    

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

}
