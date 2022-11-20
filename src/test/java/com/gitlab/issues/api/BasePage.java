package com.gitlab.issues.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.gitlab.helper.ForceStringDeserializer;
import com.gitlab.helper.GetTestProperties;
import io.restassured.RestAssured;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.pages.PageObject;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class BasePage extends PageObject {

  GetTestProperties getTestProperties=new GetTestProperties();

  public final ObjectMapper mapper = new ObjectMapper().registerModule(
        new SimpleModule().addDeserializer(String.class, new ForceStringDeserializer())
  );


  /**
   * Method to pick baseURL based on environment setup
   * @return
   */
  public String getBaseURL() {
    String env = System.getenv("ENV");
    if (env == null || env.isEmpty()) {
      return "https://gitlab.com/api/v4";
    } else {
      switch (env) {
        case "localhost":
          return "https://localhost:8080";
        case "test":
          return "URL FOR TEST";
        case "test-staging":
          return "URL FOR STAGING";
        case "prod-live":
          return "https://gitlab.com/api/v4";
        case "mock":
          return "URL FOR MOCK";
        default:
          return "default URL";
      }
    }
  }

  /**
   * Method to setup Test and set userType and repoType
   * @param userType
   * @param repoType
   */
  public void setupTest(String userType,String repoType) {
    setToken(userType);
    setBaseURL(repoType);
  }
  private void setBaseURL(String repoType) {
    if (repoType.equalsIgnoreCase("PUBLIC")) {
      RestAssured.baseURI = getBaseURL() + "/projects/"+getTestProperties.getValue("public_repo_id")+"/issues";
    } else {
      RestAssured.baseURI = getBaseURL() + "/projects/"+getTestProperties.getValue("private_repo_id")+"/issues";
    }
  }

  private void setToken(String userType) {
    if (userType.equalsIgnoreCase("VALID")) {
      Serenity.setSessionVariable("token").to("Bearer " + getTestProperties.getValue("token"));
    } else {
      Serenity.setSessionVariable("token").to("null");
    }
  }

  public void verifyStatusCode(String serviceName, String statusCode) {
    assertThat(Serenity.sessionVariableCalled(serviceName).toString()).as(serviceName+" response code is").isEqualTo(statusCode);
  }

  public void verifyStatusCodeIsNot(String serviceName, String statusCode) {
    assertThat(Serenity.sessionVariableCalled(serviceName).toString()).as(serviceName+" response code is").isNotEqualTo(statusCode);
  }

}
