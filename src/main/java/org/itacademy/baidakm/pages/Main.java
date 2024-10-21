package org.itacademy.baidakm.pages;

public class Main {

    public static void main(String[] args) {
        new BasePage().open();
        new HomePage().clickLogin();
        new LoginPage().open();
    }
}
