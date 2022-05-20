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

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/h2_Make Appointment'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/label_Facility'))

WebUI.selectOptionByValue(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/label_Healthcare Program'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/input_Medicare_programs'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/label_Visit Date (Required)'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/td_26'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/label_Comment'))

WebUI.setText(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    'Appointment Hongkong CURA')

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.click(findTestObject('Object Repository/RealTestCaseAppointmentCura2/Page_CURA Healthcare Service/a_Go to Homepage'))
