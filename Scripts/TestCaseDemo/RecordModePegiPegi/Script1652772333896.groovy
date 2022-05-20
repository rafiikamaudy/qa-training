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

WebUI.navigateToUrl('https://www.pegipegi.com/')

WebUI.click(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi  Booking Hotel, Tiket Pesawat_bdaaea/a_Login'))

WebUI.click(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi - Login/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi - Login/input_Email_email'), 'rafiikastavina@gmail.com')

WebUI.click(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi - Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi - Login/input_Password_password'), 
    'iGTmO3cRVW1aYvpBUdORwA==')

WebUI.click(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi - Login/button_Lupa password            Masuk'))

WebUI.click(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi  Booking Hotel, Tiket Pesawat_bdaaea/i_Hi, Rafiika_fa fa-caret-down'))

WebUI.click(findTestObject('Object Repository/RecordWebPegiPegi/Page_Pegipegi  Booking Hotel, Tiket Pesawat_bdaaea/a_Log out'))

WebUI.closeBrowser()

