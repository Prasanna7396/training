package forum.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table
public class Comment {
	@Id
	private int commentId;
	@ManyToOne
	@JoinColumn(name="feedId")
	private Feed feed;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	private String comment;
	private Date commentstamp;
	
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public Feed getFeed() {
		return feed;
	}
	public void setFeed(Feed feed) {
		this.feed = feed;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCommentstamp() {
		return commentstamp;
	}
	public void setCommentstamp(Date commentstamp) {
		this.commentstamp = commentstamp;
	}


}
