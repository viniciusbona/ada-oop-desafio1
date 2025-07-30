public class Main {
    public static void main(String[] args) {
        // Testando construtores
        Produto notebook = new Produto("Notebook Dell", 4299.90, 15);
        Produto mouse = new Produto("Mouse Logitech", 149.90);
        
        // Testando métodos
        notebook.exibirResumo();
        mouse.exibirResumo();
        
        // Testando adição de estoque
        notebook.adicionarEstoque(5);
        mouse.adicionarEstoque(10);
        
        // Testando vendas
        notebook.vender(3);
        mouse.vender(15);  // Deve falhar - estoque insuficiente
        
        // Testando validações
        notebook.setPreco(-100);  // Erro: preço negativo
        notebook.adicionarEstoque(-5);  // Erro: quantidade negativa
        notebook.vender(0);  // Erro: quantidade zero
        
        // Exibindo resumo final
        notebook.exibirResumo();
        mouse.exibirResumo();
    }
}
