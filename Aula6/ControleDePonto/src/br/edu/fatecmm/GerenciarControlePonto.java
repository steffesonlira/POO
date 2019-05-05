package br.edu.fatecmm;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        Gerente gerente1 = new Gerente();
        Secretaria secretaria1 = new Secretaria();
        Operador operador1 = new Operador();

        //POPULANDO GERENTE
        gerente1.setIfFunc(01);
        gerente1.setNome("Gerente1");
        gerente1.setEmail("gerente@con.com");
        gerente1.setDocumento("12345678");
        gerente1.setLogin("ger1");
        gerente1.setSenha("ger123");


        //POPULANDO OPERADOR
        operador1.setIfFunc(01);
        operador1.setNome("Operado1");
        operador1.setEmail("oper@cont.com");
        operador1.setDocumento("754345567");
        operador1.setValorHora(14);

        //POPULANDO SECRETARIA
        secretaria1.setIfFunc(01);
        secretaria1.setNome("Secretaria1");
        secretaria1.setEmail("ysec@cont.com");
        secretaria1.setDocumento("34432434");
        secretaria1.setTelefone("3435456456");
        secretaria1.setRamal("47464466443");





        //REGISTRA ENTRADA GERENTE
        RegistroPonto registro1 = new RegistroPonto();
        registro1.setIdRegistroPonto(01);
        registro1.setFunc(gerente1);
        registro1.setHoraEntrada(LocalDateTime.now());
        registro1.setDataRegistro(LocalDate.now());
        registro1.setHoraSaida(null);

        //APRESENTA ENTRADA GERENTE
        registro1.apresentarRegistroPonto();
        Thread.sleep(1500);

        //REGISTRA SAIDA E APRESENTA SAIDA GERENTE
        registro1.setHoraSaida(LocalDateTime.now());
        registro1.apresentarRegistroPonto();



        //REGISTRA ENTRADA SECRETARIA
        registro1.setIdRegistroPonto(02);
        registro1.setFunc(secretaria1);
        registro1.setHoraEntrada(LocalDateTime.now());
        registro1.setDataRegistro(LocalDate.now());
        registro1.setHoraSaida(null);

        //APRESENTA ENTRADA SECRETARIA
        registro1.apresentarRegistroPonto();
        Thread.sleep(1500);

        //REGISTRA SAIDA E APRESENTA SAIDA SECRETARIA
        registro1.setHoraSaida(LocalDateTime.now());
        registro1.apresentarRegistroPonto();;



        //REGISTRA ENTRADA DO OPERADOR
        registro1.setIdRegistroPonto(03);
        registro1.setFunc(operador1);
        registro1.setHoraEntrada(LocalDateTime.now());
        registro1.setDataRegistro(LocalDate.now());
        registro1.setHoraSaida(null);

        //APRESENTA ENTRADA OPERADOR
        registro1.apresentarRegistroPonto();
        Thread.sleep(1500);

        //REGISTRA SAIDA E APRESENTA SAIDA OPERADOR
        registro1.setHoraSaida(LocalDateTime.now());
        registro1.apresentarRegistroPonto();
    }
}
