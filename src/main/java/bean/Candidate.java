package bean;

import java.util.List;

public class Candidate {

	private String name;
	private AvailableDate availability;
	private String enterpriseId;			//only if internal
	private int phoneNumber;				//only if external
	private List<String> skills;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AvailableDate getAvailability() {
		return availability;
	}
	public void setAvailability(AvailableDate getAvailability) {
		this.availability = getAvailability;
	}
	public String getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
}
