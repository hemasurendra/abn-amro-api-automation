package com.gitlab.issues.stepDefinition;

import com.gitlab.issues.api.BasePage;
import com.gitlab.issues.api.CreateIssueAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

public class CreateIssueSteps {

    @Steps
    CreateIssueAPI createIssueAPI;

    @Steps
    BasePage basePage;


    @Given("^A user access a (.*) gitlab repo with (.*) access$")
    public void setupTest(String repoType, String userType) {
        basePage.setupTest(userType, repoType);
    }

    @When("^user creates an issue using (.*)$")
    public void createIssue(String fileName) {
       createIssueAPI.createIssue(fileName);
    }


    @When("^user creates an issue with details$")
    public void createIssue(DataTable dataTable) {
        Map<String, String> issueData = dataTable.asMaps(String.class, String.class).get(0);
        createIssueAPI.createIssue(issueData);
    }
    @Then("^Issue is created with status code (.*)$")
    public void verifyIsIssueCreated(String statusCode ) {
        createIssueAPI.verifyStatusCode("createIssueResponseCode",statusCode);
        if (statusCode.equalsIgnoreCase("201")) {
            assertThat(createIssueAPI.VerifyIssueResponseSchema()).as("Create Issue response schema is verified").isTrue();
        }
    }

}
