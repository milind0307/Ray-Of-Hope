/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Role.FinanceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aniketmirajkar
 */
public class FinancialVerificationOrganization extends Organization {
    
    String name;
    
    public FinancialVerificationOrganization(String name) {
        super(name);
        this.name=name;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return  Organization.Type.FinanceCheck;
    }
}
