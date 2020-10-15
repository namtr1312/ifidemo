package Demo;

public class Loginpage{
	
	public static void performLogin() {
		commonAct.visibilityElement(Instances.Emailfield);
		commonAct.inputText(Instances.Emailfield, Instances.Emailinput);
		commonAct.visibilityElement(Instances.Passwordfield);
		commonAct.inputText(Instances.Passwordfield, Instances.Passwordinput);
		commonAct.clickElement(Instances.LoginButton);
		commonAct.sleep(500);
		commonAct.visibilityElement(Instances.SkipButton);
		commonAct.clickElement(Instances.SkipButton);
		commonAct.visibilityElement(Instances.SearchIcon);
	}
}
