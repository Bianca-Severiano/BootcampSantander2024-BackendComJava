package model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;


    public LocalDate getDataMentoria() {
        return data;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.data = dataMentoria;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
    
}
