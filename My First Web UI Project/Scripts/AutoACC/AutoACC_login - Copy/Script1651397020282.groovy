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

WebUI.openBrowser('')

for (def index : (0..0)) {
}

WebUI.navigateToUrl('http://10.108.250.25/')

WebUI.setText(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto Acclerator/input_Auto Accelerator_username1'), 
    'sdc@commscope.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto Acclerator/input_Auto Accelerator_password'), 
    'PjMiMXGLUVRm6pqLVuqryg==')

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto Acclerator/input_Auto Accelerator_btn btn-primary'))

WebUI.maximizeWindow()

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'), 0)

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/span_Succeeded'))

WebUI.scrollToElement(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/h2_Execution Groups'), 3)

WebUI.scrollToElement(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/td_AP_mgmt_Testing_2022Q1Beta'), 
    1)

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/input_AP_mgmt_R550_functionalites_lab.robot_632e6d'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/input_Execution Target_exe_target'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/input_Execution Type_exe_type'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/input_Live Execution_live-execution'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/AutoACC/Page_Auto  ACC/button_Execute'))

WebUI.waitForAlert(5)

WebUI.verifyAlertPresent(5)

'Trigger Execution Group'
alertText = WebUI.getAlertText(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(alertText, 'Trigger Execution Group, AP_mgmt_Testing_2022Q1Beta?', false)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject(null), 'Keys.chord(Keys.ENTER)')

