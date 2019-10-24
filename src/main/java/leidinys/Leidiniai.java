package leidinys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Leidiniai {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String pav;	
    private String data;	
    private String vieta;	
    private String leidykla;
    private String kalba;
    private String kodai;
    private String apie;
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
	 * @return the pav
	 */
	public String getPav() {
		return pav;
	}
	/**
	 * @param pav the pav to set
	 */
	public void setPav(String pav) {
		this.pav = pav;
	}
	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
	/**
	 * @return the vieta
	 */
	public String getVieta() {
		return vieta;
	}
	/**
	 * @param vieta the vieta to set
	 */
	public void setVieta(String vieta) {
		this.vieta = vieta;
	}
	/**
	 * @return the leidykla
	 */
	public String getLeidykla() {
		return leidykla;
	}
	/**
	 * @param leidykla the leidykla to set
	 */
	public void setLeidykla(String leidykla) {
		this.leidykla = leidykla;
	}
	/**
	 * @return the kalba
	 */
	public String getKalba() {
		return kalba;
	}
	/**
	 * @param kalba the kalba to set
	 */
	public void setKalba(String kalba) {
		this.kalba = kalba;
	}
	/**
	 * @return the kodai
	 */
	public String getKodai() {
		return kodai;
	}
	/**
	 * @param kodai the kodai to set
	 */
	public void setKodai(String kodai) {
		this.kodai = kodai;
	}
	/**
	 * @return the apie
	 */
	public String getApie() {
		return apie;
	}
	/**
	 * @param apie the apie to set
	 */
	public void setApie(String apie) {
		this.apie = apie;
	}
}
