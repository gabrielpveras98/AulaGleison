package br.com.caleum.contas;

public class Gerente extends Funcionario{
    @Override
    public double getBonificacao(){
        return this.salario * 1.4 + 1000;
    }
    
    
}
