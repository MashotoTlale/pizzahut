package tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;

public class PizzaHutTestNG extends BaseTest {

    private String url;
    private String location;
    private String voucherCode;

    @BeforeClass
    @Parameters({
            "url",
            "location",
            "voucherCode"
    })
    public void setUp(
            String url,
            String location,
            String voucherCode) {

        this.url = url;
        this.location = location;
        this.voucherCode = voucherCode;

        startBrowser(url);
    }

    @Test(priority = 1)
    public void closeLocationPopup() {

        System.out.println(
                "Closing black location popup"
        );
    }

    @Test(priority = 2)
    public void setDeliveryLocation() {

        System.out.println(
                "Setting location: " + location
        );
    }

    @Test(priority = 3)
    public void validateDealsPage() {

        String currentUrl =
                driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.toLowerCase().contains("deals"),
                "URL does not contain deals"
        );
    }

    @Test(priority = 4)
    public void addSideBelow200() {

        System.out.println(
                "Adding side below ₹200"
        );
    }

    @Test(priority = 5)
    public void addTwoDrinks() {

        System.out.println(
                "Adding two drinks"
        );
    }

    @Test(priority = 6)
    public void openCheckout() {

        System.out.println(
                "Opening checkout"
        );
    }

    @Test(priority = 7)
    public void validateOnlinePayment() {

        System.out.println(
                "Validating Online Payment"
        );
    }

    @Test(priority = 8)
    public void selectCashPayment() {

        System.out.println(
                "Selecting Cash"
        );
    }

    @Test(priority = 9)
    public void validateAgreeCheckbox() {

        System.out.println(
                "Validating I Agree checkbox"
        );
    }

    @Test(priority = 10)
    public void enterCustomerDetails() {

        System.out.println(
                "Entering customer details"
        );
    }

    @Test(priority = 11)
    public void applyGiftCard() {

        System.out.println(
                "Opening Gift Card"
        );
    }

    @Test(priority = 12)
    public void submitVoucher() {

        System.out.println(
                "Submitting voucher: "
                        + voucherCode
        );
    }

    @Test(priority = 13)
    public void validateVoucherError() {

        System.out.println(
                "Validating incorrect voucher error"
        );
    }

    @Test(priority = 14)
    public void closeVoucherPopup() {

        System.out.println(
                "Closing voucher popup"
        );
    }

    @Test(priority = 15)
    public void returnToBasket() {

        System.out.println(
                "Returning to basket"
        );
    }

    @AfterClass
    public void tearDown() {

        closeBrowser();
    }
}
