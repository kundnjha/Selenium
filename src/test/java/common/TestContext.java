package common;

import managers.PageObjectManager;
import managers.WebDriverManagers;
import utilities.ConfigFileReader;

public class TestContext {
	private WebDriverManagers webDriverManager;
	private PageObjectManager pageObjectManager;
	private ScenarioContext scenarioContext;
	
	public TestContext(){
		webDriverManager = new WebDriverManagers();
		System.out.println("object");
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebDriverManagers getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return  pageObjectManager;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
	
	public ConfigFileReader getConfigFile() {
		return new ConfigFileReader();
	}

}
