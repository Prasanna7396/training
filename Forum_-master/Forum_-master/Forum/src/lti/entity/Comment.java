package lti.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment {
	@Id
	@GeneratedValue
	private int comId;
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "feedId", nullable = false)
	private Feed feed;
	@Column(name="comments")
	private String comment;
	private Date comstamp;

	public Comment() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public int getComId() {
		return comId;
	}

	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getComstamp() {
		return comstamp;
	}

	public void setComstamp(Date comstamp) {
		this.comstamp = comstamp;
	}

}
