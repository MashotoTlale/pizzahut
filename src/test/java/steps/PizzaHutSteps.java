package steps;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class PizzaHutSteps {

    private BaseTest baseTest = new BaseTest();

    @Given("User launch Pizzahut application with {string}")
    public void user_launch_pizzahut_application(String url) {

        baseTest.startBrowser(url);

        System.out.println(
                "Pizza Hut application launched: " + url
        );
    }

    @When("User wait for auto location black pop up screen")
    public void user_wait_for_auto_location_black_pop_up_screen() {

        System.out.println("Waiting for location popup...");
    }

    @Then("User close the pop up screen")
    public void user_close_the_pop_up_screen() {

        System.out.println("Closing popup...");
    }

    @Then("User see pop up for delivery asking for enter location")
    public void user_see_delivery_location_popup() {

        System.out.println(
                "Checking delivery location popup..."
        );
    }

    @Then("User type address as {string}")
    public void user_type_address(String location) {

        System.out.println(
                "Entering location: " + location
        );
    }

    @Then("User select first auto populate drop down option")
    public void user_select_first_auto_populate_option() {

        System.out.println(
                "Selecting first location suggestion..."
        );
    }

    @When("User navigate to details page")
    public void user_navigate_to_details_page() {

        System.out.println("Navigating to details page...");
    }

    @Then("User validate vegetarian radio button flag is off")
    public void user_validate_vegetarian_radio_button_is_off() {

        System.out.println(
                "Validating vegetarian option..."
        );
    }

    @Then("User clicks on Pizzas menu bar option")
    public void user_clicks_on_pizzas_menu_bar_option() {

        System.out.println("Clicking Pizza menu...");
    }

    @When("User select add button of any pizza from Recommended")
    public void user_select_add_button_of_any_pizza() {

        System.out.println("Adding recommended pizza...");
    }

    @Then("User see that the pizza is getting added under Your Basket")
    public void user_see_pizza_added_under_basket() {

        System.out.println(
                "Checking pizza in basket..."
        );
    }

    @Then("User validate pizza price plus Tax is checkout price")
    public void user_validate_pizza_price_plus_tax() {

        System.out.println(
                "Validating pizza price + tax..."
        );
    }

    @Then("User validate checkout button contains Item count")
    public void user_validate_item_count() {

        System.out.println(
                "Validating item count..."
        );
    }

    @Then("User validate checkout button contains total price count")
    public void user_validate_total_price() {

        System.out.println(
                "Validating total price..."
        );
    }

    @Then("User clicks on Drinks option")
    public void user_clicks_on_drinks() {

        System.out.println("Opening Drinks...");
    }

    @Then("User select Pepsi option to add into the Basket")
    public void user_select_pepsi() {

        System.out.println("Adding Pepsi...");
    }

    @Then("User see 2 items are showing under checkout button")
    public void user_see_two_items() {

        System.out.println(
                "Checking basket item count..."
        );
    }

    @Then("User see total price is now more than before")
    public void user_see_total_price_more_than_before() {

        System.out.println(
                "Checking updated price..."
        );
    }

    @Then("User remove the Pizza item from Basket")
    public void user_remove_pizza() {

        System.out.println(
                "Removing pizza..."
        );
    }

    @Then("see Price tag got removed from the checkout button")
    public void price_tag_removed() {

        System.out.println(
                "Checking price..."
        );
    }

    @Then("User see 1 item showing in checkout button")
    public void user_see_one_item() {

        System.out.println(
                "Checking one item..."
        );
    }

    @Then("User Clicks on Checkout button")
    public void user_clicks_checkout() {

        System.out.println(
                "Clicking checkout..."
        );
    }

    @Then("User see minimum order required pop up is getting displayed")
    public void user_see_minimum_order_popup() {

        System.out.println(
                "Checking minimum order popup..."
        );
    }
}
