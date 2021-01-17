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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

WebUI.openBrowser('')
//2gi url
WebUI.navigateToUrl( findTestData('Data Files/link').getValue(1,2))

WebUI.waitForPageLoad(2)
//zamknij klauzule
WebUI.click(findTestObject('Object Repository/Demosklep/Page_Sklep internetowy demo/span_zamknij'))

for(def n = 1; n < findTestData('Data Files/2-Sklepdemo/sklep').getRowNumbers(); ++n)
{
	
//kliknij napis "KONTO"
WebUI.click(findTestObject('Object Repository/Demosklep/Page_Sklep internetowy demo/span_TWOJE'))
WebUI.waitForPageLoad(2)
//kliknij zaloz konto
WebUI.click(findTestObject('Object Repository/Demosklep/Page_Logowanie/a_Za konto'))

//pole na mail
WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Rejestracja/input_Rejestracja_email'), 
	findTestData('Data Files/2-Sklepdemo/sklep').getValue(1,n))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Rejestracja/input_Adres e-mail_gsfPass1'),
	findTestData('Data Files/1-Demobank/users (1)').getValue(2, n))


WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Rejestracja/input_Haso_gsfPass2'),
	findTestData('Data Files/1-Demobank/users (1)').getValue(2, n))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Rejestracja/label_Przykadowa klauzula akceptacji regulaminu'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Rejestracja/button_Rejestruj'))
	
//verifyElement będzie szukalo obiektu ale bedzie kontunuowac po nieudanej probie	
	if(WebUI.verifyElementVisible(findTestObject('Object Repository/Demosklep/Page_Rejestracja/div_Podany email nie moe zosta zarejestrowany'), FailureHandling.OPTIONAL))
	{
	Thread.sleep(200)
	WebUI.click(findTestObject('Object Repository/Demosklep/Page_Rejestracja/a_Strona gwna'))
	}
	else
	{
		Thread.sleep(200)
		WebUI.waitForPageLoad(2)
		WebUI.click(findTestObject('Object Repository/Demosklep/Page_/a_Strona gwna'))
		

	}
}
WebUI.closeBrowser()
		
	

	
	
	
		
	
	


