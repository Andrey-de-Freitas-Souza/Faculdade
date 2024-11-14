package jogojava;

public class Personagem{
    String nome;
    int resp, respM;
    int energia = 10;
    int fome = 0;
    int sono = 0;
    int comida = 0; 
    
    public Personagem(int energia, int fome, int sono){
	if(energia >= 0 && energia <=10)
            this.energia = energia;
        if(fome >= 0 && fome <=10)
            this.fome = fome;
            
        if(sono >= 0 && sono <=10)
            this.sono = sono;		
	}
	
	public Personagem(String nome, int energia, int fome, int sono){
            this(energia,fome,sono);
            this.nome = nome;	
	}

	
	public void cacar(){
            if(energia >= 2){
            System.out.println(nome + " PASSOU O DIA CACANDO...");
            energia -=2;
            comida = Math.min(comida+1, 10);
	}else{
            System.out.println(nome + " ESTA SEM ENERGIA PARA CACAR!");
            energia = 0;
	}
            fome = Math.min(fome+1, 10);
            sono = Math.min(sono+1, 10);			
        }
        
	public void comer(){
	if(fome >= 1 && comida >= 1){
            System.out.println(nome + " RESOLVEU SE ALIMENTAR HOJE...");	
            energia = Math.min(energia+1, 10);
            fome = Math.min(fome-1, 10);
            comida = Math.min(comida-1, 10);
	}else{
            System.out.println(nome + " ESTA SEM FOME OU SEM COMIDA!");
            fome = Math.min(fome+1, 10);
         }
	}
	public void dormir(){
            if(sono >= 1){
		System.out.println(nome + " PASSOU O DIA DORMINDO...");
		sono = Math.max(sono-1,0);
		energia = energia + 1 <= 10 ? energia + 1 : 10;
                fome = Math.min(fome+1, 10);
            }
            else{
                System.out.println(nome + " ESTA SEM SONO");
                fome = Math.min(fome+1, 10);
            }
	}
        public void verday(){
            if(fome == 10 || energia <= 1){
                
                System.out.println(nome + " nao sobreviveu a mais um dia");
                System.out.println("--------------------------------------------------");
        
            }else{
                
                System.out.println(nome + " conseguiu sobreviver por mais um dia");
                System.out.println("-----------------------------------------");
                             
            }
            
        } 
        
        public void status(){
            System.out.println(nome + " ESTA COM:");
            System.out.println(energia + " pontos de energia,");
            System.out.println(sono + " pontos de sono,");
            System.out.println(fome + " pontos de fome");
            System.out.println(comida + " unidades de carnes");
            System.out.println("---------------------");
        }
        
        public void manual(){
                System.out.println("MANUAL DO JOGO:");
                System.out.println("OS DOIS JOGADORES COMECAM COM 10 DE ENERGIA, 0 DE FOME E 0 DE SONO!");
                System.out.println("OS JOGADORES PODEM DORMIR, COMER OU CACAR!");        
                System.out.println("SE UM JOGADOR DORMIR, ELE PERDE 1 PONTO DE SONO E GANHA 1 DE ENERGIA E 1 DE FOME!");
                System.out.println("SE UM JOGADOR COMER, ELE GANHA 1 PONTO DE ENERGIA E PERDE 1 DE FOME!");
                System.out.println("SE UM JOGADOR CACAR, ELE PERDE 2 PONTOS DE ENERGIA E GANHA 1 DE FOME E 1 DE SONO!"); 
                System.out.println("UM JOGADOR SÓ PODE COMER SE ELE POSSUIR CARNE, A CADA UMA CACADA O JOGADOR GANHA 1 CARNE!");
                System.out.println("=================================================================================");
            
        }
      public void escolha(){
          if(resp == 1){
                dormir();
            }
            else if(resp == 2){
                 cacar();              
            }
            else if(resp == 3){
                 comer();              
            }
      }                
}       	