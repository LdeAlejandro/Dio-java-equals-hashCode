package dio;

import java.util.Objects;

public class Carro{

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o){
        // Se o objeto comparado for o mesmo objeto (mesma referência na memória), retorna verdadeiro

        if (this == o) return true;

        // Verifica se o objeto atual é nulo ou se o objeto recebido não é da mesma classe
        if(this == null || getClass() != o.getClass()) return false;

        // Converte o objeto para o tipo Carro
        Carro carro = (Carro) o;

        // Compara a marca dos carros, usando Objects.equals para tratar casos de nulo
        return Objects.equals(marca, carro.marca);

    }

    @Override
    public int hashCode(){
        return Objects.hash(marca);
    }


}
