package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Login {
	
	private Long id;
	private String username;
	private String password;
	private Long cusId;
	private String privilege = "custo";
	
	public Login(String username, String password, Long cusId) {
		this.setUsername(username);
		this.setPassword(password);
		this.setCusId(cusId);
	}
	
	public Login(Long id, String username, String password, Long cusId, String privilege) {
		this.setId(id);
		this.setUsername(username);
		this.setPassword(password);
		this.setCusId(cusId);
		this.setPrivilege(privilege);
	}
	
	public Long getId() {return this.id;}
	public void setId(Long id) {this.id = id;}
	public String getUsername() {return this.username;}
	public void setUsername(String username) {this.username = username;}
	public String getPassword() {return this.password;}
	public void setPassword(String password) {this.password = password;}
	public Long getCusId() {return this.cusId;}
	public void setCusId(Long cusId) {this.cusId = cusId;}
	public String getPrivilege() {return this.privilege;}
	public void setPrivilege(String privilege) {this.privilege = privilege;}

	@Override
	public String toString() {
		return "username=" + username + ", cusId=" + cusId + ", privilege=" + privilege + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, password, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(id, other.id) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	
	
	

}
