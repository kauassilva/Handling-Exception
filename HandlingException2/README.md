# Fabrica de Produtos Eletrônicos

Suponha que você esteja desenvolvendo um sistema para uma empresa que fabrica produtos eletrônicos. Você precisa criar uma classe Produto com atributos como nome, descrição, preço, quantidade em estoque, etc. Além disso, você precisa implementar um método que permita que o usuário compre um produto, que deve diminuir a quantidade em estoque do produto.

Para fazer isso, você pode criar um método "comprar()" na classe Produto que recebe um parâmetro inteiro (a quantidade de produtos a serem comprados) e diminui a quantidade em estoque do produto em relação à quantidade comprada. No entanto, o método deve verificar se a quantidade a ser comprada é maior do que a quantidade em estoque e, nesse caso, lançar uma exceção indicando que não há estoque suficiente.

Portanto, é necessário que o desenvolvedor faça o tratamento de exceções adequado ao implementar o método comprar().
