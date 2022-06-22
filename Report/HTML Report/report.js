$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/CreateNewAccount.feature");
formatter.feature({
  "name": "To check bf funcion",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@newaccount"
    }
  ]
});
formatter.scenario({
  "name": "to check create new account function",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@newaccount"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To open Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.toOpenChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to Click createnew btn",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toClickCreatenewBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click sign in button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "To Check login Fuctions",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginfuncion"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_Open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass valid username and valid Password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginfuncion"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "To pass  valid username and  password",
  "rows": [
    {
      "cells": [
        "1234",
        "blue"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassValidUsernameAndPassword(DataTable)"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:98)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy22.sendKeys(Unknown Source)\r\n\tat org.baseclass.HelperClass.fillTheTextBox(HelperClass.java:45)\r\n\tat org.steps.StepDefinition.toPassValidUsernameAndPassword(StepDefinition.java:83)\r\n\tat ✽.To pass  valid username and  password(file:src/test/resources/FeatureFiles/Login.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To Click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To Open Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_Open_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To pass invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginfuncion"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To pass invalid username and valid password",
  "rows": [
    {
      "cells": [
        "user",
        "pass",
        "numbers"
      ]
    },
    {
      "cells": [
        "red",
        "red@123",
        "123"
      ]
    },
    {
      "cells": [
        "blue",
        "blue@456",
        "456"
      ]
    },
    {
      "cells": [
        "orange",
        "orange@789",
        "789"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.toPassInvalidUsernameAndValidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.toClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});