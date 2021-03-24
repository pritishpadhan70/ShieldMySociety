package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the POST_TYPE database table.
 * 
 */
@Entity
@Table(name="POST_TYPE")
@NamedQuery(name="PostType.findAll", query="SELECT p FROM PostType p")
public class PostType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PT_ID")
	private int ptId;

	private String description;

	private String name;

	//bi-directional many-to-one association to Post
	@OneToMany(mappedBy="postTypeBean")
	private List<Post> posts;

	public PostType() {
	}

	public int getPtId() {
		return this.ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Post addPost(Post post) {
		getPosts().add(post);
		post.setPostTypeBean(this);

		return post;
	}

	public Post removePost(Post post) {
		getPosts().remove(post);
		post.setPostTypeBean(null);

		return post;
	}

}