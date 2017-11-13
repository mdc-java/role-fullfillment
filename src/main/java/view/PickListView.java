package view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.event.UnselectEvent;
import org.primefaces.model.DualListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.SampleService;
 
//import javax.faces.bean.ManagedBean;
//annotations don't work due to jetty embedded server; must use faces-config.xml
//annotation default name property is same as class name in camel case
//@ManagedBean(name = "name")
//@ManagedBean
@SuppressWarnings("restriction")
@Component
public class PickListView {
     
    //@ManagedProperty("#{sampleService}")
    @Autowired
    private SampleService service;
     
    private DualListModel<String> samples;    
     
    @PostConstruct
    public void init() {
        List<String> sampleSource = service.getSamples();        
        List<String> sampleTarget = new ArrayList<String>();
        
        samples = new DualListModel<String>(sampleSource, sampleTarget);
    }
 
    public DualListModel<String> getSamples() {
        return samples;
    }
 
    public void setSamples(DualListModel<String> samples) {
        this.samples = samples;
    }
 
    public SampleService getService() {
        return service;
    }
 
    public void setService(SampleService service) {
        this.service = service;
    }
    
    public void onTransfer(TransferEvent event) {
        StringBuilder builder = new StringBuilder();
        for(Object item : event.getItems()) {
            builder.append(item.toString()).append("<br />");
        }
         
        FacesMessage msg = new FacesMessage();
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        msg.setSummary("Items Transferred");
        msg.setDetail(builder.toString());
         
        FacesContext.getCurrentInstance().addMessage(null, msg);
    } 
 
    public void onSelect(SelectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Selected", event.getObject().toString()));
    }
     
    public void onUnselect(UnselectEvent event) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item Unselected", event.getObject().toString()));
    }
     
    public void onReorder() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "List Reordered", null));
    } 
}