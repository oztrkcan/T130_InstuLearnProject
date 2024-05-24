package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoursesPage extends BasePage{
    public CoursesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[@class='sidenav-item ']")
    List<WebElement> sideBarTitles;

    public void displayAndClickTitle(String title) {
        for (WebElement titles : sideBarTitles) {
            if (titles.getText().contains(title)) {
                click(titles);
                wait(2);
            }
        }
    }

    @FindBy(xpath = "//*[@id='webinarCollapse']//a")
    List<WebElement> sideBarSmallTitles;

    public void displayAndClickSmallTitle(String smallTitle) {
        try {
            for (WebElement smallTitles : sideBarSmallTitles) {
                if (smallTitles.getText().contains(smallTitle)) {
                    click(smallTitles);
                }
            }
        } catch (Exception exception) {
        }

    }

    //////////// The subtitle of the COURSES link is NEW //////////////////
    @FindBy(name = "type")
    WebElement courseTypeDropDown;

    public void chooseToCourseType(String courseType) {
        selectByVisibleText(courseTypeDropDown, courseType);
    }

    @FindBy(name = "seo_description")
    WebElement seodescriptionTextBox;

    public void writeToDescription(String text) {
        Assert.assertTrue(seodescriptionTextBox.isDisplayed());
        sendKeys(seodescriptionTextBox, text);
    }

    @FindBy(name = "title")
    WebElement titleTextBox;

    public void writeToTitle(String text) {
        Assert.assertTrue(titleTextBox.isDisplayed());
        sendKeys(titleTextBox, text);
    }

    @FindBy(id = "thumbnail")
    WebElement thumbnailTextBox;

    public void dowloadImageToThumbnail(String photo) {
        sendKeys(thumbnailTextBox, photo);
    }

    @FindBy(id = "cover_image")
    WebElement coverImageTextBox;
    ;

    public void dowloaImageToCover(String photo) {
        sendKeys(coverImageTextBox, photo);
    }

    @FindBy(name = "teacher_id")
    WebElement selectInstructorDropDown;
    @FindBy(xpath = "//select[@class='js-video-demo-source form-control']")
    WebElement demoVideoBox;
    @FindBy(id = "demo_video")
    WebElement pathBox;

    public void verifiesElementInNewPage() {
        Assert.assertTrue(selectInstructorDropDown.isDisplayed());
        Assert.assertTrue(demoVideoBox.isDisplayed());
        Assert.assertTrue(pathBox.isDisplayed());
        Assert.assertTrue(descriptionTextBox.isDisplayed());
    }

    @FindBy(xpath = "//div[@contenteditable='true']")
    WebElement descriptionTextBox;

    public void enterTextToDescription(String text) {
        sendKeys(descriptionTextBox, text);
        wait(5);
    }

    @FindBy(xpath = "//button[text()='Publish']")
    WebElement publishButton;
    @FindBy(xpath = "//button[text()='Save as Draft']")
    WebElement saveAsDraftButton;
    @FindBy(xpath = "//button[text()='Next']")
    WebElement nextButton;
    @FindBy(xpath = "//*[text()='Previous']")
    WebElement previousButton;

    public void verifiesButtonsInNewPage() {
        Assert.assertTrue(publishButton.isDisplayed() && publishButton.isEnabled());
        Assert.assertTrue(saveAsDraftButton.isDisplayed() && saveAsDraftButton.isEnabled());
        Assert.assertTrue(nextButton.isDisplayed() && nextButton.isEnabled());
        Assert.assertTrue(previousButton.isDisplayed());
    }

    public void scrollToPreviousButton() {
        scrollToElementWithAction(previousButton);
    }

    public void clicksButtonsInNewPage(String clickButton) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + clickButton + "']"));
        click(button);
    }

    @FindBy(name = "capacity")
    WebElement capacityBox;

    public void enterCapacityBox(String numberOfStudents) {
        sendKeys(capacityBox, numberOfStudents);
    }


    @FindBy(name = "duration")
    WebElement duration;

    public void enterDuration(String minute) {
        sendKeys(duration, minute);
    }

    @FindBy(xpath = "//label[text()='Support']")
    WebElement supportButton;
    @FindBy(xpath = "//label[text()='Completion Certificate']")
    WebElement completionButton;
    @FindBy(xpath = "//label[text()='Downloadable']")
    WebElement downloadableButton;
    @FindBy(xpath = "//label[text()='Partner Instructor']")
    WebElement partnerInstructorButtton;

    public void verifiesFloatingButtonInExtraInformation() {
        Assert.assertTrue(supportButton.isDisplayed() && supportButton.isEnabled());
        Assert.assertTrue(completionButton.isDisplayed() && completionButton.isEnabled());
        Assert.assertTrue(downloadableButton.isDisplayed() && downloadableButton.isEnabled());
        Assert.assertTrue(partnerInstructorButtton.isDisplayed() && partnerInstructorButtton.isEnabled());
    }

    @FindBy(xpath = "//label[text()='Tags']/following::input")
    WebElement tagTextBox;

    public void entersTagText(String tag) {
        sendKeys(tagTextBox, tag);
    }

    @FindBy(id = "categories")
    WebElement categoryDropDown;

    public void selectCategory(String category) {
        selectByVisibleText(categoryDropDown, category);
    }

    @FindBy(xpath = "//label[text()='Enable Subscribe']")
    WebElement enableSubcribeFloatingButton;
    @FindBy(id = "webinarAddTicket")
    WebElement newPlanButton;

    public void verifiesButtonInPricingPage() {
        Assert.assertTrue(enableSubcribeFloatingButton.isDisplayed() && enableSubcribeFloatingButton.isEnabled());
        Assert.assertTrue(newPlanButton.isDisplayed() && newPlanButton.isEnabled());
    }

    @FindBy(name = "access_days")
    WebElement accessPreiodBox;
    @FindBy(name = "price")
    WebElement priceBox;
    @FindBy(name = "organization_price")
    WebElement organizationPriceBox;

    public void entersPricingInformation(String accessTime, String normalPrice, String organizationPrice) {
        sendKeys(accessPreiodBox, accessTime);
        sendKeys(priceBox, normalPrice);
        sendKeys(organizationPriceBox, organizationPrice);
    }

    @FindBy(xpath = "//button[text()='New Section']")
    WebElement newSectionButton;
    @FindBy(xpath = "(//button[contains(@class,'save-chapter btn')])[2]")
    WebElement saveButtonInNewSection;
    @FindBy(xpath = "(//button[contains(@class,'close-swl btn')])[3]")
    WebElement closeButtonInNewSection;
    @FindBy(xpath = "(//input[@class='form-control js-ajax-title'])[2]")
    WebElement textBoxInNewSection;
    @FindBy(xpath = "//h3[text()='Item added successfully.']")
    WebElement alertInNewSection;
    @FindBy(linkText = "Previous")
    WebElement previousButtonInContentPage;

    public void verifiesContentPage(String sectionTitle) {
        Assert.assertTrue(newSectionButton.isDisplayed() && newSectionButton.isEnabled());
        clickWithJs1(newSectionButton);
        //Assert.assertTrue(saveButtonInNewSection.isDisplayed() && saveButtonInNewSection.isEnabled());
        Assert.assertTrue(closeButtonInNewSection.isDisplayed() && closeButtonInNewSection.isEnabled());
        //Assert.assertTrue(textBoxInNewSection.isDisplayed());
        sendKeys(textBoxInNewSection, sectionTitle);
        click(saveButtonInNewSection);
        wait(7);
        scrollToElementWithAction(previousButtonInContentPage);
    }

    @FindBy(id = "webinarAddPrerequisites")
    WebElement newPrerequisiteButton;
    @FindBy(id = "select2-ajaxnewprerequisite_id-pz-container")
    WebElement selectPrerequisiteDropDown;
    @FindBy(xpath = "//label[text()='Required']")
    WebElement requiredFloatingButton;
    @FindBy(xpath = "//button[contains(@class,'js-save-prerequisite btn')]")
    WebElement saveButtonInPrerequisitePage;
    @FindBy(xpath = "//button[text()='Close']")
    WebElement closeButtonInPrerequisitePage;

    public void verifiesPrerequisitePage() {
        Assert.assertTrue(newPrerequisiteButton.isDisplayed() && newPrerequisiteButton.isEnabled());
        wait(5);
        click(newPrerequisiteButton);
        //wait(5);
        Assert.assertTrue(requiredFloatingButton.isDisplayed());
        Assert.assertTrue(saveButtonInPrerequisitePage.isDisplayed() && saveButtonInPrerequisitePage.isEnabled());
        Assert.assertTrue(closeButtonInPrerequisitePage.isDisplayed() && closeButtonInPrerequisitePage.isEnabled());
        wait(5);
        clickWithJs1(closeButtonInPrerequisitePage);
    }

    @FindBy(id = "webinarAddFAQ")
    WebElement newFQAButton;
    @FindBy(id = "add_new_learning_materials")
    WebElement newLearningButton;
    @FindBy(id = "add_new_company_logos")
    WebElement newCompanyButton;
    @FindBy(id = "add_new_requirements")
    WebElement newRequirementButton;

    public void verifiesFQAPage() {
        Assert.assertTrue(newFQAButton.isDisplayed() && newFQAButton.isEnabled());
        Assert.assertTrue(newLearningButton.isDisplayed() && newLearningButton.isEnabled());
        wait(3);
        scrollToElementWithAction(newCompanyButton);
        wait(3);
        Assert.assertTrue(newCompanyButton.isDisplayed() && newCompanyButton.isEnabled());
        scrollWithJs(previousButton);
        wait(3);
        Assert.assertTrue(newRequirementButton.isDisplayed() && newRequirementButton.isEnabled());
    }

    @FindBy(id = "webinarAddQuiz")
    WebElement newQuizButton;

    public void verifiesQuizPage() {
        Assert.assertTrue(newQuizButton.isDisplayed() && newQuizButton.isEnabled());
    }


    //////////// The subtitle of the COURSES link is MY COURSES //////////////////
    @FindBy(xpath = "(//div[@class='webinar-card webinar-list d-flex'])")
    List<WebElement> courses;

    public void verifiesMyCoursesPage() {
        for (WebElement course : courses) {
            System.out.println(course.getText());
            Assert.assertTrue(course.isDisplayed());
        }
    }

    //////////// The subtitle of the COURSES link is INVITED COURSES //////////////////
    @FindBy(xpath = "(//div[@class='webinar-card webinar-list d-flex'])[1]")
    WebElement oneCourse;

    public void verifiesInvitedCoursesPage() {
        Assert.assertTrue(oneCourse.isDisplayed());
    }

    //////////// The subtitle of the COURSES link is MY PURCHASES //////////////////
    public void verifiesMyPurchasesPage() {
        for (WebElement course : courses) {
            System.out.println(course.getText());
            Assert.assertTrue(course.isDisplayed());
        }
    }

    //////////// The subtitle of the COURSES link is MY COURSE COMMENTS //////////////////
    @FindBy(name = "from")
    WebElement fromDate;
    @FindBy(name = "to")
    WebElement toDate;
    @FindBy(name = "user")
    WebElement userTextBox;
    @FindBy(name = "webinar")
    WebElement courseTextBox;
    @FindBy(xpath = "//button[text()='Show Results']")
    WebElement showResultButton;
    @FindBy(xpath = "//div[@class='table-responsive']//tbody//tr")
    List<WebElement> commentList;

    public void verifiesElementInMyCourseCommentPage(){
        Assert.assertTrue(fromDate.isDisplayed());
        Assert.assertTrue(toDate.isDisplayed());
        Assert.assertTrue(userTextBox.isDisplayed());
        Assert.assertTrue(courseTextBox.isDisplayed());
        Assert.assertTrue(showResultButton.isDisplayed());
    }

    public void selectsDate(String from, String to){
        sendKeys(fromDate,from);
        sendKeys(toDate,to);
        wait(2);
    }

    public void entersUserAndCourseForFiltring(String userName, String courseName){
        sendKeys(userTextBox,userName);
        sendKeys(courseTextBox,courseName);
        click(showResultButton);
        wait(2);
    }

    public void verifiesComments(){
        for (WebElement comments : commentList){
            Assert.assertTrue(comments.isDisplayed());
        }
    }


}
