package com.gitlab.issues.api;

import com.gitlab.helper.ReadDataFromFile;
import com.gitlab.issues.models.payload.Issue;
import io.restassured.response.Response;
import java.util.Map;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.given;

public class CreateIssueAPI extends BasePage{

    /**
     * Crete issue using Gitlab API
     * @param issueData is the required data for issue creation
     */
    @Step
    public void createIssue(Map<String, String> issueData) {
        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization",Serenity.sessionVariableCalled("token"))
                .when().log().all().body(new JSONObject(issueData).toString()).post("/");
        String responseAsString = response.getBody().asString();
        JSONObject responseAsObject = new JSONObject(responseAsString);
        Serenity.setSessionVariable("createIssueResponseCode").to(response.statusCode());
        Serenity.setSessionVariable("createIssueResponse").to(responseAsObject);
        setIssueIdAsSessionVariable(response);
    }

    public void createIssue(String fileName){
        Response response = given()
                .header("Content-Type","application/json")
                .header("Authorization",Serenity.sessionVariableCalled("token"))
                .when().log().all().body(ReadDataFromFile.fetch(fileName+".json")).post("/");
        String responseAsString = response.getBody().asString();
        JSONObject responseAsObject = new JSONObject(responseAsString);
        Serenity.setSessionVariable("createIssueResponseCode").to(response.statusCode());
        Serenity.setSessionVariable("createIssueResponse").to(responseAsObject);
        setIssueIdAsSessionVariable(response);
    }

    public Boolean VerifyIssueResponseSchema() {
        try {
            Issue issueResponse =mapper.readValue(Serenity.sessionVariableCalled("createIssueResponse").toString(),Issue.class);
            return !issueResponse.getTitle().isEmpty();
        } catch (Throwable e) {
            return false;
        }
    }

    private void setIssueIdAsSessionVariable(Response response){
        JSONObject createIssueResponse = new JSONObject(response.getBody().asString());
        if (Serenity.sessionVariableCalled("createIssueResponseCode").equals(201)){
            Serenity.setSessionVariable("issueIdForThisRun").to(createIssueResponse.get("id"));
        } else {
            Serenity.setSessionVariable("issueIdForThisRun").to("No_Issue_Created");
        }

    }

}
