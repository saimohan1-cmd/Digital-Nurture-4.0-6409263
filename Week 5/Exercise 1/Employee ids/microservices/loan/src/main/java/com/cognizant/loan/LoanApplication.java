package com.cognizant.loan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
@RequestMapping("/loans")
public class LoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanApplication.class, args);
    }

    static class Loan {
        private String number;
        private String type;
        private int loan;
        private int emi;
        private int tenure;

        public Loan(String number, String type, int loan, int emi, int tenure) {
            this.number = number;
            this.type = type;
            this.loan = loan;
            this.emi = emi;
            this.tenure = tenure;
        }

        public String getNumber() { return number; }
        public String getType() { return type; }
        public int getLoan() { return loan; }
        public int getEmi() { return emi; }
        public int getTenure() { return tenure; }
    }
    @GetMapping("/{number}")
    public Loan getLoanDetails(@PathVariable String number) {
        return new Loan(number, "car", 400000, 3258, 18);
    }
}
