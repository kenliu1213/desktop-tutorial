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

WebUI.navigateToUrl('https://qaalto.ruckuswireless.com/')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userusername'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userusername'), 
    'dog1692@email.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userpassword'), 
    '8SQVv/p9jVSxsnBUw2UtEw==')

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud Status_commit'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Add Venue'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Venue Name_venueName'), 'Ken-Test-Venue')

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Description_description'), 'SDC Venue')

WebUI.setText(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_address_addVenueFormAddress'), '350 W Java Dr, Sunnyvale, CA 94089, USA')

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Ruckus NetworksWest Java Drive, Sunnyvale, CA, USA'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Create'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Venues'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Ken-Test-Venue'))

//WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Add floor plan'))
//WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Floor Plan Name_addFloorFormName'), 'SDC Floor')
//WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Floor NumberThis field is requiredValue_c25714'))
//WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Floor Number_addFloorFormNumber'), '1')
//WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Upload'))
//WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Save'))
WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/a_Networking Devices'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_More'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_SN152102010713'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_8423882EEDE0'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_10.223.69.109'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_R550'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Indoor'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_6.2.0.99.250'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_OK'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Wireless Networks'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Add Network'))

WebUI.setText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/input_Network Name_networkName'), 'Ken-ACX-WPA')

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

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Next'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Create'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/div_Dog Company 1692_icon-user'))

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Log Out'))

WebUI.closeBrowser()

