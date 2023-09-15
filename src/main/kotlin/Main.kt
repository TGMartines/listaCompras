/*
Desafio: Criar um Aplicativo de Lista de Compras

Neste desafio, você vai criar um aplicativo de lista de compras simples em Kotlin que pode ser executado no terminal. O objetivo é permitir que o usuário adicione, remova e visualize itens em uma lista de compras.

Aqui estão algumas diretrizes para o desafio:

Use a linguagem Kotlin para escrever o programa.
Crie um programa de terminal que exiba um menu com as seguintes opções:
Adicionar um item à lista de compras.
Remover um item da lista de compras.
Visualizar a lista de compras.
Sair do programa.
Implemente funções para realizar cada uma dessas operações.
Use uma estrutura de dados, como uma lista, para armazenar os itens da lista de compras.
Certifique-se de tratar entradas inválidas do usuário.
Permita que o usuário continue adicionando, removendo e visualizando itens até optar por sair do programa.
*/

fun main() {
    println("Aplicativo de Lista de Compras\n")

    var listaCompras = mutableListOf<String>()
    var repita = true
    var produto: String?

    while (repita) {
        println("Opções:\n1. Adicionar um item à lista de compras\n2. Remover um item da lista de compras")
        println("3. Visualizar a lista de compras\n4. Sair")
        val opcao = readLine()?.toIntOrNull() ?: 0
        when (opcao) {
            1 -> {
                println("Digite o nome do produto para adiciona-lo na lista de compras:")
                produto = readLine().toString()
                listaCompras.add(produto)
                println("O produto $produto foi adicionado à lista de compras.")
            }
            2 -> {
                println("Digite o nome do produto para remove-lo da lista de compras:")
                produto = readLine().toString()
                listaCompras.remove(produto)
                println("O produto $produto foi removido da lista de compras.")
            }
            3 -> {
                println("Abaixo segue a sua lista de compras:")
                    println(listaCompras)
            }
            4 -> {
                println("Obrigado. Volte sempre!")
                repita = false
            }
            else -> {
                println("Opção inválida!")
            }
        }
    }
}