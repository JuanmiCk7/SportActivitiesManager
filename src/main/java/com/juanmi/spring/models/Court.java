package com.juanmi.spring.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Court {
	
	@Id @GeneratedValue
	private long id;
	
	private String name;
	private String img;
	
	public Court() {}
	
	public Court(String name, String img) {
		super();
		this.name = name;
		this.img = img;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, img, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Court other = (Court) obj;
		return id == other.id && Objects.equals(img, other.img) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Court [id=" + id + ", name=" + name + ", img=" + img + "]";
	}
	
	
	
}
