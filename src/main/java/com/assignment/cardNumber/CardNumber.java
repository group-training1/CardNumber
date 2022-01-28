package com.assignment.cardNumber;
import org.apache.log4j.Logger;

public class CardNumber {
    static Logger log = Logger.getLogger(CardNumber.class.getName());
      public static void main(String[] args) {
          log.info("Started executing main method");
          String cardNumber = "1234567899876543";
          CardNumber number = new CardNumber();
          log.info( (number.validity(cardNumber)? "Card Number is Valid "+'\n'+"Your Card Number is masked: "
                  +(number.maskCardNumber(cardNumber)): "The given number is Invalid Card Number"));
      }

    public boolean  validity(String cardNumber) {
        return sizeOfCardNumber(cardNumber) == 16 && (cardNumber.matches("[0-9]+"));
    }
    public int sizeOfCardNumber(String cardNumber) {
        return cardNumber.length();
    }
    public String maskCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.equals("")) {
            return null;
        } else if(!validity(cardNumber)) {
            return "Invalid card";
        }else{
            char[] lastDigits = new char[4];
            cardNumber.getChars(12, 16, lastDigits, 0);
            String mask = "XXXX XXXX XXXX ";
            return mask + String.valueOf(lastDigits);
        }
    }
}
