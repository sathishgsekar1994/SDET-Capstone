import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from Pages.SwagLabPage import SwagLabPage


class Test_001_SwagLab:
    baseURL = "https://www.saucedemo.com/"
    username = "standard_user"
    password = "secret_sauce"

    def test_homePageTitle(self):
        self.driver = webdriver.Chrome()
        self.driver.maximize_window()
        self.driver.get(self.baseURL)
        self.driver.implicitly_wait(10)
        self.swag = SwagLabPage(self.driver)
        # time.sleep(5)
        self.swag.getSignInBtn(self.username, self.password)
        self.swag.getAddtoCart()
        self.swag.right_corner()
        self.swag.getLogoutBtn()
