package org.itacademy.baidakm.pages;

public class LoginPage extends BasePage{

    protected String LOGIN_PAGE = BASE_URL + "/" + getTitle();

    public String getTitle() {
        return "форма логина";
    }

    @Override
    public void open() {
        System.out.println(LOGIN_PAGE);
    }
}
