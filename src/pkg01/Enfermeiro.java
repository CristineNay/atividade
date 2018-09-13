/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01;

/**
 *
 * @author User
 */
public class Enfermeiro extends Pessoa {
    private int corem;
    private double salario;
    private String senhaEnfermeiro;
    
    public int getCorem(){
        return this.corem;
    }
    public void setCorem(int corem){
        this.corem = corem;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getSenhaEnfermeiro(){
        return this.senhaEnfermeiro;
    }
    public void setSenhaEnfermeiro(String senhaEnfermeiro){
        this.senhaEnfermeiro = senhaEnfermeiro;
    }
    
    @Override
    public boolean logar(String senha){
        boolean login = false;
        if (senha == this.senhaEnfermeiro){
            login = true;
        }else{
            login = false;
        }
        return login;
    }
}
