package br.com.maratonajava.introducao.estruturasrepeticao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while (count<=10){
            System.out.println("dentro do while "+ count++);
        }
        System.out.println("--------------------------");
        count = 0;
        do{
            System.out.println("dentro do do-while " + count++);
        }while(count<=10);
        System.out.println("-----------------------------------");
        for (int i = 0; i <=10 ; i++) {
            System.out.println("dentro do for " + i);

        }
    }
}
