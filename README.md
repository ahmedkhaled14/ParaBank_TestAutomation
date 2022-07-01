<div align="center">
 <img  src="https://user-images.githubusercontent.com/68038931/147390936-c6228337-9787-4aab-b5d6-826bc8e4e4a3.gif" alt="test-light" width="1000" height="250" />
 </div>
 
# ✨ *Para Bank* ==> *GUI* *Test Automation* ✨


## ⚡️⚡️ Automate different functionalities of "Para Bank" Web App ⚡️⚡️
### 🌐 Website URL: https://parabank.parasoft.com/parabank/index.htm
 
- ### 📝 The main Frameworks included in the project:
 **SHAFT Engine on the Top of:**

 *Selenium Webdriver*
 
 *TestNG*
 
 *Allure Report*
 
 *Extent Reports*
 
 *Remote Execution { Selenium Grid4 & Docker Compose }*
 
-  ### 🏗️ Project Design:
 *Page Object Model (POM) design pattern*
 
 *Data Driven framework*
 
 *Fluent design approach*
 
 *Java Docs*
 
 - ### 🔍️ Covered Test cases in this project :
#### ✅1. Test Case - Automate User Registration process.
 Steps to Automate:
1. Open this url  https://parabank.parasoft.com/parabank/index.htm
2. Click On Register Link.
3. Add Valid Register Data.
4. Click On Register Button.
5. Verify that user is able to Register successfully in the ParaBank application after providing the valid Register Test Data.

#### ✅2. Test Case - Automate that user is able to login successfully.
 Steps to Automate:
1. Open this url  https://parabank.parasoft.com/parabank/index.htm
2. Enter the Valid UserName.
3. Enter the Valid Password.
4. Click the Login button.
5.Verify that user is able to login successfully in the ParaBank application after providing the valid username and password.

#### ✅3. Test Case - Automate that User is able to Open the Account successfully.
 Steps to Automate:
1. Open this url  https://parabank.parasoft.com/parabank/index.htm
2. Enter the Valid UserName.
3. Enter the Valid Password.
4. Click the Login button.
5.navigate to my account page.
6.Click on Open New Account.
7.Verify that field What type of Account would you like to open? is displayed.

#### ✅4. Test Case - Automate that Overview page is displayed.
 Steps to Automate:
1. Open this url  https://parabank.parasoft.com/parabank/index.htm
2. Enter the Valid UserName.
3. Enter the Valid Password.
4. Click the Login button.
5.navigate to my account page.
6.Click on Open New Account.
7.Verify that Account Overview page is displayed.

#### ✅5. Test Case - Automate that User is able to view the Account Overview page.
 Steps to Automate:
1. Open this url  https://parabank.parasoft.com/parabank/index.htm
2. Enter the Valid UserName.
3. Enter the Valid Password.
4. Click the Login button.
5.navigate to my account page.
6.Click on Open New Account.
7.Click On Accounts OverView.
8.Verify that User is able to view the Account Overview page.


#### 🏷️ NB: If you wish to use SHAFT with IntelliJ please apply these settings:
Run/Debug Configurations > Edit Configurations... > Templates > TestNG > Configuration > Listeners > Add all SHAFT_Engine Listeners [AlterSuite, InvokedMethod, Suite]
 
 

