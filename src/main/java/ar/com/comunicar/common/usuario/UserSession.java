package ar.com.comunicar.common.usuario;

import java.io.Serializable;
import java.util.Set;

/**
 * @author mpatriarca
 * 
 */
public class UserSession implements Serializable {

	private static final long serialVersionUID = 5162837717143806068L;

	private Long id;
	private String userName;
	private String email;
	private Set<TipoUsuario> userType;

	public UserSession(Long id, String userName, String email,
			Set<TipoUsuario> userType) {
		this.id = id;
		this.userName = userName;
		this.userType = userType;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public Set<TipoUsuario> getUserType() {
		return userType;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUserType(Set<TipoUsuario> userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
