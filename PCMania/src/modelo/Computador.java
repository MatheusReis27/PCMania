package br.inatel.cdg.pcmania.modelo;

public class Computador {

    private String marca;
    private float preco;
    private HardwareBasico[] hw = new HardwareBasico[3]; // 3 hardwares
    private SistemaOperacional so;
    private MemoriaUSB usb;

    public Computador(String marca, float preco){
        this.marca = marca;
        this.preco = preco;
    }

    public void addHardware(HardwareBasico h){
        // adicionando hardware no array
        for(int i = 0; i < hw.length; i++){
            if(hw[i] == null){
                hw[i] = h;
                break;
            }
        }
    }

    public void addUSB(MemoriaUSB usb){
        this.usb = usb; // só um
    }

    public void setSO(SistemaOperacional so){
        this.so = so;
    }

    public float getPreco(){
        return preco;
    }

    public void mostrarConfigs(){
        System.out.println("\n--- PC ---");
        System.out.println("Marca: " + marca);
        System.out.println("Preco: " + preco);

        // mostrando hardwares
        for(HardwareBasico h : hw){
            if(h != null){
                System.out.println("Hardware: " + h.getNome() + " - " + h.getCapacidade());
            }
        }

        if(so != null){
            System.out.println("SO: " + so.getNome() + " " + so.getTipo() + " bits");
        }

        if(usb != null){
            System.out.println("USB: " + usb.getNome() + " " + usb.getCapacidade() + "GB");
        }
    }
}