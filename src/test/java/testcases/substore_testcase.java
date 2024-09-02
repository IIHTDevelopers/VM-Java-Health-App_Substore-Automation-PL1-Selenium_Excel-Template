package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import pages.StartupPage;
import pages.substore_page;
import testBase.AppTestBase;
import testBase.UserActions;
import testdata.LocatorsFactory;

public class substore_testcase extends AppTestBase {

	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath + "expected_data.xlsx";
	String loginFilePath = loginDataFilePath + "Login.xlsx";
	StartupPage startupPage;
	String randomInvoiceNumber;
	LocatorsFactory locatorsFactoryInstance;
	UserActions userActionsInstance;
	substore_page substorePageInstance;

	@Parameters({ "browser", "environment" })
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readExcelPOI(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);

		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		Assert.assertTrue(isValidUrl,
				configData.get("url") + " might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
	}

	@Test(priority = 1, groups = {
			"sanity" }, description = "Precondition: User should be logged in and on the healthapp section\n"
					+ "1. Login in the healthapp application\n" + "2. Scroll down menu till Substore\n"
					+ "3. Click on the Substore" + "4. SubStore module should be present")

	public void verifySubstoreCounterSubModule() throws Exception {
		substorePageInstance = new substore_page(driver);

		Map<String, String> substoreExpectedData = new FileOperations().readExcelPOI(expectedDataFilePath, "substore");
		Map<String, String> loginData = new FileOperations().readExcelPOI(loginFilePath, "credentials");

		Assert.assertTrue(substorePageInstance.loginToHealthAppByGivenValidCredetial(loginData),
				"Login failed, Invalid credentials ! Please check manually");
		Assert.assertTrue(substorePageInstance.scrollDownAndClickSubstoreTab());
		System.out.println("Substore Page url : " + substoreExpectedData.get("URL"));
		Assert.assertEquals(substorePageInstance.verifySubstorePageUrl(), substoreExpectedData.get("URL"));
	}

	@Test(priority = 2, groups = { "sanity" }, description = "1. Login in the healthapp application\r\n"
			+ "2. Click on the substore \r\n" + "3. \"Select your Substore\" pop up "
			+ "4. Expected value that should be present in \"Select your Substore\" modal\r\n"
			+ "Expected sub-modals button:  Accounts,male ward SubStore,SubStore1,SubStore1")

	public void verifySubstoreSubModules() {
		try {
			substorePageInstance = new substore_page(driver);

			Assert.assertTrue(substorePageInstance.clickFourthCounterIfAvailable());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3, groups = {
			"sanity" }, description = "Precondition: User should be logged in and on the Verification section\\n\"\r\n"
					+ "	+ \"1. Click on the Inventory Module\r\n"
					+ "	+ \"2. Hover over on module signout button and get text"
					+ "3. Verify text To change, you can always click here.")

	public void verifySubstoreModule() throws Exception {
		substorePageInstance = new substore_page(driver);
		Map<String, String> substoreExpectedData = new FileOperations().readExcelPOI(expectedDataFilePath, "substore");
		Assert.assertTrue(substorePageInstance.verifyModuleSignoutHoverText(substoreExpectedData));
	}

	@Test(priority = 4, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on SubStore module\r\n"
					+ "1. Login in the healthapp application\r\n" + "2. Click on the Substore\r\n"
					+ "3. \"Select your Substore\" pop up \r\n" + "4. Click on \"Account\" sub-modal\r\n"
					+ "5. Click on the \"Inventory\" sub-module\r\n" + "6. Click on\" Pharmacy\" sub-module\r\n"
					+ "7. All sub-modules should be displayed correctly.\r\n"
					+ "8. Expected Sub modules are : Pharmacy, Inventory")

	public void verifySubstoreSubModule() throws Exception {
		substorePageInstance = new substore_page(driver);

		Map<String, String> substoreExpectedData = new FileOperations().readExcelPOI(expectedDataFilePath, "substore");

		Assert.assertTrue(substorePageInstance.verifySubstoreSubModule(substoreExpectedData));
	}

	@Test(priority = 5, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on SubStore module\r\n"
					+ "1. Click on the SubStore Module drop-down arrow   \r\n"
					+ "2. Click on Inventory module. Expected Sub modules are : Stock, Inventory Requisition, Consumption, Reports, Patient Consumption,Return")

	public void verifyAllSubstoreModulesAreDisplayedInSublist() throws Exception {
		substorePageInstance = new substore_page(driver);

		Assert.assertTrue(substorePageInstance.subModulePresent("Inventory"));
	}

	@Test(priority = 6, groups = { "sanity" }, description = "Pre condition: User should be logged in \r\n"
			+ "1. Click on the Substore Module drop-down arrow" + "2. Verify navigation between sub-modules")

	public void verifyNavigationBetweenSubmodules() throws Exception {

		substorePageInstance = new substore_page(driver);
		Assert.assertTrue(substorePageInstance.verifyNavigationBetweenSubmodules());
	}

	@Test(priority = 7, groups = { "sanity" }, description = "Under Substore module > INventory Section\"\r\n"
			+ "			+ \"Take the screenshot of the current page")
	public void takingScreenshotOfCurrentPage() throws Exception {
		substorePageInstance = new substore_page(driver);
		Assert.assertTrue(substorePageInstance.takingScreenshotOfTheCurrentPage());
	}

	@Test(priority = 8, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on SubStore module\r\n"
					+ "1. Click on the SubStore module drop-down arrow \r\n" + "2. Click on Inventory sub-module\r\n"
					+ "3. Click on Inventory Requisition section")

	public void verifyInventoryRequisitionSection() throws Exception {

		Assert.assertTrue(substorePageInstance.verifyIfInventoryReqInputFieldsDropdownsAndCheckboxesAreVisibleOrNot());
	}

	@Test(priority = 9, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory sub-module\r\n"
					+ "1. Click on \"Inventory Requisition\" section\r\n"
					+ "2. Click on \"Create Requisition\" button\r\n"
					+ "3. Click on \"Target Inventory \" field and Select \"GENERAL-INVENTORY\" option\r\n"
					+ "4. Click on \"Item Category\" drop down and select \" Consumables\"  option\r\n"
					+ "5. Enter \"tissue\" in ItemName field\r\n" + "6. Enter the \"Required Quantity\" field \r\n"
					+ "7. Click on \"Request\" button\r\n" + "8. Click on \"Close\" icon\r\n"
					+ "9. Verify popup message Requisition is Generated and Saved")

	public void verifyCreateRequisitionButton() throws Exception {
		substorePageInstance = new substore_page(driver);
		Map<String, String> substoreExpectedData = new FileOperations().readExcelPOI(expectedDataFilePath, "substore");

		Assert.assertEquals(substorePageInstance.verifyCreateRequisitionButton(),
				substoreExpectedData.get("requisitionGenerationMsg"));
	}

	@Test(priority = 10, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory Sub-module\r\n"
					+ "1. Navigate to \"Inventory Requisition\" section\r\n"
					+ "2. Click on the \"From\" date and select the \"Jan 2022\" date\r\n"
					+ "3. Click on the \"To\" date and Select \"Current date\" \r\n" + "4. Click on \"OK\" button\r\n"
					+ "5. The 'Date' column date must fall within the selected date ")
	public void verifyDateRangeFilterFunctionality() throws Exception {
		substorePageInstance = new substore_page(driver);
		userActionsInstance = new UserActions(driver);

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String toDate = currentDate.format(formatter);

		userActionsInstance.click(substorePageInstance.getAnchorTagLocatorByText("Inventory Requisition"));
		substorePageInstance.applyDateFilter("01-01-2022", toDate);
		Thread.sleep(3000);
		substorePageInstance.verifyRequisitionDatesAsPerTheDateRange("01-01-2022", toDate);
	}

	@Test(priority = 11, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory sub-module > List Request section \r\n"
					+ "1. Click on the data range button. \r\n" + "2. select \"one week\" option from the drop down.")

	public void VerifyDateRangeButton() throws Exception {
		substorePageInstance = new substore_page(driver);

		Assert.assertTrue(substorePageInstance.VerifyDateRangeButton());
	}

	@Test(priority = 12, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory sub-module\r\n"
					+ "1. Navigate to \"Inventory Requisition\" section\r\n" + "2. Select option ar per the choice")
	public void verifyFilterByStoreFunctionality() throws Exception {
		substorePageInstance = new substore_page(driver);
		Assert.assertTrue(substorePageInstance.verifyFilterByStoreFunctionality());
	}

	@Test(priority = 13, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory sub-module\r\n"
					+ "1. Naviaget to \"Inventory Requisition\" section\r\n" + "2. Select \"Pending\" radio button\r\n"
					+ "3. Select \"Complete\" radio button\r\n" + "4. Select \"Canceled\" radio button\r\n"
					+ "5. Select \"Withdrawn\" radio button\r\n" + "6. Select \"All\" radio button\r\n"
					+ "7. Ensure that all radio buttons in the \"List by Requisition Status\" field are functional and clickable.")

	public void verifyInventoryRequisitionRadioButtonSection() throws Exception {
		substorePageInstance = new substore_page(driver);
		Assert.assertTrue(substorePageInstance.verifyInventoryRequisitionRadioButtonSection());
	}

	@Test(priority = 14, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory sub-module\r\n"
					+ "1. Naviagte to the \"Inventory Requisition\" section\r\n"
					+ "2. Click on \"all\" radio button\r\n" + "3. Enter the pending keyword in the search bar.\r\n"
					+ "4. Record should be present as per the entered keyword")

	public void verifyRecordsAreFilteredAccordingToSearchData() throws Exception {
		substorePageInstance = new substore_page(driver);

		Assert.assertTrue(substorePageInstance.verifyRecordsAreFilteredAccordingToSearchData());
	}

	@Test(priority = 15, groups = {
			"sanity" }, description = "Pre condition: User should be logged in and it is on Inventory sub-module > List Request section \r\n"
					+ "1. Navigate to \" Inventory Requisition\" section \r\n"
					+ "2.  Click on \"View\" button of the specfic record.\r\n"
					+ "3. Click on \"Close\" icon button\r\n"
					+ "4. After Clicking \"View\" button, \"REQUISITION DETAILS PRINT\" page should pop up and by Clicking on close icon, user should navigate back to the Inventory Requisition page ")

	public void verifyPrintModalIsOpenedIfUserSelectsViewButton() throws Exception {
		substorePageInstance = new substore_page(driver);

		Assert.assertTrue(substorePageInstance.verifyPrintModalIsOpenedIfUserSelectsViewButton());
	}

	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}

	@AfterMethod
	public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
	}

}
