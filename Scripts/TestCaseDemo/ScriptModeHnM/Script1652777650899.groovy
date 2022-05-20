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

// buka browsernya
WebUI.openBrowser('')

// ke linknya
WebUI.navigateToUrl('https://id.hm.com/id_id')

// login
WebUI.click(findTestObject('Object Repository/RecordModeHnM/Page_Shop Online Fashion In Indonesia  HM I_5bad58/li_Masuk AkunBergabung'))

// input email
WebUI.setText(findTestObject('Object Repository/RecordModeHnM/Page_Shop Online Fashion In Indonesia  HM I_5bad58/input_Email_loginusername'),
	'rafiikastavina@gmail.com')

// input password
WebUI.setEncryptedText(findTestObject('Object Repository/RecordModeHnM/Page_Shop Online Fashion In Indonesia  HM I_5bad58/input_Kata Sandi_loginpassword'),
	'iGTmO3cRVW1aYvpBUdORwA==')
// button masuk
WebUI.click(findTestObject('Object Repository/RecordModeHnM/Page_Shop Online Fashion In Indonesia  HM I_5bad58/button_Masuk'))

// button log out
WebUI.click(findTestObject('Object Repository/RecordModeHnM/Page_Shop Online Fashion In Indonesia  HM I_5bad58/a_Keluar'))

// ini buat nutup browser
WebUI.closeBrowser()
