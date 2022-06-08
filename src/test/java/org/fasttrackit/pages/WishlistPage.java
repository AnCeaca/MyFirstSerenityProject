package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class WishlistPage extends PageObject {

    @FindBy (css = "[title = 'My Wishlist (1 item)']")
    private WebElementFacade wishlistText;

    public void checkMessage(String message){
        wishlistText.shouldContainOnlyText("MY WISHLIST");
    }
}
