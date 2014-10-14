package test;

public class Cadastro {
	private String nome;
    private String email;
    private String celular;
    private double altura;
    private double peso;
    private double preco = 50;
    private double PrecoSemanal;
    private double mensalidade;
    private int frequencia;
    private String CPF;
    private double imc;
    
   /* public void Dados(String pNome, String pCPF, String pCel, String pEmail, double pAltura, double pPeso){
    
    this.nome = pNome;
    this.CPF = pCPF;
    this.celular = pCel;
    this.email = pEmail;
    this.altura = pAltura;
    this.peso = pPeso;
    
}*/
    

    
    public String Imprimir()
 {
     String print="";
     return "aluno: "+this.nome+"\nCPF: "+this.CPF+"\ncelular: "+this.celular+"\nemail: "+this.email+"\naltura: "+this.altura+"\npeso: "+this.peso;
     /*
 System.out.println("Contato : " + nome);
 System.out.println("CPF : " +CPF);
 System.out.println("Celular : " + celular);
 System.out.println("E-mail : " + email);
 System.out.println("Altura : " + altura);
 System.out.println("Peso : " + peso);
 System.out.println("IMC : " + IMC());
 System.out.println("Mensalidade : " + Mensalidade());
 */
 }
    public double IMC(){
        
        double imc = peso/(altura*altura);
        return imc;
    }
    
    public double Mensalidade(){
        
        
        
     double PrecoSemanal;
     double Mensalidade;
     
     if(frequencia == 0){
            return 0;
     }else{
     PrecoSemanal = preco*frequencia;
     Mensalidade = PrecoSemanal*4;
     
     return Mensalidade;  
    }
}
    
    public void setFrequencia(int pFrequencia){
        this.frequencia = pFrequencia;
    }
    public int getFrequencia(int pFrequencia){
        return this.frequencia;
    }

   /*
   public Cadastro(String pNome){
    this.nome = pNome;

}

    public Cadastro(String pNome, String pCPF){
    this.nome = pNome;
    this.CPF = pCPF;
}

    public Cadastro(String pNome, double pAltura, double pPeso){
    this.nome = pNome;
    this.altura = pAltura;
    this.peso = pPeso;
    imc = IMC();
}
    
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
