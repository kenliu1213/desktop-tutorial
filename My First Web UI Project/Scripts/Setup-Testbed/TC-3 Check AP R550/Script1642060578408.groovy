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

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Networking Devices'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_APs (1)'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p_in_APs'), 3)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p_Txt'))

WebUI.click(findTestObject('Object Repository/Page_Ruckus Cloud/span_More'))

WebUI.verifyElementText(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_152102010713'), '152102010713')

WebUI.verifyElementText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_8423882EEDE0'), '84:23:88:2E:ED:E0')

WebUI.verifyElementText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_10.223.69.109'), '10.223.69.109')

WebUI.verifyElementText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_R550'), 'R550')

WebUI.verifyElementText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Indoor'), 'Indoor')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_6.2.0.99.258'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/button_OK'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Networking Devices'))

