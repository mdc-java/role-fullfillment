package view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
 
//import javax.faces.bean.ManagedBean;
//annotations don't work due to jetty embedded server; must use faces-config.xml
//annotation default name property is same as class name in camel case
//@ManagedBean(name = "name")
//@ManagedBean
@Component
public class AutoCompleteView {
     
    private String txt1;
    private String txt2;

    public List<String> completeText(String query) {
        List<String> results = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            results.add(query + i);
        }
         
        return results;
    }

    public String getTxt1() {
        return txt1;
    }
 
    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
 
    public String getTxt2() {
        return txt2;
    }
 
    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
}