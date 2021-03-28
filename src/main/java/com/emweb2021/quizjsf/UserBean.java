
package com.emweb2021.quizjsf;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Enio e Mayara
 */
@Named(value = "userBean")
@SessionScoped
public class UserBean implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String logout() {
        FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .invalidateSession();
        return "logout";
    }

}
