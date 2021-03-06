package yandex.service;

import yandex.page.YaDiskPage;

import java.io.IOException;

public class YaDiskService {

    private YaDiskPage yaDiskPage = new YaDiskPage();

    public void uploadFile(String s) {
        yaDiskPage.sendFile(s);
    }

    public void downloadFile(String s) throws InterruptedException, IOException {
        yaDiskPage.downloadFile(s);
    }

    public void moveFileToTrash(String s) {
        yaDiskPage.moveToTrash(s);
    }

    public void openTrash() {
        yaDiskPage.openTrash();
    }

    public void selectFiles(String s1, String s2, String s3) {
        yaDiskPage.selectFiles(s1, s2, s3);
    }

    public boolean isRestore(String s) {
        return yaDiskPage.isElementPresent(s);
    }

    public void closeBrowser() {
        yaDiskPage.close();
    }

}
