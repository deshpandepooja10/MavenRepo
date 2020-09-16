package pojo;

import java.util.List;

public class CourseName {
	private List<CourseDetailsone> webautomation;
	private List<CourseDetailsone> api;
	
	private List<CourseDetailsone> mobileautomation;
	public List<CourseDetailsone> getwebautomation()
	{
		return webautomation;
	}
	public void setwebautomation(List<CourseDetailsone> webautomation)
	{
		this.webautomation=webautomation;
	}
	public List<CourseDetailsone> getapi(){
		return api;
	}
	public void setapi(List<CourseDetailsone> api)
	{
		this.api=api;
	}
	public List<CourseDetailsone> getmobileautomation()
	{
		return mobileautomation;
	}
	public void setmobileautomation(List<CourseDetailsone> mobileautomation)
	{
		this.mobileautomation=mobileautomation;

}
}
