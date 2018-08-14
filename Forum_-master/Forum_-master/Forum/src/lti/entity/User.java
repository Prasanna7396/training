package lti.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_s")
public class User {
	@Id
	@Column(name = "user_id")
	private String userId;
	private String password;
	private String email;

	/*
	 * @OneToMany(mappedBy="user" ,fetch = FetchType.EAGER, cascade =
	 * CascadeType.ALL) //@JoinColumn(name="user_id") private Set<Comment> cmt = new
	 * HashSet<Comment>();
	 */

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Feed> feed = new HashSet<Feed>();

	public User() {

	}

	/*
	 * public Set<Comment> getCmt() { return cmt; }
	 * 
	 * 
	 * public void setCmt(Set<Comment> cmt) { this.cmt = cmt; }
	 */

	public Set<Feed> getFeed() {
		return feed;
	}

	public void setFeed(Set<Feed> feed) {
		this.feed = feed;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
