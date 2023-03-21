import java.security.spec.RSAOtherPrimeInfo;

public class Computador {

    //Atributos
    String marca;
    float preco;

    HardwareBasico[] HB;
    SistemaOperacional SO;
    MemoriaUSB memoria;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;

        HB = new HardwareBasico[3];
    }


    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        for (int i = 0; i < HB.length; i++) {
            String unit = null;

            if (HB[i] != null) { //CONDIÇÃO PARA UNIDADE DAS PEÇAS

                switch (i) {
                    case 0:
                        unit = "Mhz";
                        break;

                    case 1:
                        unit = "Gb";
                        break;

                    case 2:
                        if (HB[i].capacidade >= 1000)
                            unit = "Tb";
                        else
                            unit = "Gb";
                        break;
                }
                System.out.println(HB[i].nome + " de " + HB[i].capacidade + " " + unit);
            }
        }
        System.out.println("Sistema Operacional"+ SO.nome + " ("+ SO.tipo + " Bits)");
        System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade);
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }
}
