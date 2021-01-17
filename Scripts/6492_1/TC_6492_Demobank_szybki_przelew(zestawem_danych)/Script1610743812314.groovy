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
import java.lang.Integer as Integer
import com.kms.katalon.core.util.KeywordUtil


WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('Data Files/link').getValue(1, 1))

for (def records = 1; records < findTestData('Data Files/1-Demobank/users (1)').getRowNumbers(); ++records) {
    //oczekuj na zaladowanie pola loginu
    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/input_identyfikator_login_id'), 
        0)

    //pole loginu
    WebUI.setText(findTestObject('Object Repository/Demobank/logowanie/login'), findTestData('Data Files/1-Demobank/users (1)').getValue(
            1, records))

    //zweryfikuj czy przycisk jest klikalny
    if(WebUI.verifyElementClickable(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/button_dalej')))
	{
		//klik "dalej"
		WebUI.click(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/button_dalej'))
	}
	else
	{
		KeywordUtil.markFailed("TEST FAILED 1")
	}
    

    //oczekuj na zaladowanie pola hasla
    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/input_haso_haslo'), 
        0)

    //sleep
    Thread.sleep(300)

    //wpisz haslo
    WebUI.setText(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/input_haso_haslo'), 
        findTestData('Data Files/1-Demobank/users (1)').getValue(2, records))

    //oczekuj na obecnosc przicisku logowania
    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/button_zaloguj si'), 
        0)
	// weryfikacja czy przycisk klikalny
	if(WebUI.verifyElementClickable(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/button_zaloguj si')))
	{
		//kliknij "zaloguj sie"
		 WebUI.click(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Logowanie/button_zaloguj si'))
	}
	else
	{
		KeywordUtil.markFailed("TEST FAILED ")
	}
    
   

    //1s oczekiwania
    Thread.sleep(1000)

    //oczekiwanie na liste odbiorcow
    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/select_wybierz odbiorc przelewu            _029a71'), 
        0)

    //lista rozwijana pierwsza opcja (szybki przelew)
    WebUI.selectOptionByValue(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/select_wybierz odbiorc przelewu            _029a71'), 
        '1', true)

    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/input_kwota_widget_1_transfer_amount'), 
        0)

    //pole do wpisania kwoty
    int kwota = Integer.parseInt(findTestData('Data Files/1-Demobank/users (1)').getValue(3, records))

    //przeciwna liczba gdyby byla wproawdzona ujemna
    if (kwota < 0) {
        kwota *= -1
    } else {
        assert kwota > 0
    }
    
    WebUI.setText(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/input_kwota_widget_1_transfer_amount'), 
        Integer.toString(kwota))

    //oczekiwanie na zaladowany element
    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/input_tytuem_widget_1_transfer_title'), 
        0)

    //wpisanie tytulu przelewu
    WebUI.setText(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/input_tytuem_widget_1_transfer_title'), 
        findTestData('Data Files/1-Demobank/users (1)').getValue(4, records))

    //czekaj
    Thread.sleep(2000)

    //kliknij wyloguj
    //sprawdz czy da sie kliknac 
    WebUI.verifyElementClickable(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/button_wykonaj'))

    //przycisk "wykonaj"
    WebUI.click(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/button_wykonaj'))

    Thread.sleep(500)
	//wybor numertu tel
	WebUI.selectOptionByValue(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/select_wybierz telefon do doadowania       _5c7a19'),
		'500 xxx xxx', true)
	//wpis wartosci doladowania
	WebUI.setText(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/input_kwota_widget_1_topup_amount'),
		 findTestData('Data Files/1-Demobank/users (1)').getValue(5, records))
	Thread.sleep(2000)
    //oczekiwanie na zaladowanie przycisku wylogowania
    WebUI.waitForElementPresent(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/a_Wyloguj'), 
        0)
	//ozanczenie chceckboxu
	WebUI.click(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/span'))
	//doladowanie
	WebUI.click(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/button_doaduj telefon'))

    WebUI.click(findTestObject('Object Repository/Demobank/Page_Demobank - Bankowo Internetowa - Pulpit/a_Wyloguj'))
}

WebUI.closeBrowser()





