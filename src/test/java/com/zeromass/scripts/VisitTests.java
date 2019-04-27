package com.zeromass.scripts;

import org.testng.annotations.Test;

import com.zeromass.drivers.MyDriverUtil;

import cpom.zeromass.pages.ComplaintPage;
import cpom.zeromass.pages.LandingPage;
import cpom.zeromass.pages.LoginPage;
import cpom.zeromass.pages.VisitPage;

public class VisitTests {
	
private VisitPage visitPage;
private LandingPage landingPage;
private LoginPage loginPage;
private ComplaintPage complaintPage;

public VisitTests()
{
	this.visitPage = new VisitPage(MyDriverUtil.getDriver());
	}

@Test(enabled = false) /*(priority = 1)*/
public void EnterNewVisit() throws InterruptedException {
		
	this.visitPage.doVisit(TestConfigs.properties.getProperty("visitSubject"), TestConfigs.properties.getProperty("BrCode"), TestConfigs.properties.getProperty("VstDescription"));
	}
} 
	
	

	

