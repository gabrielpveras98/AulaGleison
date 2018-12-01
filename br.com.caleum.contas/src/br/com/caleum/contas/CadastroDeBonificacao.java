package br.com.caleum.contas;

public class CadastroDeBonificacao {
    private double totalDeBonificacoes = 0;
    
    public void registra(Funcionario f){
        System.out.println("Adicionando bonificações do funcionario: " + f.getNome());
        this.totalDeBonificacoes += f.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
    
    
}
