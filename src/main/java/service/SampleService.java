package service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class SampleService {

	public List<String> getSamples(){
		List<String> samples = new ArrayList<String>();

		samples.add("San Francisco");
		samples.add("London");
		samples.add("Paris");
		samples.add("Istanbul");
		samples.add("Berlin");
		samples.add("Barcelona");
		samples.add("Rome");
		
		return samples;
	}

}
