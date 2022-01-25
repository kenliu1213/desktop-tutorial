import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.util.KeywordUtil as Log

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = false) // Please change skipped to be false to activate this method.
def setUp() {
	// Put your code here.
	WebUI.openBrowser('https://qaalto.ruckuswireless.com/')
	
	WebUI.navigateToUrl('https://qaalto.ruckuswireless.com/')
	
	'dog1692@email.com'
	WebUI.setText(findTestObject('ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userusername'), GlobalVariable.username)
	
	'password-1'
	WebUI.setEncryptedText(findTestObject('ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud_userpassword'), '8SQVv/p9jVSxsnBUw2UtEw==')
	
	WebUI.click(findTestObject('ACX-Beta/Page_Log in to RUCKUS Cloud/input_RUCKUS Cloud Status_commit'))
	
	Log.logInfo("Check Window size and Error")
	
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
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = false) // Please change skipped to be false to activate this method.
def tearDown() {
	// Put your code here.
	
	WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/em_Dashboard_menu-icon menu-venues'))
	
	WebUI.scrollToElement(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Dog Company 1692_icon-user user-widget'), 3)
	
	WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/div_Dog Company 1692_icon-user user-widget'))
	
	WebUI.click(findTestObject('ACX-Beta/Page_Ruckus Cloud/span_Log Out'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/ACX-Beta/Page_Log in to RUCKUS Cloud/img_RUCKUS Cloud_logo-commscope'),
		1)
	
	WebUI.closeBrowser()
	
}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) // Please change skipped to be false to activate this method.
def setupTestCase() {
	// Put your code here.
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = true) // Please change skipped to be false to activate this method.
def tearDownTestCase() {
	// Put your code here.
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */