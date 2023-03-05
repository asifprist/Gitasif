package security;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;


@Entity
@Table(name="myuser_tbl")

public class MyUser {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid;
	private String username;
	private String useremail;
	private String userpass;
	@ElementCollection
	@CollectionTable(name="roles_tbl",joinColumns = @JoinColumn(name="uid"))
	private Set<String> roles;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(Integer userid, String username, String useremail, String userpass, Set<String> roles) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userpass = userpass;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "MyUser [userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", userpass="
				+ userpass + ", roles=" + roles + "]";
	}
	
	
	

}
