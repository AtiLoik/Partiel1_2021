package eu.ensup.partielspringbootweb.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * Classe métier représentant un cours.
 * 
 * @author 33651
 *
 */
@Entity
public class Course
{
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	private String themeCourse;
	private int numberHours;
	
	@ManyToMany(mappedBy ="courses",fetch = FetchType.EAGER)    
	private Set<Student> students =new  HashSet<Student>();


	public Course()
	{
		super();
	}

	public Course(String themeCourse, int numberHours)
	{
		super();
		this.themeCourse = themeCourse;
		this.numberHours = numberHours;
	}
	
	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	public String getThemeCourse()
	{
		return themeCourse;
	}

	public void setThemeCourse(String themeCourse)
	{
		this.themeCourse = themeCourse;
	}

	public int getNumberHours()
	{
		return numberHours;
	}

	public void setNumberHours(int numberHours)
	{
		this.numberHours = numberHours;
	}

	@Override
	public String toString()
	{
		return "Course [themeCourse=" + themeCourse + ", numberHours=" + numberHours + "]";
	}
}
