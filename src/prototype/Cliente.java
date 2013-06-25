package prototype;

public class Cliente {

    public static void main(String[] args) {
        PalioPrototype prototipoPalio = new PalioPrototype();
        prototipoPalio.setValorCompra(50000);
        CarroPrototype palioNovo = prototipoPalio.clonar();
        
        System.out.println("Original \n" + prototipoPalio.exibirInfo());
        System.out.println("-------------------------------------");
        System.out.println("Prototipo \n" + palioNovo.exibirInfo());
        
        System.out.println("-------------------------------------");
        palioNovo.setValorCompra(21000.0);
        System.out.println("Prototipo modificado \n" + palioNovo.exibirInfo());
    }
}
