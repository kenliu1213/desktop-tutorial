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

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Add Venue'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Venue Name_venueName'), 'My-Venue-1')

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Description_description'), 'SDC Venue')

WebUI.setText(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_address_addVenueFormAddress'), '350 W Java Dr, Sunnyvale, CA 94089, USA')

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Ruckus NetworksWest Java Drive, Sunnyvale, CA, USA'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Create'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/em_Dashboard_menu-icon menu-venues'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Ken-Test-Venue'))

