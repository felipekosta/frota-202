import java.util.ArrayList;
import java.util.List;

public class Frota {
    private ArrayList<Carro> carros; // Boa prática: programar voltado à interface (List)

    public Frota() {
        this.carros = new ArrayList<>();
    }
    public void adicionarCarro(Carro novo) {
        this.carros.add(novo);
    }
    public Carro pesquisarPlaca(String placa) {
        for (Carro carro : this.carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }
        return null;
    }
    public void removerCarro(String placa) {
        Carro carro = pesquisarPlaca(placa);
        if (carro != null) {
            this.carros.remove(carro);
        }
    }
}
