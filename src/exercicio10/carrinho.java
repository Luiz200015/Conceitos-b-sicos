package exercicio10;

public class carrinho {
    private int quantidade;
    private double valorTotal;

    public carrinho() {
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public String adicionarItem(double preco) {
        if (preco <= 0){
            return "Preço deve ser maior que zero!";
        }
        this.quantidade += 1;
        this.valorTotal += preco;

        return "Item adicionado com sucesso \n" + imprimir();
    }
    public String removerItem(double preco) {
        if (this.quantidade > 1) {
            return "Não é possivel remover item, carrinho está vazio.";
        }
        this.quantidade -= 1;
        this.valorTotal -= preco;

        return "Item removido com sucesso.";
    }
         public String aplicarDesconto(double percentual) {
             if (percentual < 0 || percentual > 100){
                 return "Percentual de desconto deve estar entre 0 e 100";
            }

             this.valorTotal -= (this.valorTotal * percentual / 100);
             return "Desconto aplicado com sucesso!";
        }
        public String imprimir(){
            return "Quantidade de itens: " + this.quantidade +
                    "\n" + "Valor total: " + this.valorTotal;
        }
    }
