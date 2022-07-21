package patterns.samples;

import java.util.Properties;

public class ControllerEntryPoint {

	public static void main(String[] args) {
		String defaultRequest="login";
		String request= null;
		if(args.length>0) {
			 request=args[0];
		}
		if(request==null) {
			request=defaultRequest;
		}	
		Command obj=CommandFactory.createCommand(request);
		if(obj!=null) {
			//pass the input values as needed. now passing an empty string
			String result=obj.execute(new String());		
			System.out.println("result is " + result);
			Properties urlMappings=CommandFactory.urlToMappingHolderMap.get(request).getPageMappings();
			System.out.println(urlMappings.getProperty(result));
			
		}else {
			System.err.println("no mapping foud for identifier " + request);
		}
	}

}
