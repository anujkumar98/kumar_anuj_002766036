/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anujkumar
 */
public class CommunityAdminDirectory extends PersonDirectory {

    private List<CommunityAdmin> adminDirectory = new ArrayList();

    public List<CommunityAdmin> getadminDirectory() {
        return adminDirectory;
    }

    public void setPatientDirectory(List<CommunityAdmin> adminDirectory) {
        this.adminDirectory = adminDirectory;
    }

    public CommunityAdmin addAdmin(String name) {
        CommunityAdmin communityAdmin = new CommunityAdmin();
        this.adminDirectory.add(communityAdmin);
        this.addPerson(communityAdmin);
        return communityAdmin;
    }

    public void removeAdmin(String username) {
        for (int i = 0; i < this.adminDirectory.size(); i++) {
            CommunityAdmin communityAdmin = this.adminDirectory.get(i);
            if (communityAdmin.getUserName().equals(username)) {
                this.adminDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }

}
