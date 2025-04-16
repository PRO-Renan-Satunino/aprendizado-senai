import javax.swing.; import java.awt.; import java.awt.event.*; import java.util.ArrayList;

abstract class Veiculo {
    
protected String marca; 
protected String modelo;

public Veiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
}

public String getMarca() { return marca; }
public String getModelo() { return modelo; }
public void setMarca(String marca) { this.marca = marca; }
public void setModelo(String modelo) { this.modelo = modelo; }
public abstract String getDescricao();

}

class Carro extends Veiculo { private int numeroPortas;

public Carro(String marca, String modelo, int numeroPortas) {
    super(marca, modelo);
    this.numeroPortas = numeroPortas;
}

public int getNumeroPortas() { return numeroPortas; }
public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

@Override
public String getDescricao() {
    return "Carro - Marca: " + marca + ", Modelo: " + modelo + ", Portas: " + numeroPortas;
}

}

class Moto extends Veiculo { private int cilindrada;

public Moto(String marca, String modelo, int cilindrada) {
    super(marca, modelo);
    this.cilindrada = cilindrada;
}

public int getCilindrada() { return cilindrada; }
public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }

@Override
public String getDescricao() {
    return "Moto - Marca: " + marca + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada;
}

}

public class CadastroVeiculos extends JFrame { private JComboBox<String> tipoVeiculo; private JTextField campoMarca, campoModelo, campoAtributo; private DefaultListModel<Veiculo> listaModel; private JList<Veiculo> listaVeiculos; private JButton cadastrar, listar, alterar, remover, limpar;

public CadastroVeiculos() {
    super("Cadastro de Veículos");

    setLayout(new BorderLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500, 400);

    tipoVeiculo = new JComboBox<>(new String[]{"Carro", "Moto"});
    campoMarca = new JTextField(10);
    campoModelo = new JTextField(10);
    campoAtributo = new JTextField(10);
    listaModel = new DefaultListModel<>();
    listaVeiculos = new JList<>(listaModel);

    cadastrar = new JButton("Cadastrar");
    listar = new JButton("Listar");
    alterar = new JButton("Alterar");
    remover = new JButton("Remover");
    limpar = new JButton("Limpar Campos");

    JPanel painelCampos = new JPanel();
    painelCampos.setLayout(new GridLayout(5, 2));
    painelCampos.add(new JLabel("Tipo de Veículo:"));
    painelCampos.add(tipoVeiculo);
    painelCampos.add(new JLabel("Marca:"));
    painelCampos.add(campoMarca);
    painelCampos.add(new JLabel("Modelo:"));
    painelCampos.add(campoModelo);
    painelCampos.add(new JLabel("Portas / Cilindrada:"));
    painelCampos.add(campoAtributo);

    JPanel painelBotoes = new JPanel();
    painelBotoes.add(cadastrar);
    painelBotoes.add(listar);
    painelBotoes.add(alterar);
    painelBotoes.add(remover);
    painelBotoes.add(limpar);

    add(painelCampos, BorderLayout.NORTH);
    add(new JScrollPane(listaVeiculos), BorderLayout.CENTER);
    add(painelBotoes, BorderLayout.SOUTH);

    cadastrar.addActionListener(e -> cadastrarVeiculo());
    listar.addActionListener(e -> listarVeiculos());
    alterar.addActionListener(e -> alterarVeiculo());
    remover.addActionListener(e -> removerVeiculo());
    limpar.addActionListener(e -> limparCampos());

    setVisible(true);
}

private void cadastrarVeiculo() {
    String tipo = (String) tipoVeiculo.getSelectedItem();
    String marca = campoMarca.getText();
    String modelo = campoModelo.getText();
    String atributo = campoAtributo.getText();

    if (tipo.equals("Carro")) {
        listaModel.addElement(new Carro(marca, modelo, Integer.parseInt(atributo)));
    } else {
        listaModel.addElement(new Moto(marca, modelo, Integer.parseInt(atributo)));
    }
    limparCampos();
}

private void listarVeiculos() {
    DefaultListModel<Veiculo> novaLista = new DefaultListModel<>();
    for (int i = 0; i < listaModel.size(); i++) {
        novaLista.addElement(listaModel.get(i));
    }
    listaVeiculos.setModel(novaLista);
}

private void alterarVeiculo() {
    int index = listaVeiculos.getSelectedIndex();
    if (index >= 0) {
        String tipo = (String) tipoVeiculo.getSelectedItem();
        String marca = campoMarca.getText();
        String modelo = campoModelo.getText();
        String atributo = campoAtributo.getText();

        if (tipo.equals("Carro")) {
            listaModel.set(index, new Carro(marca, modelo, Integer.parseInt(atributo)));
        } else {
            listaModel.set(index, new Moto(marca, modelo, Integer.parseInt(atributo)));
        }
        limparCampos();
    }
}

private void removerVeiculo() {
    int index = listaVeiculos.getSelectedIndex();
    if (index >= 0) {
        listaModel.remove(index);
    }
}

private void limparCampos() {
    campoMarca.setText("");
    campoModelo.setText("");
    campoAtributo.setText("");
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> new CadastroVeiculos());
}

// Sobrescrevendo toString() para exibir na lista
public static abstract class Descrevivel extends Veiculo {
    public Descrevivel(String marca, String modelo) {
        super(marca, modelo);
    }
    @Override
    public String toString() {
        return getDescricao();
    }
}

}

