package leidinys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kalbos {	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String kodas;	
    private String pavadinimas;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the kodas
	 */
	public String getKodas() {
		return kodas;
	}
	/**
	 * @param kodas the kodas to set
	 */
	public void setKodas(String kodas) {
		this.kodas = kodas;
	}
	/**
	 * @return the pavadinimas
	 */
	public String getPavadinimas() {
		return pavadinimas;
	}
	/**
	 * @param pavadinimas the pavadinimas to set
	 */
	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}	
  
}
