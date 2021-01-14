package eu.ensup.partielspringbootweb.entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;


/**
 * Classe métier représentant un étudiant.
 * @author 33651
 *
 */
@Entity

@DiscriminatorValue("STUDENT")
public class Student extends Personne
{
	
	/*
	 * private String firstName; private String lastName; private String
	 * mailAddress; private String address; private String numberPhone; private
	 * String birthDate;
	 */
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "student_course",
	joinColumns = {@JoinColumn(name = "student_id")},
	inverseJoinColumns = {@JoinColumn(name = "course_id")})
    private Set<Course> courses = new HashSet<>();
	
	public Student()
	{
		super();
		
	}

	
}
