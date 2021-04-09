package com.valuemomentum.retail.testautomation.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners extends WebDriverHelper implements ITestListener {
	
	protected static ExtentReports reports;
	protected static ExtentTest test;
	protected static ExtentSparkReporter spark;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, result.getMethod().getMethodName()+" Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		//test screenshot code
		test.log(Status.FAIL, "Test Failed");
		WebDriverHelper.captureScreenshot(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath("C:\\pomScreenshots\\"+result.getMethod().getMethodName()+".png");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		reports = new ExtentReports();
		spark = new ExtentSparkReporter("target/"+
		new SimpleDateFormat("yyyy-MM-dd-hh-ss-mm").
		format(new Date())+"reprts.html");
		//test = reports.createTest(context)
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.attachReporter(spark);
		reports.flush();
		ITestListener.super.onFinish(context);
	}

}
