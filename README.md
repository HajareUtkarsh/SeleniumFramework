# SeleniumFramework
Hey Viewers! This is my first project on GitHub in which I've automated Amazon.com website to add item in cart and proceed
For this I've created 4 object files in com.objects package under src/main/java folder 
1. Initialize driver and get https://amazon.com locate 'All' tab and click on 'Electronics' section for this @Test(priority = 1)
2. Scan all WebElements in 'Electronics' section using for loop and store name of these elements with price in excel sheet using XSSF class @Test(priority = 2)
3. Click on 4th element/product @Test(priority = 3)
4. Click on add button(if available else throw and exception msg) and click on proceed button.
For all these Objects there are respective test cases in com.test.cases package under src/test/java folder
