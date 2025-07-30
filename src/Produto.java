public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    // Construtores
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    // Métodos de negócio
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.setEstoque(this.estoque + quantidade);
            System.out.println(quantidade + " unidades adicionadas ao estoque de " + this.nome);
        } else {
            System.out.println("Erro: quantidade deve ser positiva");
        }
    }

    public boolean vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: quantidade deve ser positiva");
            return false;
        }
        
        if (quantidade <= this.estoque) {
            this.setEstoque(this.estoque - quantidade);
            System.out.println(quantidade + " unidades de " + this.nome + " vendidas");
            return true;
        } else {
            System.out.println("Erro: estoque insuficiente de " + this.nome);
            return false;
        }
    }

    public void exibirResumo() {
        System.out.println("\nResumo do Produto:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$" + String.format("%.2f", this.preco));
        System.out.println("Estoque: " + this.estoque + " unidades");
        System.out.println("Valor total em estoque: R$" + 
                         String.format("%.2f", (this.preco * this.estoque)));
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: nome inválido");
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: preço não pode ser negativo");
        }
    }

    public int getEstoque() {
        return this.estoque;
    }

    private void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            System.out.println("Erro: estoque não pode ser negativo");
        }
    }
}
