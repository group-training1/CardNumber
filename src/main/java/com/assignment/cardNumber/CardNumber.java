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
//          System.out.println();
      }

    public boolean  validity(String cardNumber) {
    return sizeOfCardNumber(cardNumber)==16 && (cardNumber.matches("[0-9]+"));
    }
    public int sizeOfCardNumber(String cardNumber) {
        return cardNumber.length();
    }
    public String maskCardNumber(String cardNumber){
        String unMaskedNumber = String.valueOf(cardNumber);
        char[] lastDigits = new char[4];
        unMaskedNumber.getChars(12,16,lastDigits,0);
        String last4Digits=String.valueOf(lastDigits);
        String mask="XXXX XXXX XXXX ";
        return mask+ last4Digits;
      }
}
