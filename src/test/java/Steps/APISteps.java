package Steps;

import io.cucumber.java.en.*;

public class APISteps {

    @Given("^I send a GET request$")
    public void sendGETRequest(){
        System.out.println("holis");
    }


    @Then("^I get a list of (\\d+) users$")
    public void getListOfUsers(int users) {
        System.out.println(users);
    }

}
