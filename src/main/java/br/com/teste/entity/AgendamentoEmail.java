package br.com.teste.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
public class AgendamentoEmail implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String assunto; 
    private String menssagem;
    private boolean agendado;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAssunto() {
        return assunto;
    }
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
    public String getMenssagem() {
        return menssagem;
    }
    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
    }
    public boolean isAgendado() {
        return agendado;
    }
    public void setAgendado(boolean agendado) {
        this.agendado = agendado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AgendamentoEmail other = (AgendamentoEmail) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
