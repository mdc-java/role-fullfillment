package view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import bean.Element;
 
@ManagedBean
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
