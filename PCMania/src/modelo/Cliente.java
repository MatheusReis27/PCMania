package br.inatel.cdg.pcmania.modelo;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] pcs; // array de computadores do cliente

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        pcs = new Computador[5];
    }

    public void adicionarPC(Computador pc){
        // vou procurar um espaço vazio no array
        for(int i = 0; i < pcs.length; i++){
            if(pcs[i] == null){
                pcs[i] = pc;
                break; // adicionou e sai
            }
        }
    }

    public float calcularTotal(){
        float total = 0;

        // somando o preço de todos os pcs
        for(Computador c : pcs){
            if(c != null){
                total += c.getPreco();
            }
        }

        return total;
    }

    public void mostrarDados(){
        System.out.println("\nCliente: " + nome);
        System.out.println("CPF: " + cpf);

        // mostrar todos os pcs comprados
        for(Computador c : pcs){
            if(c != null){
                c.mostrarConfigs();
            }
        }
    }

    public Computador[] getPcs(){
        return pcs;
    }
}