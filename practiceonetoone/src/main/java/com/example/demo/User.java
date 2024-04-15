package com.example.demo;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="users")
	
	private Course course;

	public User(Integer id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
}
