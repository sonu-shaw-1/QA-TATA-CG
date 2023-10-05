package Page_Factory_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Product_Page_Elements {
	//WebDriver driver;

	// KYP, Broucher, BI, Talk To an Expert Buttons
	
	//KYP
	@FindBy(how=How.ID,using="KnowYourPlan")
	private WebElement kypButton;
	public WebElement getKypButton()
	{
		return kypButton;
	}
	
	//Broucher Button
	@FindBy(how=How.XPATH,using="//*[@id=\"header-scroll\"]/div/div/div[2]/a[1]")
	private WebElement broucherButton;
	public WebElement getBroucherButton()
	{
		return broucherButton;
	}
	
	//BI Button
	@FindBy(how=How.ID,using="aDownloadBI")
	private WebElement biButton;
	public WebElement getBiButton()
	{
		return biButton;
	}
	
	
	//Plan Name Guaranteed Savings Solution
	@FindBy(how=How.XPATH,using="(//div[contains(text(),'Guaranteed Savings Solution')])[1]")
	private WebElement planName;	
	public WebElement getPlanName() {
		return planName;
	}

	//Investment Amount
	@FindBy(how=How.ID,using="BasicSumAssured")
	private WebElement investmentAmount;
	public WebElement getInvestmentAmount() {
		return investmentAmount;
	}

	//Mode of Premium
	@FindBy(how=How.XPATH,using="//select[@id='ModeOfPremium']")
	private WebElement modeOfPremium;	
	public WebElement getModeOfPremium() {
		return modeOfPremium;
	}

	//pay For
	@FindBy(how=How.XPATH,using="//select[@id='PremiumPayingTerm']")
	private WebElement payFor;	
	public WebElement getPayFor() {
		return payFor;
	}

	//Withdraw After
	@FindBy(how=How.XPATH,using="//select[@id='PolicyTerm']")
	private WebElement withdrawAfter;	
	public WebElement getWithdrawAfter() {
		return withdrawAfter;
	}

	//30 days easy refund Policy information
	@FindBy(how=How.XPATH,using="(//div[@class='colorFeatureText'])[1]")
	private WebElement easyRefundPolicyText;	
	public WebElement getEasyRefundPolicyText() {
		return easyRefundPolicyText;
	}

	// Life cover
	@FindBy(how=How.XPATH,using="(//div[@class='colorFeatureText'])[2]")
	private WebElement lifeCoverText;	
	public WebElement getLifeCoverText() {
		return lifeCoverText;
	}

	// Tax Saving Text
	@FindBy(how=How.XPATH,using="(//div[@class='colorFeatureText'])[3]")
	private WebElement taxSavingText;	
	public WebElement getTaxSavingText() {
		return taxSavingText;
	}

	// Your Details Sections

	//Your Details Label
	@FindBy(how=How.ID,using="formli6")
	private WebElement yourDetailLabel;
	public WebElement getYourDetailsLabel() {
		return yourDetailLabel;}

	//You are Investing for label	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'You are investing for')]")
	private WebElement youAreInvestingForText;	
	public WebElement getYouAreInvestingForText() {
		return youAreInvestingForText;
	}

	//You are Investing for icon
	@FindBy(how=How.XPATH,using="//*[@id=\"optionType\"]/div/div[1]/span")
	private WebElement youAreInvestingForInfoIcon;	
	public WebElement getYouAreInvestingForInfoIcon() {
		return youAreInvestingForInfoIcon;
	}

	//Yourself Button
	@FindBy(how=How.XPATH,using="//input[@id='Yourself']")
	private WebElement yourSelfButton;	
	public WebElement getYourSelfButton() {
		return yourSelfButton;
	}

	//Other Button
	@FindBy(how=How.XPATH,using="//input[@id='Spouse']")
	private WebElement otherButton;	
	public WebElement getOtherButton() {
		return otherButton;
	}

	//Gender Button MALE
	@FindBy(how=How.XPATH,using="//input[@id='Gender'][@value='Male']")
	private WebElement maleButton;	
	public WebElement getMaleButton() {
		return maleButton;
	}

	//Gender Button FEMALE
	@FindBy(how=How.XPATH,using="//input[@id='Gender'][@value='Female']")
	private WebElement femaleButton;	
	public WebElement getFemaleButton() {
		return femaleButton;
	}



	//Full Name
	@FindBy(how=How.XPATH,using="//input[@id='FirstName']")
	private WebElement fullNameText;	
	public WebElement getFullNameText() {
		return fullNameText;
	}

	//Email
	@FindBy(how=How.XPATH,using="//input[@id='Email']")
	private WebElement email;	
	public WebElement getEmail() {
		return email;
	}

	//DOB
	@FindBy(how=How.XPATH,using="//input[@id='DOB']")
	private WebElement dob;	
	public WebElement getDob() {
		return dob;
	}

	//Annual Income
	@FindBy(how=How.XPATH,using="//input[@id='AnnualIncome']")
	private WebElement annualIncome;	
	public WebElement getAnnualIncome() {
		return annualIncome;
	}
	//Mobile Number
	@FindBy(how=How.XPATH,using="//input[@id='Mobile']")
	private WebElement mobNumber;	
	public WebElement getMobNumber() {
		return mobNumber;
	}


	//Maturity Ribbon

	//Total Maturity Amount
	@FindBy(how=How.XPATH,using="(//span[@class='spnTotalFundValue'])[1]")
	private WebElement totalMaturityAmount;	
	public WebElement getTotalMaturityAmount() {
		return totalMaturityAmount;
	}

	//Total Returns Percentage
	@FindBy(how=How.XPATH,using="//*[@id=\"productForm\"]/section[2]/div[1]/div/div[1]/div[2]/div[7]/div/div/div/div[1]/div[1]/div[2]/div[2]/span[1]")
	private WebElement totalreturnPercentage;	
	public WebElement getTotalreturnPercentage() {
		return totalreturnPercentage;
	}

	//Total Returns Years
	@FindBy(how=How.XPATH,using="//*[@id=\"productForm\"]/section[2]/div[1]/div/div[1]/div[2]/div[7]/div/div/div/div[1]/div[1]/div[2]/div[2]/span[2]/span")
	private WebElement totalreturnYears;	
	public WebElement getTotalreturnYears() {
		return totalreturnYears;
	}

	//More Info
	@FindBy(how=How.ID,using="moreInfo")
	private WebElement moreInfoButton;	
	public WebElement getmoreInfoButton() {
		return moreInfoButton;
	}


	//Proceed Button on Details page
	@FindBy(how=How.XPATH,using="(//button[contains(text(),'Proceed')])[1]")
	private WebElement proceedButton;	
	public WebElement getProceedButton() {
		return proceedButton;
	}

	/* Benefits under this plan */

	//Capital Gauranteed Card 	
	@FindBy(how=How.XPATH,using="(//div[@class='productInnerContent'])[3]")
	private WebElement cgContentCard;	
	public WebElement getCgContentCard() {
		return cgContentCard;
	}

	//Market Upside Card
	@FindBy(how=How.XPATH,using="(//div[@class='productInnerContent'])[4]")
	private WebElement marketUpsideCardContent;	
	public WebElement getMarketUpsideCardContent() {
		return marketUpsideCardContent;
	}

	//In Built Life cover Card
	@FindBy(how=How.XPATH,using="(//div[@class='productInnerContent'])[5]")
	private WebElement inBuiltLifeCoverCardContent;	
	public WebElement getInBuiltLifeCoverCardContent() {
		return inBuiltLifeCoverCardContent;
	}

	//Tax Benefit Card
	@FindBy(how=How.XPATH,using="(//div[@class='productInnerContent'])[7]")
	private WebElement taxBenefitCardContent;	
	public WebElement getTaxBenefitCardContent() {
		return taxBenefitCardContent;
	}

	/* Investment Criteria */

	//Minimum year to investment

	@FindBy(how=How.XPATH,using="//*[@id=\"productForm\"]/section[2]/div[1]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span[2]")
	private WebElement minInvestingYear;	
	public WebElement getMinInvestingYear() {
		return minInvestingYear;
	}

	//Maximum Year to Investment

	@FindBy(how=How.XPATH,using="/html/body/form/section[2]/div[1]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div/div[2]/span[2]")
	private WebElement maxInvestingYear;	
	public WebElement getMaxInvestingYear() {
		return maxInvestingYear;
	}

	//Minimum amount to Investment Monthly

	@FindBy(how=How.XPATH,using="(//span[@class='bottomMonthlyPremium'])[1]")
	private WebElement minMonthlyInvestmentAmount;	
	public WebElement getMinMonthlyInvestmentAmount() {
		return minMonthlyInvestmentAmount;
	}

	//Minimum amount to Investment Quarterly

	@FindBy(how=How.XPATH,using="(//span[@class='bottomQuarterlyPremium'])[1]")
	private WebElement minQuarterlyInvestmentAmount;	
	public WebElement getMinQuarterlyInvestmentAmount() {
		return minQuarterlyInvestmentAmount;
	}

	//Minimum amount to Investment Half Yearly

	@FindBy(how=How.XPATH,using="(//span[@class='bottomHalfYearlyPremium'])[1]")
	private WebElement minHalfYearlyInvestmentAmount;
	public WebElement getMinHalfYearlyInvestmentAmount()
	{
		return minHalfYearlyInvestmentAmount;
	}

	//Minimum amount to Investment Yearly

	@FindBy(how=How.XPATH,using="(//span[@class='bottomAnnualPremium'])[1]")
	private WebElement minYearlyInvestmentAmount;
	public WebElement getMinYearlyInvestmentAmount()
	{
		return minYearlyInvestmentAmount;
	}

	//Minimum Maturity Year

	@FindBy(how=How.XPATH,using="//div[@class='productInnerContent']/div/div[1]/div[1]/span[2]")
	private WebElement minMaturityAgeMonthly;
	public WebElement getMinMaturityAgeMonthly()
	{
		return minMaturityAgeMonthly;
	}

	//Maximum Maturity Year

	@FindBy(how=How.XPATH,using="//div[@class='productInnerContent']/div/div[2]/div[1]/span[2]")
	private WebElement maxMaturityAgeMonthly;
	public WebElement getMaxMaturityAgeMonthly()
	{
		return maxMaturityAgeMonthly;
	}

	//Pincode page
	
	@FindBy(how=How.ID,using="Pincode")
	private WebElement pinCode;
	public WebElement getPinCode()
	{
		return pinCode;
	}
	
	//City
	
	@FindBy(how=How.ID,using="City")
	private WebElement City;
	public WebElement getCity()
	{
		return City;
	}
	
	// Nationality
	
	@FindBy(how=How.ID,using="ResidentStatus")
	private WebElement ResidentStatus;
	public WebElement getResidentStatus()
	{
		return ResidentStatus;
	}

	// Review Details Button
	
	@FindBy(how=How.XPATH,using="(//button[contains(text(),'Review Details')])[1]")
	private WebElement reviewDetailsButton;
	public WebElement getReviewDetailsButton()
	{
		return reviewDetailsButton;
	}
	
	//Checkout Button On Checkout page
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Checkout')]")
	private WebElement checkoutButton;
	public WebElement getCheckoutButton()
	{
		return checkoutButton;
	}
	
}
