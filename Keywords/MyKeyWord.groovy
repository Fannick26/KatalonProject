import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeyWord {
	@Keyword(keywordObject = 'Hello')
	
	def Hello() {
		println("Hello World")
	}
	
	@Keyword(keywordObject = 'Hello')
	def login() {
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password') , '/5S6MFFLcE4mlsixtc6/Tg==')
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))
	}
	@Keyword(keywordObject = 'Hello')
	def HelloUser(String user) {
		println "Hello" +user
	}
	
}
