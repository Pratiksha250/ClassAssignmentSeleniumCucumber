Feature: Amazon online booking
Scenario: Ordering a product
	Given user is on HomePage
	When user enters "tuesdays with morrie" 
	And user clicks on search 
	And user selects the product
	And user adds the product to the cart
	Then product is added in the card