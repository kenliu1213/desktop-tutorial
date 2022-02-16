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
import com.kms.katalon.core.util.KeywordUtil as Log

WebUI.openBrowser('https://qaalto.ruckuswireless.com/')

WebUI.navigateToUrl('https://qaalto.ruckuswireless.com/')

'dog@email.com'
WebUI.setText(findTestObject('ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userusername'), username)

'password-1'
WebUI.setEncryptedText(findTestObject('ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userpassword'), '8SQVv/p9jVSxsnBUw2UtEw==')

WebUI.click(findTestObject('ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud Status_commit'))

Log.logInfo('Check Window size and Error')

try {
    WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_500/span_Technical error'), 3)

    //WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_500/span_Error'), 3)
    Log.logInfo('Redirect due to login Error...')

    WebUI.navigateToUrl('https://qaalto.ruckuswireless.com/')
}
catch (Exception exp) {
    Log.logInfo('No Login Error...')
} 

try {
    WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Hey, you are missing the bigger picture'), 
        3)

    WebUI.maximizeWindow()
}
catch (Exception exp) {
    Log.logInfo('No need to Maximum Window Size...')
} 

