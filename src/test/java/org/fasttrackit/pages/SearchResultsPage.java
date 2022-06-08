package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".products-grid li.item")
    private List<WebElementFacade> productsList;
    @FindBy(css = ".note-msg")
    private WebElementFacade unavailableProduct;


    public boolean checkListForProduct(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void selectProductFromList(String product){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(product)){
                element.findElement(By.cssSelector("a.product-image")).click();
                break;
            }
        }
    }

    public void verifyProductAvailability(String unavailableMessage) {
        unavailableProduct.shouldContainOnlyText("Your search returns no results.");
    }


}
