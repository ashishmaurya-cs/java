
public class Home {
	
	void setUpHomePage(User u){
		System.out.println("Name" + u.getName());
		System.out.println("Address " + u.getAddress());
		System.out.println("Mobile" + u.getMobile());
		System.out.println("Email" + u.getEmail());
		System.out.println("Pass" + u.getPass());
		System.out.println("Gender" + u.getGender());
		Post p=u.getPost();
		System.out.println("Title" + p.getTitle());
		System.out.println("Time" + p.getTime());
		System.out.println("Date" + p.getDate());
		
	}

}
