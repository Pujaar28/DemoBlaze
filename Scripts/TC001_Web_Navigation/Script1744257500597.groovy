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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.baseURL)

WebUI.click(findTestObject('Dasboard/home_Nav'))

String currentUrl_One = WebUI.getUrl()

if (currentUrl_One == (GlobalVariable.baseURL + 'index.html')) {
    println('URL is correct: ' + currentUrl_One)
} else {
    println('URL is incorrect: ' + currentUrl_One)
}

WebUI.click(findTestObject('Dasboard/contact_Menu'))

WebUI.verifyElementPresent(findTestObject('Contact/message_Form'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/label_New_Message'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/input_Recipient_Email'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/input_Recipient_Name'), 0)

WebUI.verifyElementPresent(findTestObject('Contact/input_Message'), 0)

WebUI.click(findTestObject('Dasboard/contact_Close'))

WebUI.click(findTestObject('Dasboard/aboutUs'))

WebUI.verifyElementPresent(findTestObject('About Us/label_About_Us'), 0)

WebUI.verifyElementPresent(findTestObject('About Us/about_US_Video'), 0)

WebUI.click(findTestObject('Dasboard/aboutUs_Close'))

WebUI.click(findTestObject('Dasboard/cart_Menu'))

String currentUrl_Two = WebUI.getUrl()

if (currentUrl_Two == (GlobalVariable.baseURL + 'cart.html')) {
    println('URL is correct: ' + currentUrl_Two)
} else {
    println('URL is correct: ' + currentUrl_Two)
}

WebUI.click(findTestObject('Dasboard/home_Nav'))

WebUI.click(findTestObject('Dasboard/logIn'))

WebUI.click(findTestObject('Dasboard/login_close'))

WebUI.click(findTestObject('Dasboard/signUp'))

WebUI.click(findTestObject('Dasboard/signUp_Close'))

WebUI.closeBrowser()

