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

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Group Name_apGroupName'), 'AUTO-APG-1')

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/i_An AP Group with that name already exists_a10e3f'), 
    5)

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/textarea_Description_apDescription'), 'automation AP group 1')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Select venue'))

'Select My-venue'
WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/li_1st_dropdown_venue'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Next'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Ken-R550p_Left'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/button_add_remove'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Create'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/label_AP group AUTO-APG-1 was added'), 
    5)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_AUTO-APG-1'), 3)

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_AUTO-APG-1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p'), 3)

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Edit AP Group'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Group Members (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Ken-R550p'), 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Ken-R550p_right_1st'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Save'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Delete AP Group'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Delete AUTO-APG-1'), 0)

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Are you sure you want to delete this AP Group'), 
    0)

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Cancel'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_More details'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_automation AP group 1'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_My-Venue'), 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/a_AP Groups'))

