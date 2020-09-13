$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/FeatureData.feature");
formatter.feature({
  "name": "Verify Adactin using datatype details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify login details and enter",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "User should enter \"\u003cuserName\u003e\", \"\u003cpassword\u003e\" and click",
  "keyword": "When "
});
formatter.step({
  "name": "User should search hotel by values \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomType\u003e\",\"\u003ccheckinDt\u003e\",\"\u003ccheckkOutDt\u003e\",\"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003cadd\u003e\",\"\u003cccNo\u003e\",\"\u003cexpMon\u003e\",\"\u003cexpYr\u003e\"and\"\u003ccvvNo\u003e\"",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultsPerRoom",
        "childPerRoom",
        "cardType"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None",
        "American Express"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One",
        "VISA"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "2 - Two",
        "Master Card"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three",
        "Other"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "",
        "4 - Four",
        ""
      ]
    },
    {
      "cells": [
        "6 - Six",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "",
        "",
        ""
      ]
    }
  ]
});
formatter.step({
  "name": "print the booking id generated",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter the logout button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "location",
        "hotels",
        "roomType",
        "checkinDt",
        "checkkOutDt",
        "firstName",
        "lastName",
        "add",
        "ccNo",
        "expMon",
        "expYr",
        "cvvNo"
      ]
    },
    {
      "cells": [
        "Pushparaj",
        "HF07YG",
        "Melbourne",
        "Hotel Sunshine",
        "Standard",
        "01/09/2020",
        "02/09/2020",
        "Pushparaj",
        "Utham",
        "No.1,FirstColny",
        "4567765498768907",
        "July",
        "2022",
        "234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify login details and enter",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionDatatype.user_is_on_Adactin_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should enter \"Pushparaj\", \"HF07YG\" and click",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionDatatype.user_should_enter_and_click(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should search hotel by values \"Melbourne\",\"Hotel Sunshine\",\"Standard\",\"01/09/2020\",\"02/09/2020\",\"Pushparaj\",\"Utham\",\"No.1,FirstColny\",\"4567765498768907\",\"July\",\"2022\"and\"234\"",
  "rows": [
    {
      "cells": [
        "noOfRooms",
        "adultsPerRoom",
        "childPerRoom",
        "cardType"
      ]
    },
    {
      "cells": [
        "1 - One",
        "1 - One",
        "0 - None",
        "American Express"
      ]
    },
    {
      "cells": [
        "2 - Two",
        "2 - Two",
        "1 - One",
        "VISA"
      ]
    },
    {
      "cells": [
        "3 - Three",
        "3 - Three",
        "2 - Two",
        "Master Card"
      ]
    },
    {
      "cells": [
        "4 - Four",
        "4 - Four",
        "3 - Three",
        "Other"
      ]
    },
    {
      "cells": [
        "5 - Five",
        "",
        "4 - Four",
        ""
      ]
    },
    {
      "cells": [
        "6 - Six",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "7 - Seven",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "8 - Eight",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "9 - Nine",
        "",
        "",
        ""
      ]
    },
    {
      "cells": [
        "10 - Ten",
        "",
        "",
        ""
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDatatype.user_should_search_hotel_by_values_and(String,String,String,String,String,String,String,String,String,String,String,String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "print the booking id generated",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionDatatype.print_the_booking_id_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter the logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionDatatype.user_should_enter_the_logout_button()"
});
formatter.result({
  "status": "skipped"
});
});