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
	
	para(i = 1; i < qtd_prod; i++) {
        escreva("\nDigite o nome do produto " + i + ": ");
        leia(produtos[i]);
            
    }
    para(i = 1; i < qtd_prod; i++) {
        escreva("\nDigite a quantidade de estoque do(a) " + produtos[i] + ": ");
        leia(qtd_estoque[i]);
    }
    para(i = 1; i < qtd_prod; i++) {
        escreva("O nome do produto: " + produtos[i] +
                           "\nTem a quantidade em estoque: " + qtd_estoque[i] + 
                           "\n");
    }
fim