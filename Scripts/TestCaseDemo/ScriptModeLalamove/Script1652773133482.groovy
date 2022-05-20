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

// buka browser
WebUI.openBrowser('')

// ke web lalamovenya
WebUI.navigateToUrl('https://www.lalamove.com/id/')

// buat masuknya
WebUI.click(findTestObject('Object Repository/RecordWebLalamove/Page_Lalamove Indonesia  Aplikasi Pengirima_24e3c4/div_Masuk'))

// ini masuk
WebUI.switchToWindowTitle('Lalamove - Masuk')

// masukin email
WebUI.setText(findTestObject('Object Repository/RecordWebLalamove/Page_Lalamove - Masuk/input_Nomor telepon atau email_username'),
	'rafiikastavina@gmail.com')

// masukin password
WebUI.setEncryptedText(findTestObject('Object Repository/RecordWebLalamove/Page_Lalamove - Masuk/input_Kata sandi_password'),
	'iGTmO3cRVW1aYvpBUdORwA==')

// ini udh berhasil masuk
WebUI.click(findTestObject('Object Repository/RecordWebLalamove/Page_Lalamove - Masuk/button_Masuk'))

// ini buat nutup browser
WebUI.closeBrowser()