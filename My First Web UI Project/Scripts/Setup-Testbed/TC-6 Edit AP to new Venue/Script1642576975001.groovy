import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/em_Venues_menu-icon menu-network-devices'))

WebUI.mouseOverOffset(findTestObject('ACX-Beta/Page_Ruckus Cloud/em_Venues_menu-icon menu-network-devices'), 10, 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_APs (1)'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p_in_APs'), 5)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p_Txt'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Edit AP'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/Dropmenu_My-Venue_in_AP'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/li_2nd-Venue'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_Save_AP'), 3)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_Save_AP'))

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/label_AP Ken-R550p was updated'), 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/em_Venues_menu-icon menu-network-devices'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/Tab_WiFi (1)_Networks'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_APs (1)'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p_Txt'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_My-Venue-1_in_AP'), 3)

