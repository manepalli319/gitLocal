package com.bcj.rest.EliminationTest.service;

import java.io.IOException;
import java.net.HttpURLConnection;

import com.bcj.rest.EliminationTest.entity.Applicant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestService {

	Applicant applicant;

	public Applicant getApplicant() {

		ObjectMapper mapper = new ObjectMapper();

		try {

			Client client = Client.create();

			WebResource webresource = client.resource("http://localhost:8080/RestHibernate/webapi/json/product/get")
					.queryParam("id", "2");

			ClientResponse response = webresource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != HttpURLConnection.HTTP_CREATED) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output is :");
			System.out.println(output);

			try {
				applicant = mapper.readValue(output, Applicant.class);

				String firstName = applicant.getFirstName();

				System.out.println(firstName);

				System.out.println(applicant.getEmail());
			} catch (JsonParseException e) {

				e.printStackTrace();
			} catch (JsonMappingException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		} finally {
			System.out.println("Success");
		}
		return applicant;
	}

	public static void main(String[] args) {
		RestService rest = new RestService();

		rest.getApplicant();

	}
}
