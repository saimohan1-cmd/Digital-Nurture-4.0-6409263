package com.cognizant.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
@RequestMapping("/accounts")
public class AccountApp {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

    static class Account {
        private String number;
        private String type;
        private int balance;

        public Account(String number, String type, int balance) {
            this.number = number;
            this.type = type;
            this.balance = balance;
        }

        public String getNumber() { 
        	return number; 
        }
        public String getType() {
        	return type; 
        }
        public int getBalance() {
        	return balance; 
        }
    }

    @GetMapping("/{number}")
    public Account getAccountDetails(@PathVariable String number) {
        return new Account(number, "savings", 234343);
    }
}
