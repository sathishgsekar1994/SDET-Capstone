import time
from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By


class SwagLabPage:
    username = "user-name"
    password = "password"
    loginbutton = "login-button"
    add_to_cart_button = "add-to-cart-sauce-labs-backpack"
    cart_icon_badge = "//span[@class='shopping_cart_badge']"
    cart_icon_container1 = "//div[@id='shopping_cart_container']"
    menu = "react-burger-menu-btn"
    logout_button = "logout_sidebar_link"
    title = "//span[text()='Your Cart']"

    def __init__(self, driver):
        self.driver = driver

    def getSignInBtn(self, username, password):
        self.driver.find_element("id", self.username).send_keys(username)
        self.driver.find_element("id", self.password).send_keys(password)
        self.driver.find_element("id", self.loginbutton).click()
        # time.sleep(2)

    def getAddtoCart(self):
        self.driver.find_element("id", self.add_to_cart_button).click()
        time.sleep(2)

        cart_icon = self.driver.find_element("xpath", self.cart_icon_badge)
        assert cart_icon.text == "1"

    def right_corner(self):
        cart_icon = self.driver.find_element("xpath", self.cart_icon_container1)
        actions = ActionChains(self.driver)
        actions.move_to_element(cart_icon).move_by_offset(10, 0).click().perform()

        content = self.driver.find_element("xpath", self.title)

    def getLogoutBtn(self):
        self.driver.find_element("id", self.menu).click()
        self.driver.find_element("id", self.logout_button).click()
        time.sleep(2)

        assert "Swag Labs" in self.driver.title
