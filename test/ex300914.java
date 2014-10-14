package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ex300914 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner entrada = new Scanner(System.in);
	        
	        ArrayList <Cadastro> aluno = new ArrayList<>();
	        
	        
	        int opcao;
	        int remover;
	        int menu;
	        
	        
	        String nome;
	        String CPF;
	        String celular;
	        String email;
	        double altura;
	        double peso;
	        int frequencia;
	        
	        
	        
	        do        
	        {
	        System.out.println("1- Cadastrar \n2- Remover \n3- Listar Totos \n4- Sair");
	        opcao = entrada.nextInt();
	            
	       
	        
	            switch (opcao){
	            case 1:
	                
	                
	                System.out.println("Insira o Nome ");
	                nome = entrada.next();
	                System.out.println("Infrome o CPF");
	                CPF = entrada.next();
	                System.out.println("Insira o Celular ");
	                celular = entrada.next();
	                System.out.println("Insira o Email ");
	                email = entrada.next();
	                System.out.println("Insira a Altura ");
	                altura = entrada.nextDouble();
	                System.out.println("Insira o Peso ");
	                peso = entrada.nextDouble();
	                System.out.println("Insira a Frquencia");
	                frequencia = entrada.nextInt();
	                System.out.println("");
	        
	                Cadastro novoAluno = new Cadastro();
	                novoAluno.setNome(nome);
	                novoAluno.setCPF(CPF);
	                novoAluno.setCelular(celular);
	                novoAluno.setEmail(email);
	                novoAluno.setAltura(altura);
	                novoAluno.setPeso(peso);
	                aluno.add(novoAluno);
	                
	                               
	                break;
	                
	            case 2:
	                
	                System.out.println("Qual vc deseja excluir???");
	                remover = entrada.nextInt();
	                if(remover>=0 && remover <aluno.size())
	                {
	                    aluno.remove(remover);
	                    System.out.println("Removido");
	                }
	                else
	                System.out.println("Opcao invalida");
	                
	                
	                break;
	                
	            case 3:
	                for(int i=0; i<aluno.size(); i++){
	                 System.out.println(aluno.get(i).Imprimir());
	                }
	                
	                break;
	            default:
	                if(opcao!=4)
	                {
	                    System.out.println("Opcao invalida!!!!!!!!");
	                }
	           
	        }
	             
	            
	        }while(opcao != 4);
	        

	     /*   
	        Cadastro aluno = new Cadastro(nome, CPF);
	        Cadastro aluno = new Cadastro();
	        aluno.Dados(nome, CPF, celular, email, altura, peso);
	       aluno.setFrequencia(frequencia);
	       aluno.Imprimir();
	       */ 
	        
	       
	    }
	}


