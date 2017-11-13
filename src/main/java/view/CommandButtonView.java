package view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.stereotype.Component;
 
//import javax.faces.bean.ManagedBean;
//annotations don't work due to jetty embedded server; must use faces-config.xml
//annotation default name property is same as class name in camel case
//@ManagedBean(name = "name")
//@ManagedBean
@Component
public class CommandButtonView {
     
	public void buttonAction(ActionEvent actionEvent) {
        addMessage("Welcome to Primefaces!!");
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public String getDate() {
		return new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date());
	}
}
