package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestReporter implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Passed->"+result.getMethod().getXmlTest().getName());
		EmailSender.sendEmail(result.getMethod().getXmlTest().getName(), "Pro let " + result.getMethod().getXmlTest().getName() +
																		 "byla nalezena ni��� cena ne�" + result.getMethod().getXmlTest().getParameter("priceLimit"));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed->"+result.getTestName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}