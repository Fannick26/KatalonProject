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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/p_Username  Admin'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Gebruikersnaam_username'), GlobalVariable.USERNAME)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/p_Password  admin123'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Wachtwoord_password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Inloggen'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Administrator'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Functie_oxd-icon bi-chevron-down'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Salarisschalen'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/body_root             --oxd-primary-one-col_ff9e58'), 
    0)

WebUI.closeBrowser()

