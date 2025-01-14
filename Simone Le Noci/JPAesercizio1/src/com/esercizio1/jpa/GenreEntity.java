package com.esercizio1.jpa;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class GenreEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "genre_id", unique = true)
	private int genre_id;

	@Column(name = "name", nullable = false)
	private String name;

	@OneToMany(mappedBy = "movie_id")
	private Set<MovieEntity> movies;

	public int getId() {
		return genre_id;
	}

	public void setId(int genre_id) {
		this.genre_id = genre_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return genre_id + "\t" + name + "\t";
	}
}