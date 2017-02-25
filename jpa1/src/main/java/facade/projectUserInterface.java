/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entity.Project;
import entity.ProjectUser;
import java.util.ArrayList;

/**
 *
 * @author William Pfaffe
 */
public interface projectUserInterface {
    public void createUser(ProjectUser user);
    public ProjectUser findUser(int id);
    public ArrayList getAllUsers();
    public void createProject(Project project);
    public void assignUserProject();
    public Project getProject(int idProject);
}
