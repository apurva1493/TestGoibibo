Feature: Goibibo testing
Scenario: Perform oneway operation
Given Navigate to goibibo_oneway
When Provide the inputs to all fields_oneway
Then Review the page_oneway

Scenario: Perform roundtrip operation
Given Navigate to goibibo_roundtrip
When Provide the inputs to all fields_roundtrip
Then Review the page_roundtrip

Scenario: Perform multicity operation
Given Navigate to goibibo_multicity
When Provide the inputs to all fields_multicity
Then Review the page_multicity