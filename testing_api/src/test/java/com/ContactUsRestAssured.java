package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import core.model.request.contactus.ContactUsRequestModel;
import core.model.request.createitem.CreateItemRequestModel;
import core.model.request.login.LoginRequestModel;
import core.model.response.BaseParamsModel;
import core.model.response.contactus.ContactUsResponseModel;
import core.model.response.createauction.CreateAuctionResponseModel;
import core.model.response.login.LoginResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiContactUs;
import core.constant.Constant.Request.RequestApiCreateItem;

public class ContactUsRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_CONTACT_US;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
		ContactUsRequestModel requestBody = RequestApiContactUs.UnitTest000.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiContactUs.apiPath);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			ContactUsResponseModel resObj = mapper.readValue(res.asString(), ContactUsResponseModel.class);
      
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage().equals("OK");
	        //assertNotNull(resObj.getData());
	        System.out.println("Finished! Satisfied!");
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	
	@Test
    public static ResponseUnitTest UnitTest001() {
		//API CHAY SAI KQ
		ContactUsRequestModel requestBody = RequestApiContactUs.UnitTest001.requestBody;
	    ResponseUnitTest rut = new ResponseUnitTest();
	    ObjectMapper mapper = new ObjectMapper();
	    	
	    String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().contentType(ContentType.JSON)
		              .body(jsonString)
		              .when()
		              .post(RequestApiContactUs.apiPath);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[1]);
		       rut.setOutput(res.asPrettyString());
				
			ContactUsResponseModel resObj = mapper.readValue(res.asString(), ContactUsResponseModel.class);
	      
		   assert resObj.getCode() == 1001;
		  // assert resObj.getMessage().equals("name: &phone: &email: &content: &report_type: The selected report type is invalid.");
		  //assertNotNull(resObj.getData());
		   System.out.println("Finished! Satisfied!");
		} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (Exception ex) {
				ex.printStackTrace();
		}
	return rut;
	}
	@Test
    public static ResponseUnitTest UnitTest002() {
		//API CHAY SAI KQ
				ContactUsRequestModel requestBody = RequestApiContactUs.UnitTest002.requestBody;
			    ResponseUnitTest rut = new ResponseUnitTest();
			    ObjectMapper mapper = new ObjectMapper();
			    	
			    String jsonString;
				try {
					jsonString = mapper.writeValueAsString(requestBody);
					Response res = given().contentType(ContentType.JSON)
				              .body(jsonString)
				              .when()
				              .post(RequestApiContactUs.apiPath);

					rut.setInput(jsonString);
					rut.setName(listUnitTest[2]);
				       rut.setOutput(res.asPrettyString());
						
					ContactUsResponseModel resObj = mapper.readValue(res.asString(), ContactUsResponseModel.class);
			      
				   assert resObj.getCode() == 1001;
				  // assert resObj.getMessage().equals("name: &phone: &email: &content: &report_type: The selected report type is invalid.");
				  //assertNotNull(resObj.getData());
				   System.out.println("Finished! Satisfied!");
				} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				} catch (Exception ex) {
						ex.printStackTrace();
				}
			return rut;
	}
	
	public static ResponseUnitTest runUnitTest(int unitTestId) {
    	
    	ResponseUnitTest rut = new ResponseUnitTest();
    	switch (unitTestId) {
    		case (0):
    			rut = UnitTest000();
    			break;
    		case(1):
    			rut = UnitTest001();
    		    break;
    		case(2):
    			rut =UnitTest002();
    		  break;
    		default: 
    			break;
    	}
    	return rut;
    }
    public static List<ResponseUnitTest> run(int checkUnit, int unitTestId) {
    	
    	init();
    	List<ResponseUnitTest> listRut = new ArrayList<ResponseUnitTest>();
    	if (checkUnit == 0) {
    		for (int i = 0; i < listUnitTest.length; i++) {
    			ResponseUnitTest rut = runUnitTest(i);
    			listRut.add(rut);
    		}
    	}
    	else {
    		ResponseUnitTest rut = runUnitTest(unitTestId);
    		listRut.add(rut);
    	}
    	return listRut;
    }
 

}