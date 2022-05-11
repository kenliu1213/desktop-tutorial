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

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Add AP'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Select venue'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/li_1st_dropdown_venue'), 3)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/li_1st_dropdown_venue'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_AP Name_apName'), 'Ken-R550p')

WebUI.sendKeys(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_Serial Number_apSerialNumber'), '152102010713')

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_Save_AP'), 3)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_Save_AP'))

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p_in_APs'), 0)

