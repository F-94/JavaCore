package br.com.maratonajava.introducao.estruturascondicionais;

public class Switch {
    public static void main(String[] args) {
        byte dia = 10;
        switch (dia) {
            case 1:
                System.out.println("domingp");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("opção invalida");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("HE");
                break;
            case 'F':
                System.out.println("SHE");
            default:
                    System.out.println(" select 'F' or 'M'");
                break;
        }
    }
}
