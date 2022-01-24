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

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/em_Dashboard_menu-icon menu-venues'))

WebUI.scrollToElement(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Dog Company 1692_icon-user user-widget'), 3)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Dog Company 1692_icon-user user-widget'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Log Out'))

WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Log in to RUCKUS Cloud/img_RUCKUS Cloud_logo-commscope'), 
    1)

WebUI.closeBrowser()

