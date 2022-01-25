package com.assignment.cardNumber;

public class CardNumber {
      public static void main(String[] args) {
          String cardNumber = "1234567899876543";
          CardNumber number = new CardNumber();
          System.out.println( (number.validity(cardNumber)? "Card Number is Valid "+'\n'+"Your Card Number is masked: "
                  +(number.maskCardNumber(cardNumber)): "The given number is Invalid Card Number"));
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
