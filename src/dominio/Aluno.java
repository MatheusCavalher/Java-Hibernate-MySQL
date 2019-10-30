package dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aluno", schema = "bd_univ")
public class Aluno implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno")
	private int id;
	@Column(name = "mat_aluno", nullable = false, length = 50)
	private String matricula;
	@Column(name = "nm_aluno", nullable = false, length = 50)
	private String nome;
	@Column(name = "cpf_aluno", nullable = false, length = 11)
	private String cpf;

	public Aluno() {
	}

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String _matricula) {
		this.matricula = _matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String _cpf) {
		this.cpf = _cpf;
	}
}
