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

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Networking Devices'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p'), 5)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Ken-R550p'))

WebUI.waitForElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/R550_pic_showing'), 0)

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_R550'), 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/R550_pic_showing'))

WebUI.waitForElementVisible(findTestObject('ACX-Beta/Page_Ruckus Cloud/img__r550_pop_up'), 5)

WebUI.verifyElementPresent(findTestObject('ACX-Beta/Page_Ruckus Cloud/img__r550_pop_up'), 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/close_pop_up_ap_pic'))

WebUI.scrollToElement(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Lan_port_Edit'), 0)

WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Lan_port_Edit'))

WebUI.check(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/label_Port type'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/label_VLAN untag ID'))

WebUI.check(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/label_VLAN members'))

WebUI.verifyElementText(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/p-dropdown_TRUNK'), 'TRUNK')

//WebUI.verifyElementText(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_VLAN untag ID_vlanUntagIDControl'), '1')
WebUI.check(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_VLAN untag ID_vlanUntagIDControl'))

WebUI.check(findTestObject('ACX-Beta/Page_Ruckus Cloud/input_VLAN members_vlanMembers'))

WebUI.check(findTestObject('ACX-Beta/Page_Ruckus Cloud/r550_port_img'))

WebUI.verifyTextPresent('1', false)

not_run: WebUI.verifyTextPresent('1-4094', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ACX-Beta/Page_Ruckus Cloud/span_Cancel'))

