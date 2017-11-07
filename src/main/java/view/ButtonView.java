package view;

import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ButtonView {
     
    private String sampleId;    

	public String getSampleId() {
		return sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}
}
