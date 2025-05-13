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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_19'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Comment'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Yes yes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/body_CURA Healthcare                       _9d7cae'), 
    'CURA Healthcare\n \n \n Home\n \n \n History\n \n \n Profile\n \n \n Logout\n \n \n\n\n\n\n \n CURA Healthcare Service\n We Care About Your Health\n \n Make Appointment\n \n\n\n\n \n \n \n Appointment Confirmation\n Please be informed that your appointment has been booked as following:\n \n \n \n \n Facility\n \n \n Hongkong CURA Healthcare Center\n \n \n \n \n Apply for hospital readmission\n \n \n Yes\n \n \n \n \n Healthcare Program\n \n \n Medicare\n \n \n \n \n Visit Date\n \n \n 19/05/2025\n \n \n \n \n Comment\n \n \n Yes yes\n \n \n \n Go to Homepage\n \n \n \n\n\n\n\n \n \n \n CURA Healthcare Service\n \n Atlanta 550 Pharr Road NE Suite 525Atlanta, GA 30305\n \n (678) 813-1KMS\n info@katalon.com\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n Copyright © CURA Healthcare Service 2025\n \n \n \n \n\n\n\n\n\n\n\n\n\n\nid("summary")/div[@class="container"]/div[@class="row"]/div[@class="col-xs-12 text-center"]/h2[1]')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care _b17f12'))

