import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

import LoginKeywords
import HomePageKeywords
import ManualLoginKeywords

class Listener {
	@BeforeTestCase
    def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		String url
		
		if (testCaseContext.getTestCaseId().contains('Home Page')) {
			url = "https://katalon-demo-cura.herokuapp.com/"
			HomePageKeywords.goToHomePage(url)
		} else if (testCaseContext.getTestCaseId().contains('Katalon Practioner Required Tests')) {
			url = "https://katalon-demo-cura.herokuapp.com/profile.php#login"
			ManualLoginKeywords.goToLoginPage(url)
		} else {
			url = "https://katalon-demo-cura.herokuapp.com/profile.php#login"
	        String username = GlobalVariable.username
	        String password = GlobalVariable.password
			
	        LoginKeywords.loginToApplication(url, username, password)
		}
    }
	
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		WebUI.closeBrowser()
	}
}