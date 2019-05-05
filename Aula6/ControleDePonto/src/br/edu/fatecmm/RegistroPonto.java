package br.edu.fatecmm;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    private long idRegistroPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public void apresentarRegistroPonto() {
        System.out.println("FUNCIONÁRIO: " + func.getNome());
        System.out.println("DATA REGISTO: " + getDataRegistro());
        System.out.println("HORÁRIO ENTRADA:" + getHoraEntrada());
        System.out.println("HORARIO SAIDA " + getHoraSaida());
        System.out.println("");
    }

    public long getIdRegistroPonto() {
        return idRegistroPonto;
    }

    public void setIdRegistroPonto(long idRegistroPonto) {
        this.idRegistroPonto = idRegistroPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }
}
