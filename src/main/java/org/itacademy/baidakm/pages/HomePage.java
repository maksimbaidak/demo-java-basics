package org.itacademy.baidakm.pages;

public class HomePage extends BasePage{

    protected String HOME_URL = BASE_URL + "/" + getTitle();

    public String getTitle(){
        return "домашняя страница";
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL);
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке Войти");
    }
}
