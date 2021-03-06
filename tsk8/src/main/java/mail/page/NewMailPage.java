package mail.page;

import ui.Browser;

public class NewMailPage extends Browser {

    private static final String ADDRESS_LOCATOR = "//textarea[@data-original-name='To']";
    private static final String SUBJECT_LOCATOR = "//input[@name='Subject']";
    private static final String BODY_FRAME = "//iframe[contains(@id, 'composeEditor_ifr')]";
    private static final String BODY_TEXTBOX = "//*[@id='tinymce']";
    private static final String SEND_BUTTON_LOCATOR = "//div[@data-name='send']";
    private static final String MAIL_SEND_LOCATOR = "Перейти во Входящие";
    private static final String GO_TO_INBOX_HREF_LOCATOR = "//a[contains(text(),'Перейти во Входящие')]";

    public String getNewMailPageTitle() {
        return getPageTitle();
    }

    public void sendKeysToAddress(String address) {
        typeValue(ADDRESS_LOCATOR, address);
    }

    public void sendKeysToSubject(String subject) {
        typeValue(SUBJECT_LOCATOR, subject);
    }

    public void sendKeysToMailBody(String mail) {
        switchToFrame(BODY_FRAME);
        typeValue(BODY_TEXTBOX, mail);
        switchToDefault();
    }

    public void clickSendButton() {
        click(SEND_BUTTON_LOCATOR);
    }

    public boolean isMailSendPresent() {
        return isElementPresent(MAIL_SEND_LOCATOR);
    }

    public void clickToInbox() {
        clickA(GO_TO_INBOX_HREF_LOCATOR);
    }

}
