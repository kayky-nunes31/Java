algoritmo MyClass
inicio
	literal nomeLoja, nomeGerente, produtos[];
	inteiro qtd_prod, i, qtd_estoque[];

	escreva("Digite o nome da Loja: ");
    leia(nomeLoja);

    escreva("\nDigite o nome do Gerente: ");
    leia(nomeGerente);

    escreva("\nDigite quantos produtos tem no estoque: ");
    leia(qtd_prod);
	
	loja1.setNome(nomeLoja);
    loja1.setVendedor(nomeGerente);
	
	para(i = 0; i < qtd_prod; i++) {
        escreva("\nDigite o nome do produto " + i + ": ");
        leia(produtos[i]);
            
    }
    para(i = 0; i < qtd_prod; i++) {
        escreva("\nDigite a quantidade de estoque do(a) " + produtos[i] + ": ");
        leia(qtd_estoque[i]);
    }
	
	escreva("Nome da loja: " + loja1.getNome());
    escreva("Nome do(a) gerente: " + loja1.getVendedor());
	
    para(i = 0; i < qtd_prod; i++) {
        escreva("O nome do produto: " + produtos[i] +
                           "\nTem a quantidade em estoque: " + qtd_estoque[i] + 
                           "\n");
    }
fim

void ConsultaEstoque(literal nome, literal vendedor)
inicio
	this.nome = nome;
    this.vendedor = vendedor;

	literal getNome(){
        return nome;
    }
	void setNome(literal novoNome){
        this.nome = novoNome;
    }
	
	literal getVendedor(){
        return vendedor;
    }
	void setVendedor(literal novoVendedor){
        this.vendedor = novoVendedor;
    }
fim