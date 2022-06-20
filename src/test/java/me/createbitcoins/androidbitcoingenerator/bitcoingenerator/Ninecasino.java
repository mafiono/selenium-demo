package me.createbitcoins.androidbitcoingenerator.bitcoingenerator;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public interface Ninecasino {
    default SelenideElement getLink() {
        return null;
    }

    default void setLink(SelenideElement link) {
    }

    SelenideElement getGamepageDiv();

    void setGamepageDiv(SelenideElement gamepageDiv);

    SelenideElement getLayoutDiv();

    void setLayoutDiv(SelenideElement layoutDiv);

    SelenideElement getNuxtDiv();

    void setNuxtDiv(SelenideElement nuxtDiv);

    ElementsCollection getPagewrapperDiv();

    void setPagewrapperDiv(ElementsCollection pagewrapperDiv);

    SelenideElement getPagewrapperDiv2();

    void setPagewrapperDiv2(SelenideElement pagewrapperDiv2);

    SelenideElement getLayoutDiv2();

    void setLayoutDiv2(SelenideElement layoutDiv2);

    SelenideElement getLayoutDiv3();

    default void setLayoutDiv3() {
        setLayoutDiv3(null);
    }

    void setLayoutDiv3(SelenideElement layoutDiv3);
}
