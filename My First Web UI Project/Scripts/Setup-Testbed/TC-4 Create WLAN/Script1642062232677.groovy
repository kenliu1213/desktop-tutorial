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

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Add Network'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Network Name_networkName'), 'Dogfood-ACX-WPA-1')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Network Type_p-radiobutton-box'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/textarea_Description_networkDescription'), 'automation wlan create')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Passphrase_passphrase'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Next'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_OFF'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/a_2.4 GHz  5 GHz'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_2.4 GHz  5 GHz'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/li_5 GHz'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_wlan_5Gonly_Save'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/wlan_wizardNextBtn'))

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/wlan_wizardSaveBtn'))

