package br.com.maratonajava.introducao.estruturasrepeticao;

// dado um valor de carro, descubra em quantas vezes ele pode ser parcelado
//condição valorParcela >=1000
public class ExercicoBreak {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela <1000) {
                break;
            }
                System.out.println("parcela " + parcela+ " R$ " + valorParcela);

        }

    }
}
