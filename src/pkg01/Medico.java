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
public class Medico extends Pessoa{
    private String especialidades;
    private int crm;
    private String senhaMedico;
    private double salario;
    
    public String getEspecialidades(){
        return this.especialidades;
    }
    public void setEspecialidades(String especialidades){
        this.especialidades = especialidades;
    }
    
    public int getCrm(){
        return this.crm;
    }
    public void setCrm(int crm){
        this.crm = crm;
    }
    
    public String getSenhaMedico(){
        return this.senhaMedico;
    }
    public void setSenhaMedico(String senhaMedico){
        this.senhaMedico = senhaMedico;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    @Override
    public boolean logar(String senha){
        boolean login = false;
        if (senha == this.senhaMedico){
            login = true;
        }else{
            login = false;
        }
        return login;
    }
            
}
