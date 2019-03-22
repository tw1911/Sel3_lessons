package ru.tw1911.sel3_lessons;

import org.junit.Test;

public class CartTests extends BasicTest {
    @Test
    public void addProductToCartTest(){
        for (int i=0;i<3;i++){
            app.addProductToCart();
        }
        app.clearCart();
    }
}
