import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Loja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcoes, login;
        boolean iniciar = true;

        System.out.println("Insira seu e-mail, para logar\nSe não for cadastrado, aperte 1!");
        login = Integer.parseInt(entrada.nextLine());

        String nome, email;

        while (login == 1) {
            System.out.println("Escreva seu nome completo?");
            nome = entrada.nextLine();

            System.out.println("Qual é o seu email?");
            email = entrada.nextLine();

            if (nome.length() > 5 && nome.length() < 30 && email.contains("@")) {
                System.out.println("\nCadastro realizado com sucessso\n");
                break;
            } else {
                System.out.println("\ne-mail ou nome inválidos!\n");
            }
        }


            ArrayList<String> listaProdutos;
            listaProdutos = new ArrayList<String>();

            Double valorTotal = 0.00;
            Double valores = 0.00;
    

        while (iniciar) {

           int roupas, cosmesticos, eletronicos, bijuterias, addCarrinho,verCar,comprar,voltar,formaPagamento,cartao; 
           String nomeCartao;     

            System.out.println("\nQuais são os setores de sua preferência?\nEscolha as opcões que melhor se encaixam:\n1. Roupas\n2.Cosmésticos\n3.Eletrônicos\n4.Bijuterias\n5.Vizualizar carrinho.\n");
            opcoes = entrada.nextInt();

            if(valores == 0){
                valorTotal = valores + valores;
            }

            switch (opcoes) {
                case 1:
                    System.out.println("\n1.Camiseta\n2.Calça moletonm\n3.Calça jeans\n4.Abrigo\n5.Casaco\n6.Meias\n");
                    roupas = entrada.nextInt();
                    switch (roupas) {
                        case 1:
                            System.out.println("\nCamiseta\n-->Valor:R$29.99\n\nAdicionar ao carrinho?\n1 --> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Camiseta");
                                valores += 29.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("\nCalça moletom\n-->Valor:R$59,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Calça moletom");
                                valores += 59.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("\nCalça jeans\n-->Valor:R$89,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Calça jeans");
                                valores += 89.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }

                            break;
                        case 4:
                            System.out.println("\nAbrigo\n-->Valor:R$79,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Abrigo");
                                valores += 79.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;

                        case 5:
                            System.out.println("\nCasaco\n-->Valor:R$49,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Casaco");
                                valores += 49.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 6:
                            System.out.println("\nKit 6 meias\n-->Valor:R$29,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Kit 6 meias");
                                valores += 29.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n1.Perfume Calika\n2.Perfume sensação\n3.Perfume aurélia\n4.Hidratante corporal coral\n5.Máscara hidratante facial\n");
                    cosmesticos = entrada.nextInt();
                    switch (cosmesticos) {
                        case 1:
                            System.out.println("\nPerfume Calika\n-->Valor:R$159.99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Perfume Calika");
                                valores += 159.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("\nPerume sensação\n-->Valor:R$119,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Perfume sensação");
                                valores += 119.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("\nPerfume aurélia\n-->Valor:R$99,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Perfume aurélia");
                                valores += 99.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else{
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 4:
                            System.out.println("\nHidratante corporal\n-->Valor:R$59,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Hidratante corporal");
                                valores += 59.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 5:
                            System.out.println("\nMáscara hidratante facial\n-->Valor:R$49,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Máscara hidratante facial");
                                valores += 49.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\n1.Craregador universal\n2.Carregador Tipo C\n3.Carregador Tipo V8\n4.Cabo HDMI\n5.Cabo IVGA\n6.Cabo P2\n7. Conversor digital\n");
                    eletronicos = entrada.nextInt();

                    switch (eletronicos) {
                        case 1:
                            System.out.println("\nCarregador uiversal\n-->Valor:R$20,00\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Carregador universal");
                                valores += 20.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 2:
                            System.out.println("\nCarregador Tipo C\n-->Valor:R$15,00\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Carregador Tipo C");
                                valores += 15.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 3:
                            System.out.println("\nCarregdor Tipo V8\n-->Valor:R$15,00\n\nAdicionar ao carrinho?\n1-->Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Carregador Tipo V8");
                                valores += 15.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 4:
                            System.out.println("\nCabo HDMI\n-->Valor:R$29,99\n\nAdicionar ao carrinho?\n--> Sim\n-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Cabo HDMI");
                                valores += 29.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 5:
                            System.out.println("\nCabo IVGA\n-->Valor:R$35,00\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Cabo IVGA");
                                valores += 35.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 6:
                            System.out.println("\nCabo P2\n-->Valor:R$9,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Cabo P2");
                                valores += 9.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 7:
                            System.out.println("\nConversor Digital\n-->Valor:R$39,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Conversor digital");
                                valores += 39.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                    }
                    break;
                case 4:
                    System.out.println("\n1.Colar lua\n2.Colar banhado\n3.Brinco pérola\n4.Brinco banhado\n");
                    bijuterias = entrada.nextInt();
                    
                    switch (bijuterias) {
                        case 1:
                            System.out.println("\nColar lua\n-->Valor:R$12,00\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Colar lua");
                                valores += 12.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                            }
                            break;
                        case 2:
                            System.out.println("\nColar banhado\n-->Valor:R$25,00\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Colar banhado");
                                valores += 25.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                            }
                            break;
                        case 3:
                            System.out.println("\nBrinco pérola\n-->Valor:R$25,00\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Brinco pérola");
                                valores += 25.00;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                            break;
                        case 4:
                            System.out.println("\nBrinco banhado\n-->Valor:R$19,99\n\nAdicionar ao carrinho?\n1--> Sim\n2-->Não\n");
                            addCarrinho = entrada.nextInt();
                            if (addCarrinho == 1) {
                                listaProdutos.add("Brinco banhado");
                                valores += 19.99;
                                System.out.println("Produto adicionado ao seu carrinho");
                            } else {
                                System.out.println("ok!");
                                break;
                            }
                        break;
                    }
                    break;
                case 5:
                    System.out.println("\n1.Vizualizar carrinho.\n");
                    verCar = entrada.nextInt();
                
                    switch (verCar) {
                        case 1:
                            System.out.println(listaProdutos);
                            DecimalFormat formatador = new DecimalFormat("0.00");
                            System.out.println("R$ "+ formatador.format(valores));
                            System.out.println("\n1.Finalizar compra.\n2.Retornar ao menu inicial.\n");
                            comprar = entrada.nextInt();
                            if(comprar == 1){
                                System.out.println("\nEscolha uma forma de pagamento:\n1.pix\n2.boleto\n3.cartão de crédito\n");
                                formaPagamento = entrada.nextInt();
                                if(formaPagamento == 1){
                                    System.out.println("\n1.Chave pix: 65681030-9399-4496-a7da-a79b8fb4aa15.\n");
                                }
                                if(formaPagamento == 2){
                                    System.out.println("\n1.Boleto enviado para boleto cadastrado. \n");
                                }else{
                                    if(formaPagamento == 3){
                                        System.out.println("\nDigite o nome contido no cartão: \n");
                                        nomeCartao = entrada.nextLine();
                                        System.out.println("\nDigite o número do cartão: \n");
                                        cartao = entrada.nextInt();
                                        System.out.println("\nDigite a chave de segurança do cartão: \n");
                                        cartao = entrada.nextInt();
                                    }
                                }
                            }else{
                                System.out.println("\nFaça uma ótima compra!");
                            } 
                        break;
                    }
                break;
                case 6:
                    iniciar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                break;
            }
        }
        entrada.close();
    }
}

