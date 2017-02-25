/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author William Pfaffe
 */
@Entity
@DiscriminatorColumn(name = "PROJECT_TYPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table
public class Project{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private Date created;
    private Date lastModified;

    @ManyToMany(targetEntity=ProjectUser.class)
    private ArrayList<ProjectUser> projectUserSet;

    public Project() {
        super();
    }

    public Project(int id, String name, String description, Date created, Date lastModified, ArrayList<ProjectUser> projectUserSet) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.created = created;
        this.lastModified = lastModified;
        this.projectUserSet = projectUserSet;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public ArrayList<ProjectUser> getProjectUserSet() {
        return projectUserSet;
    }

    public void setProjectUserSet(ArrayList<ProjectUser> projectUserSet) {
        this.projectUserSet = projectUserSet;
    }

    
    
    @Override
    public String toString() {
        return "entity.Project[ id=" + id + " ]";
    }
    
}
