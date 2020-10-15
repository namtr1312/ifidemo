package Demo;

public class Homepage {

	public static void gotoLoginpage() {
		commonAct.visibilityElement(Instances.MyAccount);
		commonAct.clickElement(Instances.MyAccount);
		commonAct.visibilityElement(Instances.Login);
		commonAct.clickElement(Instances.Login);
		commonAct.sleep(500);
	}
	
	public static void closePopup01() {
		commonAct.visibilityElement(Instances.ClosePopup01);
		commonAct.sleep(500);
		commonAct.clickElement(Instances.ClosePopup01);
		commonAct.sleep(500);
	}
	
	public static void searchProduct() {
		commonAct.visibilityElement(Instances.SearchIcon);
		commonAct.clickElement(Instances.SearchIcon);
		commonAct.visibilityElement(Instances.SearchBar);
		commonAct.inputText(Instances.SearchBar, Instances.SearchInput);
		commonAct.clickElement(Instances.SearchSubmit);
		commonAct.sleep(500);
	}
	
	public static void closePopup02() {
		commonAct.visibilityElement(Instances.ClosePopup02);
		commonAct.sleep(500);
		commonAct.clickElement(Instances.ClosePopup02);
		commonAct.sleep(500);
	}
}