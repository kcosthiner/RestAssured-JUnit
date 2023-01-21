package metodosget;



import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MetodosGet {

	Response response;

	@Test
	public void ListUsers() {
		response = RestAssured.get("https://reqres.in/api/users?page = 2");
		System.out.println("Resposta Lista de Usuários: " + response.asPrettyString());
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Status Code: " + response.getStatusCode());
	}

	@Test
	public void ListSingleUser() {
		response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println("Resposta Usuário Único: " + response.asPrettyString());
		System.out.println("");
		System.out.println("Status Code:" + response.getStatusCode());

	}

	@Test
	public void SingleUserNotFound() {
		response = RestAssured.get("https://reqres.in/api/users/23");
		System.out.println("Resposta Usuário Único Inválido: " + response.asPrettyString());
		System.out.println("");
		System.out.println("");
		System.out.println("Status Code: " + response.getStatusCode());
	}

	@Test
	public void ListResource() {
		
		response = RestAssured.get("https://reqres.in/api/unknown");
		System.out.println("Resposta Lista Resource:" + response.asPrettyString());
		System.out.println("");
		System.out.println("");
		System.out.println("Status Code: " + response.getStatusCode());
		
	
	}
	
	
}
