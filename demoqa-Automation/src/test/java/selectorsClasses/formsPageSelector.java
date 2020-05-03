package selectorsClasses;

public enum formsPageSelector {
	//xPath
	firstName("//*[@id=\\\"content\\\"]/div[2]/div/form/fieldset/div[8]/input"),
	lastName("//*[@id=\\\"lastname\\\"]"),
	sex("//*[@id=\\\"sex-0\\\"]"),
	experience("//*[@id=\\\"exp-1\\\"]"),
	date("//*[@id=\\\"datepicker\\\"]"),
	profession("//*[@id=\\\"profession-1\\\"]"),
	tools("//*[@id=\\\"tool-2\\\"]"), 
	//id
	continent("continents");
		
	private String selector;
	
	formsPageSelector(String pageSelector) {
        this.selector = pageSelector;
    }
	
	 public String getSelector() {
	        return selector;
	    }
	 
}
