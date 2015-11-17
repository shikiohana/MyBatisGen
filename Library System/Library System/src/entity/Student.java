package entity;

public class Student {
	private String sex;
	private int age;
	private String stNumb;
	private String stPassword;
	private String major;
	private String book;
	
	public Student(){
		
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setStNumb(String stNumb){
		this.stNumb=stNumb;
	}
	public String getStNumb(){
		return stNumb;
	}
	public void setStPassword(String stPassword){
		this.stPassword=stPassword;
	}
	public String getStPassword(){
		return stPassword;
	}
	public void setMajor(String major){
		this.major=major;
	}
	public String getStMajor(){
		return major;
	}
	public void setBook(String book){
		this.book=book;
	}
	public String getBook(){
		return book;
	}
}
