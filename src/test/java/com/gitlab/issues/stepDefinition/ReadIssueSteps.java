package com.gitlab.issues.stepDefinition;

import com.gitlab.issues.api.ReadIssuesAPI;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import static org.assertj.core.api.Assertions.assertThat;

public class ReadIssueSteps {

    @Steps
    ReadIssuesAPI readIssuesAPI;

    @When("^user tries to view all the issues$")
    public void viewIssues() {
        readIssuesAPI.getIssues();
    }
    @Then("^All the list of issues (.*) Visible$")
    public void verifyViewIssues(String status) {
        if(status.equalsIgnoreCase("are")){
            readIssuesAPI.verifyStatusCode( "getIssueResponseCode","200");
            assertThat(Integer.valueOf(Serenity.sessionVariableCalled("getIssueResponseCount").toString())).as("Get Issue response count is").isGreaterThan(0);}
        else
            readIssuesAPI.verifyStatusCodeIsNot( "getIssueResponseCode","200");
    }



    @Then("^the issue (.*) visible list of total Issues$")
    public void verifyIssueList(String issueExist) {
        readIssuesAPI.getIssues();
        if(issueExist.equalsIgnoreCase("is")){
            assertThat(readIssuesAPI.verifyIfIssueExist(Serenity.sessionVariableCalled("issueIdForThisRun").toString())).isTrue();
        }else{
            assertThat(readIssuesAPI.verifyIfIssueExist(Serenity.sessionVariableCalled("issueIdForThisRun").toString())).isFalse();
        }
    }

    @When("^user tries to view issue with Milestone (.*)$")
    public void viewIssuesWithMilestone(String milestone) {
        readIssuesAPI.getIssuesWithMilestone(milestone);
    }
    @Then("^Issue with Iid (.*), (.*) available in the list$")
    public void verifyIfExactIidExist(String iidValue,String status) {
        readIssuesAPI.getIssues();
        if (status.equalsIgnoreCase("is")) {
            if (Serenity.sessionVariableCalled("getIssueResponseCode").equals(200)) {
                assertThat(readIssuesAPI.verifyIidExist(Integer.valueOf(iidValue))).isTrue();
            }
        } else {
            assertThat(readIssuesAPI.verifyIidExist(Integer.valueOf(iidValue))).isFalse();
        }

    }
}
