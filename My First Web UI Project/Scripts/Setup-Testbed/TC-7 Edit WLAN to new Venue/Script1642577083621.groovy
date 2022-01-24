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

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Wireless Networks'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Dogfood-ACX-WPA-1'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Edit Network'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Venues_edit_wlan'))

'Switch Button to ON for new Venue: My-Venue-1'
WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_WLAN_OFF_My-Venue-1'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_Save_Edit_Wlan'), 3)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_Save_Edit_Wlan'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/label_Network Dogfood-ACX-WPA-1 was updated'), 5)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Venues_Tab_in_Dogfood_wlan'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/h4_Activated on 2 venues'), 5)

'Verify WLAN on My-Venue-1 is ON for Active'
WebUI.verifyElementText(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_ON_WLAN Dogfood_My-venue-1'), 'ON', FailureHandling.STOP_ON_FAILURE)

