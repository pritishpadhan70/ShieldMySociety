package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the POST database table.
 * 
 */
@Entity
@NamedQuery(name="Post.findAll", query="SELECT p FROM Post p")
public class Post implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int pid;

	@Column(name="CREATED_TIME")
	private Timestamp createdTime;

	@Column(name="FLAT_ID")
	private int flatId;

	@Column(name="FROM_POST")
	private String fromPost;

	private String subject;

	@Column(name="TO_POST")
	private String toPost;

	//bi-directional many-to-one association to PostType
	@ManyToOne
	@JoinColumn(name="POST_TYPE")
	private PostType postTypeBean;

	public Post() {
	}

	public int getPid() {
		return this.pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public int getFlatId() {
		return this.flatId;
	}

	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}

	public String getFromPost() {
		return this.fromPost;
	}

	public void setFromPost(String fromPost) {
		this.fromPost = fromPost;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getToPost() {
		return this.toPost;
	}

	public void setToPost(String toPost) {
		this.toPost = toPost;
	}

	public PostType getPostTypeBean() {
		return this.postTypeBean;
	}

	public void setPostTypeBean(PostType postTypeBean) {
		this.postTypeBean = postTypeBean;
	}

}