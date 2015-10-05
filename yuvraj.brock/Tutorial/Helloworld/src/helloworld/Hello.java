package helloworld;

import javax.jws.HandlerChain;
import javax.jws.WebService;
@HandlerChain(file = "handler-chain.xml")
@WebService 
public class Hello {


	 
public String Hello(String s){
	return "hello " + s;
	
}

}
