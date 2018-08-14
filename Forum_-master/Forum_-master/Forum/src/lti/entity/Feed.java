package lti.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="feeds")
public class Feed {
	@Id
	@GeneratedValue
	private int feedId;
	private String question;
	@Temporal(TemporalType.TIMESTAMP)
	private Date feedstamp;
	 @ManyToOne
	    @JoinColumn(name="user_id", nullable=false)
	private User user;
	
	 @OneToMany(mappedBy="feed")
	private Set<Comment> cmt = new HashSet<Comment>();
	 

	public Feed() {

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Comment> getCmt() {
		return cmt;
	}

	public void setCmt(Set<Comment> cmt) {
		this.cmt = cmt;
	}

	public int getFeedId() {
		return feedId;
	}



	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getFeedstamp() {
		return feedstamp;
	}

	public void setFeedstamp(Date feedstamp) {
		this.feedstamp = feedstamp;
	}
	
	

}
