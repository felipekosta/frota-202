public class Carro {
    // Atributos privados (Encapsulamento)
    private String placa;
    private double hodometro;
    private double consumo;
    private double capacidadeTanque;
    private double dispCombustivel;

    // construtor, getters e setters

    public Carro(String placa, double consumo, double capacidadeTanque) {
        this.placa = placa;
        this.consumo = consumo;
        this.capacidadeTanque = capacidadeTanque;
        this.hodometro = 0;
        this.dispCombustivel = 0;
    }

    public double abastecer(double litros) {
        if (litros <= 0) {
            return 0.0;
        }
        double espacoDisponivel = this.capacidadeTanque - this.dispCombustivel;
        double litrosEfetivos = litros;
        if (litros > espacoDisponivel) {
            litrosEfetivos = espacoDisponivel; // Limita ao que cabe no tanque
        }
        this.dispCombustivel += litrosEfetivos;
        return litrosEfetivos;
    }

    public double percorrer(double km) {
        if (km <= 0 || this.consumo <= 0) {
            return 0.0;
        }

        double litrosNecessarios = km / this.consumo;
        double kmReal;

        if (litrosNecessarios > this.dispCombustivel) {
            // O combustível acaba antes de completar o percurso
            kmReal = this.dispCombustivel * this.consumo;
            this.dispCombustivel = 0.0;
        } else {
            // Consegue completar o percurso inteiro
            kmReal = km;
            this.dispCombustivel -= litrosNecessarios;
        }

        this.hodometro += kmReal;
        return kmReal;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getHodometro() {
        return hodometro;
    }

    public void setHodometro(double hodometro) {
        this.hodometro = hodometro;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getDispCombustivel() {
        return dispCombustivel;
    }

    public void setDispCombustivel(double dispCombustivel) {
        this.dispCombustivel = dispCombustivel;
    }
}
