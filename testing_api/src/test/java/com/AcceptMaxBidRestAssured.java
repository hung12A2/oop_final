package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import core.model.request.acceptmaxbid.AcceptMaxBidRequestModel;
import core.model.request.createauction.CreateAuctionRequestModel;
import core.model.request.createbid.CreateBidRequestModel;
import core.model.request.createcomment.CreateCommentRequestModel;
import core.model.request.createitem.CreateItemRequestModel;
import core.model.request.login.LoginRequestModel;
import core.model.response.BaseParamsModel;
import core.model.response.acceptmaxbid.AcceptMaxBidResponseModel;
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
import core.constant.Constant.Request.RequestApiAcceptMaxBid;
import core.constant.Constant.Request.RequestApiAuctionsByStatus;
import core.constant.Constant.Request.RequestApiAuctionsByUser;

public class AcceptMaxBidRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_ACCEPT_MAX_BID;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
		AcceptMaxBidRequestModel requestBody = RequestApiAcceptMaxBid.UnitTest000.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiAcceptMaxBid.apiPath + "/" + RequestApiAcceptMaxBid.UnitTest000.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			AcceptMaxBidResponseModel resObj = mapper.readValue(res.asString(), AcceptMaxBidResponseModel.class);
      
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
	//LOI 1006, KHONG PHAI NGUOI TAO AUCTION
    public static ResponseUnitTest UnitTest001() {
    	
		AcceptMaxBidRequestModel requestBody = RequestApiAcceptMaxBid.UnitTest001.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiAcceptMaxBid.apiPath + "/" + RequestApiAcceptMaxBid.UnitTest001.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
			
			AcceptMaxBidResponseModel resObj = mapper.readValue(res.asString(), AcceptMaxBidResponseModel.class);
      
	        assert resObj.getCode() == 1006;
	       // assert resObj.getMessage().equals("OK");
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
	//Loi 1009, CHAP NHAN KHI PHIEN DAU GIA CHUA KET THUC
	@Test
    public static ResponseUnitTest UnitTest002() {
    	
		AcceptMaxBidRequestModel requestBody = RequestApiAcceptMaxBid.UnitTest002.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiAcceptMaxBid.apiPath + "/" + RequestApiAcceptMaxBid.UnitTest002.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[2]);
	        rut.setOutput(res.asPrettyString());
			
			AcceptMaxBidResponseModel resObj = mapper.readValue(res.asString(), AcceptMaxBidResponseModel.class);
      
	       assert resObj.getCode() == 1009;
	       // assert resObj.getMessage().equals("OK");
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
	//LOI 1010, DA BAN THANH CONG
	@Test
    public static ResponseUnitTest UnitTest003() {
    	
		AcceptMaxBidRequestModel requestBody = RequestApiAcceptMaxBid.UnitTest003.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN_1)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiAcceptMaxBid.apiPath + "/" + RequestApiAcceptMaxBid.UnitTest003.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[3]);
	        rut.setOutput(res.asPrettyString());
			
			AcceptMaxBidResponseModel resObj = mapper.readValue(res.asString(), AcceptMaxBidResponseModel.class);
      
	        assert resObj.getCode() == 1010;
	       // assert resObj.getMessage().equals("OK");
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
	//LOI 1011, CHUA CO AI TRA GIA
	@Test
    public static ResponseUnitTest UnitTest004() {
    	
		AcceptMaxBidRequestModel requestBody = RequestApiAcceptMaxBid.UnitTest004.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN_1)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .when()
	                .post(RequestApiAcceptMaxBid.apiPath + "/" + RequestApiAcceptMaxBid.UnitTest004.auctionId);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[4]);
	        rut.setOutput(res.asPrettyString());
			
			AcceptMaxBidResponseModel resObj = mapper.readValue(res.asString(), AcceptMaxBidResponseModel.class);
      
	        assert resObj.getCode() == 1011;
	       // assert resObj.getMessage().equals("OK");
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
    		case (1):
    			rut = UnitTest001();
    			break;
    		case (2):
    			rut = UnitTest002();
    			break;
    		case(3):
    			rut =UnitTest003();
    		    break;
    		case (4):
    			rut =UnitTest004();
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
    }}
 

