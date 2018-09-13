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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente p = new Paciente();
        Medico m = new Medico();
        Enfermeiro e = new Enfermeiro();
        
        
        p.setNome("Jefferson");
        p.setSobrenome("Sousa");
        p.setCpf("13");
        p.setRg("1331");
        p.setCodPaciente(01);
        p.setSenhaPaciente("aa");
        
        m.setNome("Fernando");
        m.setEspecialidades("geral");
        m.setCrm(1);
        m.setCpf("22");
        m.setRg("33");
        m.setSobrenome("Silva");
        m.setSenhaMedico("44");
        m.setSalario(2000);
        
        e.setNome("Fabricio");
        e.setSobrenome("Rodrigues");
        e.setCpf("1231321");
        e.setRg("124665654");
        e.setCorem(1332);
        e.setSalario(1200.0);
        e.setSenhaEnfermeiro("ee");
        
        boolean loginM = m.logar("44");
        if(loginM){
        System.out.println("----------MÉDICO-------- \n"
                + "Nome: " + m.getNome()+"\n"
                + "Sobrenome: " + m.getSobrenome()+"\n"
                + "Cpf: " + m.getCpf()+"\n"
                + "Rg: " + m.getRg()+"\n"
                + "Especialidades: " + m.getEspecialidades()+"\n"
                + "Crm: " + m.getCrm()+"\n"
                + "Salario: " + m.getSalario()+"\n\n");
        }else{
            System.out.println("---ACESSO NEGADO---");
        }
        
        boolean loginE = e.logar("ee");
        if(loginE){
        System.out.println("----------ENFERMEIRO-------- \n"
                + "Nome: " + e.getNome()+"\n"
                + "Sobrenome: " + e.getSobrenome()+"\n"
                + "Cpf: " + e.getCpf()+"\n"
                + "Rg: " + e.getRg()+"\n"
                + "Corem: " + e.getCorem()+"\n"
                + "Salario: " + e.getSalario()+"\n\n");
        }else{
            System.out.println("---ACESSO NEGADO---");
        }
        
        boolean loginP = p.logar("bb");
        if(loginP){
        System.out.println("----------PACIENTE-------- \n"
                + "Nome: " + p.getNome()+"\n"
                + "Sobrenome: " + p.getSobrenome()+"\n"
                + "Cpf: " + p.getCpf()+"\n"
                + "Rg: " + p.getRg()+"\n"
                + "Cod Paciente: " + p.getCodPaciente()+"\n\n");
        }else{
            System.out.println("---ACESSO NEGADO---");
        }
        
    }
    
}
