/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.FundingFinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketmirajkar
 */
public class FinanceOrganization extends Organization {
    
    String name;
    
    public FinanceOrganization(String name) {
        super(name);
        this.name=name;
    }
    public FinanceOrganization() {
       super(Organization.Type.FinanceOrganization.getValue());
    }

   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundingFinanceRole());
        return roles;
    }
    @Override
    public Organization.Type getType() {
        return  Organization.Type.FinanceOrganization;
    }
}
