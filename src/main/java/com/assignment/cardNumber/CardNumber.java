package com.assignment.cardNumber;
public class CardNumber {
      public static void main(String[] args) {
          long cardNumber = 6545367899876543L;
          CardNumber number = new CardNumber();
          System.out.println( (number.validity(cardNumber)? "Card Number is Valid "+'\n'+"Your Card Number is masked: "
                  +(number.maskCardNumber(cardNumber)): "The Number "+cardNumber+" is Invalid Card Number"));
      }

    public boolean  validity(long cardNumber) {
    return sizeOfCardNumber(cardNumber)==16 && (cardNumber>0);
    }
    public int sizeOfCardNumber(long d) {
        String num = String.valueOf(d);
        return num.length();
    }
    public String maskCardNumber(long cardNumber){
        String unMaskedNumber = String.valueOf(cardNumber);
        String lastDigits=unMaskedNumber.substring(12);
        String mask="XXXX XXXX XXXX ";
        return mask+ lastDigits;
      }
}
