package org.fasttrackit.features.search;

import org.junit.Test;

public class SearchTests extends BaseTests{

    @Test
    public void searchForProductTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        searchSteps.doSearch("necklace");
        searchSteps.verifyProductInResults("SILVER DESERT NECKLACE");
        searchSteps.selectProductFromList("SILVER DESERT NECKLACE");
        cartSteps.clickAddToCart();
    }

    @Test
    public void searchByPriceTest(){
        loginSteps.doLogin("cosmin@fasttrackit.org","123456");
        searchSteps.doSearch("necklace");






}
