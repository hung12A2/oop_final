package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import core.model.request.createauction.CreateAuctionRequestModel;
import core.model.request.createbid.CreateBidRequestModel;
import core.model.request.createcomment.CreateCommentRequestModel;
import core.model.request.createitem.CreateItemRequestModel;
import core.model.request.login.LoginRequestModel;
import core.model.response.BaseParamsModel;
import core.model.response.createauction.CreateAuctionResponseModel;
import core.model.response.createbid.CreateBidResponseModel1;
import core.model.response.createbid.CreateBidResponseModel2;
import core.model.response.createcomment.CreateCommentResponseModel2;
import core.model.response.createitem.CreateItemResponseModel;
import core.model.response.getlistauctions.AuctionsResponseModel;
import core.model.response.login.LoginResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiCreateBid;
import core.constant.Constant.Request.RequestApiCreateComment;
import core.constant.Constant.Request.RequestApiCreateItem;
import core.constant.Constant.Request.RequestApiAuctionsByStatus;
import core.constant.Constant.Request.RequestApiAuctionsByUser;

public class CreateBidRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_CREATE_BID;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
		CreateBidRequestModel requestBody = RequestApiCreateBid.UnitTest000.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateBid.apiPath + "/" + RequestApiCreateBid.UnitTest000.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			CreateBidResponseModel1 resObj = mapper.readValue(res.asString(), CreateBidResponseModel1.class);
      
	        //assert resObj.getCode() == 1000;
	       // assert resObj.getMessage().equals("OK");
	       // assertNotNull(resObj.getData());
	        

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	//LOI 1001, TRA GIA THAP HON PRICE HIEN TAI
	@Test
    public static ResponseUnitTest UnitTest001() {
		CreateBidRequestModel requestBody = RequestApiCreateBid.UnitTest001.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateBid.apiPath + "/" + RequestApiCreateBid.UnitTest001.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
			
			CreateBidResponseModel1 resObj = mapper.readValue(res.asString(), CreateBidResponseModel1.class);
      
	       // assert resObj.getCode() == 1000;
	       // assert resObj.getMessage().equals("OK");
	        //assertNotNull(resObj.getData());

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	//LOI 1008, PHIEN DAU GIA DA KET THUC 	
	@Test
    public static ResponseUnitTest UnitTest002() {
    	
		CreateBidRequestModel requestBody = RequestApiCreateBid.UnitTest002.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateBid.apiPath + "/" + RequestApiCreateBid.UnitTest002.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[2]);
	        rut.setOutput(res.asPrettyString());
			
			CreateBidResponseModel1 resObj = mapper.readValue(res.asString(), CreateBidResponseModel1.class);
      
	       // assert resObj.getCode() == 1000;
	       // assert resObj.getMessage().equals("OK");
	        //assertNotNull(resObj.getData());

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	//LOI 1001, NEN LA 1008
	@Test
    public static ResponseUnitTest UnitTest003() {
    	
		CreateBidRequestModel requestBody = RequestApiCreateBid.UnitTest003.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiCreateBid.apiPath + "/" + RequestApiCreateBid.UnitTest003.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[3]);
	        rut.setOutput(res.asPrettyString());
			
			CreateBidResponseModel1 resObj = mapper.readValue(res.asString(), CreateBidResponseModel1.class);
      
	       // assert resObj.getCode() == 1000;
	       // assert resObj.getMessage().equals("OK");
	        //assertNotNull(resObj.getData());

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
    		case (1):
    			rut = UnitTest001();
    		    break;
    		case (2):
    			rut = UnitTest002();
    		    break;
    		case (3):
    			rut = UnitTest003();
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