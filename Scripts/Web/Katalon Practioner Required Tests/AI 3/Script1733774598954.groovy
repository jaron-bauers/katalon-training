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

// open up youtube website and search up "Luigui's haunted mansion 3" then click on the first video that pops up
// Open the browser and navigate to the YouTube website
WebUI.openBrowser('')

// Navigate to the YouTube website
WebUI.navigateToUrl('https://www.youtube.com/')

// Type "Luigui's haunted mansion 3" in the search bar and press Enter
WebUI.setText(findTestObject('Page_Youtube/input_Search or enter URL'), 'Luigui\'s haunted mansion 3')
WebUI.sendKeys(findTestObject('Page_Youtube/input_Search or enter URL'), Keys.chord(Keys.ENTER))

// Click on the first video that appears in the search results
WebUI.click(findTestObject('Page_Youtube/first_video_link'))