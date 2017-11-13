package view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import bean.Element;
 
//import javax.faces.bean.ManagedBean;
//annotations don't work due to jetty embedded server; must use faces-config.xml
//annotation default name property is same as class name in camel case
//@ManagedBean(name = "name")
//@ManagedBean
@Component
public class DataTableView {
     
    private List<Element> elements;

	public List<Element> getElements() {
		if(elements == null){
			elements = new ArrayList<Element>();
			elements.add(new Element());
			elements.add(new Element());
			elements.add(new Element());
			elements.add(new Element());
			elements.add(new Element());
			elements.add(new Element());
		}
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
}
