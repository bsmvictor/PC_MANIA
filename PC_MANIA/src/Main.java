import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Victor", 354698541);

        //CRIANDO ARRAY DE COMPRAS
        Computador[] compras = new Computador[10];

        //CRIANDO COMPUTADORES

        //1º Promoção
        Computador pc1 = new Computador("Positivo", 2300f);
        pc1.HB[0] = new HardwareBasico("Pentium core i3", 2200);
        pc1.HB[1] = new HardwareBasico("Memoria ram", 8);
        pc1.HB[2] = new HardwareBasico("HD", 500);
        pc1.SO = new SistemaOperacional("Linux Ubuntu", 32);
        MemoriaUSB m1 = new MemoriaUSB("Pen-drive", 16);
        pc1.addMemoriaUSB(m1);

        //2º Promoção
        Computador pc2 = new Computador("Acer", 5800f);
        pc1.HB[0] = new HardwareBasico("Pentium core i5", 3370);
        pc1.HB[1] = new HardwareBasico("Memoria ram", 16);
        pc1.HB[2] = new HardwareBasico("HD", 1000);
        pc1.SO = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB m2 = new MemoriaUSB("Pen-drive", 32);
        pc1.addMemoriaUSB(m2);

        //3º Promoção
        Computador pc3 = new Computador("Vaio", 1800f);
        pc1.HB[0] = new HardwareBasico("Pentium core i7", 4500);
        pc1.HB[1] = new HardwareBasico("Memoria ram", 32);
        pc1.HB[2] = new HardwareBasico("HD", 2000);
        pc1.SO = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1000);
        pc1.addMemoriaUSB(m3);

        //MENU DA LOJA
        System.out.println("\n--------------------BEM-VINDO A LOJA PC-MANIA--------------------");
        System.out.println("\nSELECIONE 1 2 OU 3 PARA SELECIONAR A PROMOÇÂO QUE DESEJA ADQUIRIR");
        System.out.println("\nCASO QUEIRA SAIR DO MENU, DIGITE 0");
        System.out.println("\n--------------------PROMOÇÃO 1--------------------\n");
        pc1.mostraPCConfigs();
        System.out.println("\n--------------------PROMOÇÃO 2--------------------\n");
        pc2.mostraPCConfigs();
        System.out.println("\n--------------------PROMOÇÃO 3--------------------\n");
        pc3.mostraPCConfigs();

        float precoFinal = 0;

        boolean flag = true;

        while (flag) {

            int i = 0;
            int op;
            op = sc.nextInt();

            switch (op) {

                case 0:
                    System.out.println("Você escolheu sair do menu!");
                    System.out.println("Até a proxima!");
                    flag = false;
                    break;

                case 1:
                    System.out.println("Você escolheu comprar a promoção 1!");
                    compras[i] = pc1;
                    i++;
                    break;

                case 2:
                    System.out.println("Você escolheu comprar a promoção 2!");
                    compras[i] = pc2;
                    i++;
                    break;

                case 3:
                    System.out.println("Você escolheu comprar a promoção 3!");
                    compras[i] = pc3;
                    i++;
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }

        System.out.println("\n----CHECK OUT----");
        System.out.println("\nCliente: " + cliente.nome);
        System.out.println("Cpf: " + cliente.cpf);
        System.out.println("\nComputador(es) comprado: ");

        for (int i = 0; i < compras.length; i++) {
            if (compras[i] != null) {
                compras[i].mostraPCConfigs();
            }
        }

        System.out.println("Total da compra: R$");

    }
}