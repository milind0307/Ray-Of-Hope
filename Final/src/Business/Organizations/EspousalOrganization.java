/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.EspousalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketmirajkar
 */
public class EspousalOrganization extends Organization {
    
    String name;
    
    public EspousalOrganization(String name) {
        super(name);
        this.name=name;
    
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EspousalRole());
        return roles;
    }
    @Override
    public Organization.Type getType() {
        return  Organization.Type.Espousal;
    }    
}
