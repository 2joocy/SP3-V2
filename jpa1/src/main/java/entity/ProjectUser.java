/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
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
@DiscriminatorColumn(name = "PROJECT_USER_TYPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table
public class ProjectUser{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    private String userName;
    private String email;
    private Date created = new Date();
    public int getId() {
        return idUser;
    }
    
   @ManyToMany(targetEntity = Project.class)
   private ArrayList<Project> projectSet;

    public ProjectUser() {
        super();
    }

    public ProjectUser(int idUser, String userName, String email, ArrayList<Project> projectSet) {
        super();
        this.idUser = idUser;
        this.userName = userName;
        this.email = email;
        this.projectSet = projectSet;
    }

    public void setId(int id) {
        this.idUser = id;
    }

    @Override
    public String toString() {
        return "entity.ProjectUser[ id=" + idUser + " ]";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    
    
}
