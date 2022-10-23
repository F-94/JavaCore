package br.com.maratonajava.introducao.estruturasrepeticao;

public class ExercicioContinue {

    // dado um valor de carro, descubra em quantas vezes ele pode ser parcelado
//condição valorParcela >=1000

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println(parcela + " parcela de R$ " + valorParcela);
        }
    }
}