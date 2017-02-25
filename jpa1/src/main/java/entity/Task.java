/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author William Pfaffe
 */
@Entity
@DiscriminatorColumn(name = "TASK_TYPE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table

public class Task {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int fk_idProjectTask;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "entity.Task[ id=" + id + " ]";
    }

    public int getFk_idProjectTask() {
        return fk_idProjectTask;
    }

    public void setFk_idProjectTask(int fk_idProjectTask) {
        this.fk_idProjectTask = fk_idProjectTask;
    }

}
