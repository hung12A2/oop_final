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
import core.model.response.deleteauction.DeleteAuctionResponseModel;
import core.model.response.getlistauctions.AuctionsResponseModel;
import core.model.response.info.InfoResponseModel;
import core.model.response.infoauction.InfoAuctionResponseModel;
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
import core.constant.Constant.Request.RequestApiDeleteAuction;
import core.constant.Constant.Request.RequestApiInfo;
import core.constant.Constant.Request.RequestApiInfoAuction;
import core.constant.Constant.Request.RequestApiAcceptMaxBid;
import core.constant.Constant.Request.RequestApiAuctionsByStatus;
import core.constant.Constant.Request.RequestApiAuctionsByUser;

public class InfoRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_INFO;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
		try {
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .get(RequestApiInfo.apiPath);
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			InfoResponseModel resObj = mapper.readValue(res.asString(), InfoResponseModel.class);
      
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
	public static ResponseUnitTest runUnitTest(int unitTestId) {
    	
    	ResponseUnitTest rut = new ResponseUnitTest();
    	switch (unitTestId) {
    		case (0):
    			rut = UnitTest000();
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