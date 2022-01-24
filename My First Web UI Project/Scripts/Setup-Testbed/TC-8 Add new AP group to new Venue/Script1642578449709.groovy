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

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/em_Venues_menu-icon menu-network-devices'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_AP Groups'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Add AP Group'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Group Name_apGroupName'), 'AUTO-APG-2')

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/i_An AP Group with that name already exists_a10e3f'), 
    5)

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/textarea_Description_apDescription'), 'automation AP group 2')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Select venue'))

'Select My-venue'
WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/li_2nd_dropdown_venue'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Next'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Ken-R550p_Left'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_add_remove'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Create'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_AUTO-APG-2_AP Groups'), 3)

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_AUTO-APG-2_AP Groups'), 3)

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_AUTO-APG-2 Venue value'), 1)

