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

WebUI.openBrowser('')

WebUI.navigateToUrl(findTestData('link').getValue(1, 2))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Sklep internetowy demo/a_Zdrowa ywno(30)'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/div_Fruit  Fruits_cartadder product-add'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/span_Kupuj dalej'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/div_Fruit  Fruits_cartadder product-add'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/span_Kupuj dalej'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/div_Fruit  Fruits_cartadder product-add'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/span_Kupuj dalej'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/a_2'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/div_Fruit  Fruits_cartadder product-add'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_ywno zdrowa/a_Przejd do koszyka'))

WebUI.waitForPageLoad(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Sklep internetowy demo/span_zamknij'))
Thread.sleep(200)

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Koszyk/label_Patno przy odbiorze'))
Thread.sleep(200)

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Koszyk/button_Realizuj zamwienie'))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Mam konto_email'), findTestData('2-Sklepdemo/humans (1)').getValue(
        1, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Adres e-mail_billingPhone'), findTestData('2-Sklepdemo/humans (1)').getValue(
        2, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Numer NIP_billingFirstName'), findTestData('2-Sklepdemo/humans (1)').getValue(
        3, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Imi_billingLastName'), findTestData('2-Sklepdemo/humans (1)').getValue(
        4, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Nazwisko_billingAddress'), findTestData('2-Sklepdemo/humans (1)').getValue(
        5, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Ulica_billingAddress2'), findTestData('2-Sklepdemo/humans (1)').getValue(
        6, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Nr domu_billingAddress3'), findTestData('2-Sklepdemo/humans (1)').getValue(
        7, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Nr lokalu_billingCity'), findTestData('2-Sklepdemo/humans (1)').getValue(
        8, 1))

WebUI.setText(findTestObject('Object Repository/Demosklep/Page_Koszyk/input_Miejscowo_billingPostalCode'), findTestData(
        '2-Sklepdemo/humans (1)').getValue(9, 1))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Koszyk/label_Przykadowa klauzula akceptacji regulaminu'))

WebUI.click(findTestObject('Object Repository/Demosklep/Page_Koszyk/button_Zamawiam i pac'))
Thread.sleep(3000)
WebUI.click(findTestObject('Object Repository/Demosklep/Page_Koszyk/a_powrt do zakupw'))

