package me.createbitcoins.androidbitcoingenerator.bitcoingenerator;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://ninecasino.com/
public class MainPage {
    private SelenideElement link = $("a[href='/lobby']");

    private SelenideElement gamepageDiv = $(".GamePage");

    private SelenideElement layoutDiv = $("#__layout");

    private SelenideElement nuxtDiv = $("#__nuxt");

    private ElementsCollection pagewrapperDiv = $$(".mobile");

    private SelenideElement pagewrapperDiv2 = $x("//div[contains(@class, 'portrait')]");

    private SelenideElement layoutDiv2 = $("#__layout");

    private SelenideElement layoutDiv3 = $(byText("      LobbySportsPromotionsDaily cashbackLottery Burning Season LotteryTournaments Summertime Greatness TournamentSummer Pop TournamentDrops & Wins Sl..."));

    private SelenideElement elementBody = $(byText("\n<iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-WGL6JVV&\" height=\"0\" width=\"0\" style=\"display:none;visibility:hidden\" title=\"gtm\"></ifra..."));

    public SelenideElement getLink() {
        return link;
    }

    public void setLink(SelenideElement link) {
        this.link = link;
    }

    public SelenideElement getGamepageDiv() {
        return gamepageDiv;
    }

    public void setGamepageDiv(SelenideElement gamepageDiv) {
        this.gamepageDiv = gamepageDiv;
    }

    public SelenideElement getLayoutDiv() {
        return layoutDiv;
    }

    public void setLayoutDiv(SelenideElement layoutDiv) {
        this.layoutDiv = layoutDiv;
    }

    public SelenideElement getNuxtDiv() {
        return nuxtDiv;
    }

    public void setNuxtDiv(SelenideElement nuxtDiv) {
        this.nuxtDiv = nuxtDiv;
    }

    public ElementsCollection getPagewrapperDiv() {
        return pagewrapperDiv;
    }

    public void setPagewrapperDiv(ElementsCollection pagewrapperDiv) {
        this.pagewrapperDiv = pagewrapperDiv;
    }

    public SelenideElement getPagewrapperDiv2() {
        return pagewrapperDiv2;
    }

    public void setPagewrapperDiv2(SelenideElement pagewrapperDiv2) {
        this.pagewrapperDiv2 = pagewrapperDiv2;
    }

    public SelenideElement getLayoutDiv2() {
        return layoutDiv2;
    }

    public void setLayoutDiv2(SelenideElement layoutDiv2) {
        this.layoutDiv2 = layoutDiv2;
    }

    public SelenideElement getLayoutDiv3() {
        return layoutDiv3;
    }

    public void setLayoutDiv3(SelenideElement layoutDiv3) {
        this.layoutDiv3 = layoutDiv3;
    }

    public SelenideElement getElementBody() {
        return elementBody;
    }

    public void setElementBody(SelenideElement elementBody) {
        this.elementBody = elementBody;
    }

}
