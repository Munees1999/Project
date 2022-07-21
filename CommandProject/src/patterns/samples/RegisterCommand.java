package patterns.samples;

public class RegisterCommand implements Command {
	@Override
	public String execute(String request) {
		System.out.println("register command");
		int sec=new java.util.Date().getSeconds();
		int val=sec % 2;
		if(val==0) {
			return "success";
		}else {
			return "error";
		}
	}

}
