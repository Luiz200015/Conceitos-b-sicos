package exercicio2;

import java.util.Scanner;

public class Main {
    private static String marca;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a Marca do Carro: ");
        Carro carro = new Carro();
            String marca = sc.nextLine();
                carro.setMarca(marca);

        System.out.println("Digite o ano do carro: ");
            int ano =sc.nextInt();
                carro.setAno(ano);
                    sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
            String modelo = sc.nextLine();
                carro.setModelo(modelo);



        Carro carro2 = new Carro();
        System.out.println("Digite a marca do carro");
            String marca2 = sc.nextLine();
                carro2.setMarca(marca2);

        System.out.println("Digite o ano do carro: ");
            int ano2 =sc.nextInt();
                carro2.setAno(ano2);
                    sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
            String modelo2 = sc.nextLine();
                carro2.setModelo(modelo2);

        Carro carro3 = new Carro();
        System.out.println("Digite a marca do carro: ");
            String marca3 = sc.nextLine();
                carro3.setMarca(marca3);

        System.out.println("Digite o ano do carro: ");
        int ano3 =sc.nextInt();
            carro3.setAno(ano3);
                sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
            String modelo3 = sc.nextLine();
                carro3.setModelo(modelo3);


        System.out.println("");

        System.out.println("Marca do seu carro eh:" + carro.getMarca());
        System.out.println("");
        System.out.println("Ano do seu carro eh: " + carro.getAno());
        System.out.println("");
        System.out.println("Modelo do seu carro eh: " + carro.getModelo());
        System.out.println("");
        System.out.println("Marca do seu carro eh:" + carro2.getMarca());
        System.out.println("");
        System.out.println("Ano do seu carro eh: " + carro2.getAno());
        System.out.println("");
        System.out.println("Modelo do seu carro eh: " + carro2.getModelo());
        System.out.println("");
        System.out.println("Marca do seu carro eh:" + carro3.getMarca());
        System.out.println("");
        System.out.println("Ano do seu carro eh: " + carro3.getAno());
        System.out.println("");
        System.out.println("Modelo do seu carro eh: " + carro3.getModelo());
    }
}
