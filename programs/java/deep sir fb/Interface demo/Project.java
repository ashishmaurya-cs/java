import java.util.Scanner;

class User{
	private String name;
	private String pass;
	private String email;
	private String address;
	private String mobile;
	private String gender;
	private Post post;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
}
class Post{
	private String title;
	private String date;
	private String time;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}

class Login{
	
	public User isLogin(String email,String pass){
		User u=null;
		if(email.equals("deepsingh44@gmail.com")&&pass.equals("12345")){
			Post post=new Post();
			post.setTitle("digital india");
			post.setDate("11 nov 2016");
			post.setTime("12:00 pm");
			u=new User();
			u.setAddress("delhi");
			u.setEmail(email);
			u.setPass(pass);
			u.setGender("male");
			u.setMobile("8826276918");
			u.setName("Deep Singh");
			u.setPost(post);
			
		}
		return u;
	}
	
}

public class Project {
public static void main(String[] args) {
	Login l=new Login();
	Scanner s=new Scanner(System.in);
	System.out.println("enter email id");
	String email=s.next();
	System.out.println("enter pass ");
	String pass=s.next();
	User u=l.isLogin(email,pass);
	if(u!=null){
		new Home().setUpHomePage(u);
	}else{
		System.err.println("u r not a valid user !");
	}
}
}
