package view;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;
 
//import javax.faces.bean.ManagedBean;
//annotations don't work due to jetty embedded server; must use faces-config.xml
//annotation default name property is same as class name in camel case
//@ManagedBean(name = "name")
//@ManagedBean
@Component
public class ConfirmDialogView {
     
	public void proceed() {
        addMessage("OK", "Proceeding");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
