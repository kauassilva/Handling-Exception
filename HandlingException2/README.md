# Compra de Produtos

O projeto representa a compra de produtos. O programa solicita ao usuário que insira os dados do produto, como nome, descrição, preço e quantidade em estoque. Em seguida, ele valida essas informações e verifica se há algum erro na cadastro do produto. Se houver algum erro, uma mensagem referente ao erro será exibida e o programa deve ser encerrado.

Se der certo, o programa solicita que o usuário informe a quantidade desejada do produto a ser comprado. Se houver estoque suficiente para a compra, o preço total da compra é calculado e exibido junto com a nova quantidade em estoque. Se ocorrer algum erro durante esse processo, uma mensagem deverá ser exibida.


## Tratamento de exceções

### Exceções de cadastro do produto
- O nome do produto não pode ser vazio;
- O preço do produto não pode ser menor ou igual a zero;
- A quantidade em estoque do produto não pode ser menor ou igual a zero.

### Exceções de compra do produto
- A quantidade desejada do produto não pode ser menor ou igual a zero;
- A quantidade desejada do produto não pode ser maior que a quantidade em estoque.
