package pages;

import java.util.Map;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class substore_page extends StartupPage {

	

	public substore_page(WebDriver driver) {
		super(driver);
	}	

	public By getUsernameTextfieldLocator() {
		return By.id(" ");
	}

	public By getPasswordTextboxLocator() {

		return By.xpath(" ");
	}

	public By getSignInButtonLocator() {
		return By.xpath(" ");
	}

	public By getDropDownLocater() {
		return By.xpath(" ");
	}

	public By getRadiologyLocator() {
		return By.xpath("");
	}

	public By getDropDownInventoryLocater() {
		return By.xpath("");
	}

	public By getAccountsButton() {
		return By.xpath("");
	}

	public By getAnchorTagLocatorByText(String anchorTagName) {
		return By.xpath("");
	}

	public By getPageBarFixedLocator(String navBarName) {
		if (navBarName.equalsIgnoreCase(" ")) {
			navBarName = " ";
		} else if (navBarName.equalsIgnoreCase(" ")) {
			navBarName = " ";
		} else if (navBarName.equalsIgnoreCase(" ")) {
			navBarName = " ";
		} else if (navBarName.equalsIgnoreCase(" ")) {
		}
		return By.xpath("");
	}

	public By getSubstoreBoxOptionLocatorByText(String optionToSelect) throws Exception {
		return By.xpath("");
	}

	public By getSubstoreBoxLocator() {
		return By.xpath("");
	}

	public By getSubstoreSubmodulesLocator() {
		return By.xpath("");
	}

	public By getCounters() {
		return By.xpath("");
	}

	public By getCreateRequisitionButton() {
		return By.xpath("");
	}

	public By searchBarId() {
		return By.id("");
	}

	public By getStarIconLocator() {
		return By.xpath("");
	}

	public By getRadioButtonLocator(String radioButtonName) {
		return By.xpath("");
	}

	public By getTargetInventory() {
		return By.xpath("");
	}

	public By getItemName() {
		return By.xpath("");
	}

	public By getRequiredQuantity() {
		return By.xpath("");
	}

	public By getRequestButton() {
		return By.cssSelector("");
	}

	public By favouriteOrStarIcon() {
		return By.xpath("");
	}

	public By getCloseRequest() {
		return By.xpath("");
	}

	public By getCloseModalLocator() {
		return By.cssSelector("");
	}

	public By getDateRangeButton() {
		return By.xpath("");
	}

	public By getOneWeekButton() {
		return By.xpath("");
	}

	public By getViewButton() {
		return By.xpath("");
	}

	public By getCloseViewItem() {
		return By.xpath("");
	}

	public By getInternalCloseviewItem() {
		return By.xpath("");
	}

	public By getDirectDispatchButton() {
		return By.xpath("");
	}

	public By getBackToReqListButton() {
		return By.xpath("");
	}

	public By getRequestedToColumn() {
		return By.cssSelector("");
	}

	public By getStatusColumnLocator() {
		return By.cssSelector("");
	}

	public By getStoreName() {
		return By.cssSelector("");
	}

	public By getInternalItemNameButton() {
		return By.cssSelector("");
	}

	public By getDispatchedQuantityButton() {
		return By.xpath("");
	}

	public By getRemarksButton() {
		return By.xpath("");
	}

	public By getInternalDirectDispatchButton() {
		return By.cssSelector("");
	}

	public By getRecieveItemsButton() {
		return By.xpath("");
	}

	public By getRecieveButton() {
		return By.xpath("");
	}

	public By getNewConsumptionButton() {
		return By.xpath("");
	}

	public By getConsumptionDate() {
		return By.xpath("");
	}

	public By getSubModuleLocator() {
		return By.xpath("");
	}

	public By calendarFromDropdown() {
		return By.xpath("");
	}

	public By calendarToDropdown() {
		return By.xpath("");
	}

	public By getAllRequisitionDate() {
		return By.xpath("");
	}

	public By getGeneralInventory() {
		return By.cssSelector("");
	}

	public By getDotDropDownButton() {
		return By.xpath("");
	}

	public By getCounterReportModuleButton() {
		return By.xpath("");
	}

	public By getShowReportButton() {
		return By.xpath("");
	}

	public By getReturnItemsButton() {
		return By.xpath("");
	}

	public By getSelectInventoryButton() {
		return By.xpath("");
	}

	public By getGeneralInventoryButton() {
		return By.xpath("");
	}

	public By getReturnQtyButton() {
		return By.cssSelector("");
	}

	public By getReturnButton() {
		return By.xpath("");
	}

	public By getCounterButtonFourth() {
		return By.xpath("");
	}

	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath("");
	}

	public By getPopUpMessageText(String msgStatus, String messageText) {
		return By.xpath("");
	}

	public By popupCloseButton() {
		return By.cssSelector("");
	}

	public By printModalLocator() {
		return By.cssSelector("");
	}

	public By getEllipsisButtonByStatus(String status) {
		return By.xpath("");
	}

	public By getReceiveButtonByStatus(String status) {
		return By.xpath("");
	}

	public By getStockAvailableQuantity(String categoryName) {
		return By.xpath("");
	}

	public By getSaveButtonLocator() {
		return By.cssSelector("");
	}

	public By getReportsTableLocator() {
		return By.cssSelector("");
	}

	public By getModuleSignoutLocator() {
		return By.xpath("");
	}

	public By getHoverText() {
		return By.xpath("");
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		return false;

	}

	/**
	 * @Test1.2  about this method
	 * scrollDownAndClickMaternityTab()
	 * 
	 * @param : null
	 * @description : verify the Substore tab, scroll to it, and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public boolean scrollDownAndClickSubstoreTab() throws Exception {
		return false;
	}

	/**
	 * @Test1.3 about this method verifyVerificationPageUrl()
	 * 
	 * @param : null
	 * @description : verify verification page url
	 * @return : String
	 * @author : YAKSHA
	 */

	public String verifySubstorePageUrl() throws Exception {
		return null;
	}

	/**
	 * @Test2 about this method clickFirstCounterIfAvailable
	 * 
	 * @param : null
	 * @description : Clicks Counter modules
	 * @return : Boolean
	 * @throws : YAKSHA
	 */
	public boolean clickFourthCounterIfAvailable() throws Exception {
		return false;
	}

	/**
	 * @Test3 about this method verifyModuleSignoutHoverText()
	 * @param substoreExpectedData : Map<String, String> - Contains expected hover
	 *                             text
	 * @description : This method verifies that the hover text on the "Sign Out"
	 *              module matches the expected value.
	 * @return : boolean - true if the hover text matches the expected value, false
	 *         otherwise.
	 * @throws : Exception - if there is an issue finding the hover text or any
	 *           other operation.
	 * @author : YAKSHA
	 */
	public boolean verifyModuleSignoutHoverText(Map<String, String> substoreExpectedData) throws Exception {
		return false;
	}

	/**
	 * @Test4 about this method verifySubstoreSubModule()
	 * @param substoreExpectedData : Map<String, String> - A map containing expected
	 *                             substore data, such as URLs or other related
	 *                             information.
	 * @description : This method verifies that the substore module's sub-modules
	 *              (e.g., Inventory, Pharmacy) are visible and interactable.
	 * @return : boolean - true if the sub-modules are visible and clickable, false
	 *         otherwise.
	 * @throws : Exception - if there is an issue finding or interacting with the
	 *           sub-modules.
	 * @author : YAKSHA
	 */
	public boolean verifySubstoreSubModule(Map<String, String> substoreExpectedData) throws Exception {
		return false;
	}

	/**
	 * @Test5 about this method subModulePresent()
	 * 
	 * @param moduleName : String - The name of the module to verify.
	 * @description : This method verifies if the specified module's sub-modules are
	 *              present and visible.
	 * @return : boolean - true if the sub-modules are displayed, false otherwise.
	 * @throws : Exception - if there is an issue finding the sub-modules or if no
	 *           elements are found.
	 * @author : YAKSHA
	 */
	public boolean subModulePresent(String moduleName) throws Exception {
		return false;
	}

	/**
	 * @Test6 about this method verifyNavigationBetweenSubmodules()
	 * 
	 * @param : null
	 * @description : This method verifies that the user is able to navigate between
	 *              the sub modules.
	 * @return : boolean
	 * @author : YAKSHA
	 */
	public boolean verifyNavigationBetweenSubmodules() throws Exception {
		return false;
	}

	/**
	 * @Test7 about this method takingScreenshotOfTheCurrentPage()
	 * @param : null
	 * @description : Taking screenshot of the current page.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		return false;
	}

	/**
	 * @Test8 about this method
	 *        verifyIfInventoryReqInputFieldsDropdownsAndCheckboxesAreVisibleOrNot()
	 * 
	 * @param : null
	 * @description : This method verifies the visibility of various UI components
	 *              on the page, including buttons, input fields, dropdowns, and
	 *              checkboxes.
	 * @return : boolean - Returns true if all specified UI components are
	 *         displayed, otherwise false.
	 * @throws : Exception - if there is an issue finding any of the UI components.
	 * @author : YAKSHA
	 */
	public boolean verifyIfInventoryReqInputFieldsDropdownsAndCheckboxesAreVisibleOrNot() throws Exception {
		return false;
	}

}
