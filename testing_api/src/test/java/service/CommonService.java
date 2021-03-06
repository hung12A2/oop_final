package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.AcceptMaxBidRestAssured;
import com.AuctionsByStatusRestAssured;
import com.AuctionsByTypeRestAssured;
import com.AuctionsByUserRestAssured;
import com.ChangePassRestAssured;
import com.ContactUsRestAssured;
import com.CreateAuctionRestAssured;
import com.CreateBidRestAssured;
import com.CreateCommentRestAssured;
import com.CreateItemRestAssured;
import com.DeleteAuctionRestAssured;
import com.DeleteCommentRestAssured;
import com.DetailAuctionRestAssured;
import com.EditAccountRestAssured;
import com.EditAuctionRestAssured;
import com.EditItemRestAssured;
import com.GetListAuctionsRestAssured;
import com.GetListBidsRestAssured;
import com.GetListBrandsRestAssured;
import com.GetListCategoriesRestAssured;
import com.GetListCommentsRestAssured;
import com.GetListLikesRestAssured;
import com.GetNewsRestAssured;
import com.GetNotificationsRestAssured;
import com.GetSliderRestAssured;
import com.GetTotalLikesRestAssured;
import com.InfoAuctionRestAssured;
import com.InfoRestAssured;
import com.LikeAuctionRestAssured;
import com.LogOutRestAssured;
import com.LoginRestAssured;
import com.ReadNewsRestAssured;
import com.ReadNotificationRestAssured;
import com.SearchRestAssured;
import com.SignUpRestAssured;

import core.constant.Constant;
import core.helper.CommonHelper;
import core.model.responseunittest.ResponseUnitTest;

public class CommonService{

	private static int apiId = 0;
	private static int checkUnit = 0; // 0: check all unit test, 1: check one unit test
	private static int unitTestId = 0;
	private static String[] listApi = Constant.LIST_API;

	// cần login thì run cái unittest000 của login trước 
	public static void run() {
		List<ResponseUnitTest> listRut = new ArrayList<ResponseUnitTest>();
		switch (apiId) {
			case (0):
				listRut = LoginRestAssured.run(checkUnit, unitTestId);
				break;
			case (1):
				listRut = SignUpRestAssured.run(checkUnit, unitTestId);
				break;
			case (2):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = LogOutRestAssured.run(checkUnit, unitTestId);
				break;
			case (3):
				listRut = AuctionsByStatusRestAssured.run(checkUnit, unitTestId);
				break;
			case (4):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = AuctionsByUserRestAssured.run(checkUnit, unitTestId);
				break;
			case (5):
				listRut = DetailAuctionRestAssured.run(checkUnit, unitTestId);
				break;
			case (6):
				listRut = SearchRestAssured.run(checkUnit, unitTestId);
				break;
			case (7):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = CreateAuctionRestAssured.run(checkUnit, unitTestId);
				break;
			case (8):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = EditAuctionRestAssured.run(checkUnit, unitTestId);
				break;
			case (9):
				listRut = GetListBrandsRestAssured.run(checkUnit, unitTestId);
				break;
			case (10):
				listRut = GetListCategoriesRestAssured.run(checkUnit, unitTestId);
				break;
			case (11):
				listRut = GetListBidsRestAssured.run(checkUnit, unitTestId);
				break;
			case (12):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = CreateItemRestAssured.run(checkUnit, unitTestId);
				break;
			case (13):
				listRut = GetListCommentsRestAssured.run(checkUnit, unitTestId);
				break;
			case (14):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = CreateCommentRestAssured.run(checkUnit, unitTestId);
				break;
			case (15):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = DeleteCommentRestAssured.run(checkUnit, unitTestId);
				break;
			case (16):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = LikeAuctionRestAssured.run(checkUnit, unitTestId);
				break;
			case (17):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = GetListLikesRestAssured.run(checkUnit, unitTestId);
				break;
			case (18):
				listRut = GetTotalLikesRestAssured.run(checkUnit, unitTestId);
			break;
			case (19):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = GetNewsRestAssured.run(checkUnit, unitTestId);
				break;
			case (20):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = ReadNewsRestAssured.run(checkUnit, unitTestId);
				break;
			case (21):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = GetNotificationsRestAssured.run(checkUnit, unitTestId);
				break;
			case (22):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = ReadNotificationRestAssured.run(checkUnit, unitTestId);
				break;
			case (23):
				listRut = GetSliderRestAssured.run(checkUnit, unitTestId);
			break;
			case (24):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = EditAccountRestAssured.run (checkUnit, unitTestId);
				break;
			case (25):
				listRut = GetListAuctionsRestAssured.run (checkUnit, unitTestId);
			break;
			case (26):
				listRut = AuctionsByTypeRestAssured.run(checkUnit, unitTestId);
			break;
			case (27):
				listRut = ContactUsRestAssured.run(checkUnit, unitTestId);
			break;
			case (28):
				LoginRestAssured.init();
			    LoginRestAssured.runUnitTest(0);
				listRut = CreateBidRestAssured.run(checkUnit, unitTestId);
				break;
			case (29):
				LoginRestAssured.init();
		        LoginRestAssured.runUnitTest(0);
		        LoginRestAssured.runUnitTest(3);
		        listRut = AcceptMaxBidRestAssured.run(checkUnit, unitTestId);
		        break;
			case(30):
				LoginRestAssured.init();
	            LoginRestAssured.runUnitTest(4);
	            listRut = ChangePassRestAssured.run(checkUnit, unitTestId);
	            break;
			case(31):
				LoginRestAssured.init();
	            LoginRestAssured.runUnitTest(0);
	            listRut = InfoRestAssured.run(checkUnit, unitTestId);
	            break;
			case(32):
				LoginRestAssured.init();
	            LoginRestAssured.runUnitTest(0);
	            listRut = DeleteAuctionRestAssured.run(checkUnit, unitTestId);
	            break;
			case(33):
				LoginRestAssured.init();
	            LoginRestAssured.runUnitTest(0);
	            listRut = InfoAuctionRestAssured.run(checkUnit, unitTestId);
	            break;
			case (34):
				LoginRestAssured.init();
				LoginRestAssured.runUnitTest(0);
				listRut = EditItemRestAssured.run (checkUnit, unitTestId);
				break;
			default:
				break;
		}
		CommonHelper.printListResponseUnittest(listRut);
	}


	public static int getApiId() {
		//System.out.println("API is: "+ listApi[apiId]);
		return apiId;
	}

	public static void setApiId() {
		System.out.println("Please choose a API");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		apiId = 0;
        for (int index = 0; index < listApi.length; index++) {
        	System.out.println("Press " + index + " --- " + listApi[index]);
        }
        reader = new BufferedReader(new InputStreamReader(System.in));
        try {
			apiId = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("API is: "+ listApi[apiId]);
        CommonHelper.showListUnitTest(apiId);
	}

	public static int getCheckUnit() {
		return checkUnit;
	}

	public static void setCheckUnit() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 0 to check all units or 1 to check one unit");
        reader = new BufferedReader(new InputStreamReader(System.in));
        checkUnit = 0;
		try {
			checkUnit = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int getUnitTestId() {
		return unitTestId;
	}

	public static void setUnitTestId() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (checkUnit == 0) return;
		System.out.println("Please choose a unit of " + listApi[apiId]);     	
        reader = new BufferedReader(new InputStreamReader(System.in));
        unitTestId = 0;
		try {
			unitTestId = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
