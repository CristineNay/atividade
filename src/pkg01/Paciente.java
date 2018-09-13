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
public class Paciente extends Pessoa {
    private int codPaciente;
    private String senhaPaciente;
    
    public int getCodPaciente(){
        return this.codPaciente;
    }
    
    public void setCodPaciente(int codPaciente){
        this.codPaciente = codPaciente;
    }
    public String getSenhaPaciente(){
        return this.senhaPaciente;
    }
    public void setSenhaPaciente(String senhaPaciente){
        this.senhaPaciente = senhaPaciente;
    }
    
    @Override
    public boolean logar(String senha){
        boolean login = false;
        if (senha == this.senhaPaciente){
            login = true;
        }else{
            login = false;
        }
        return login;
    }
}
