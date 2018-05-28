/*
 * 
 * http://java2db.com/web-services/simple-java-web-service-example-using-eclipseglassfish
*/
package HellowWorld;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HellowWorldService {
    
@WebMethod
public String  Hellow()
{
String message = "Hi ! i am the first and simple service....";
System.out.println("Hi ! i am the first and simple service....");
return message;
}
}