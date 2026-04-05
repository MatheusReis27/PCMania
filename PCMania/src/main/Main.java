package br.inatel.cdg.pcmania.main;

import java.util.Scanner;

import br.inatel.cdg.pcmania.modelo.*;
import br.inatel.cdg.pcmania.controle.ProcessarPedido;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pegando dados do cliente
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        int opcao;

        do{
            System.out.println("\n===== PC MANIA =====");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if(opcao == 1){
                System.out.println("Escolheu promo 1");

                Computador pc = new Computador("Apple", 2227 + 1234);

                pc.addHardware(new HardwareBasico("i3", 2200));
                pc.addHardware(new HardwareBasico("RAM", 8));
                pc.addHardware(new HardwareBasico("HD", 500));

                pc.setSO(new SistemaOperacional("macOS", 64));
                pc.addUSB(new MemoriaUSB("PenDrive", 16));

                pc.mostrarConfigs();

                cliente.adicionarPC(pc);
            }

            else if(opcao == 2){
                System.out.println("Escolheu promo 2");

                Computador pc = new Computador("Samsung", 2227 + 1234);

                pc.addHardware(new HardwareBasico("i5", 3370));
                pc.addHardware(new HardwareBasico("RAM", 16));
                pc.addHardware(new HardwareBasico("HD", 1000));

                pc.setSO(new SistemaOperacional("Windows 8", 64));
                pc.addUSB(new MemoriaUSB("PenDrive", 32));

                pc.mostrarConfigs();

                cliente.adicionarPC(pc);
            }

            else if(opcao == 3){
                System.out.println("Escolheu promo 3");

                Computador pc = new Computador("Dell", 2227 + 5678);

                pc.addHardware(new HardwareBasico("i7", 4500));
                pc.addHardware(new HardwareBasico("RAM", 32));
                pc.addHardware(new HardwareBasico("HD", 2000));

                pc.setSO(new SistemaOperacional("Windows 10", 64));
                pc.addUSB(new MemoriaUSB("HD externo", 1000));

                pc.mostrarConfigs();

                cliente.adicionarPC(pc);
            }

        }
        while(opcao != 0);

        // resumo final
        cliente.mostrarDados();

        System.out.println("\nTotal: " + cliente.calcularTotal());

        ProcessarPedido.processarPedido(cliente.getPcs());

        sc.close();
    }
}