package lv.javaguru.courses.ingenico.lecture3.hometasks.collections.map.cards;

public class Task {

    public static void main(String[] args) {
        /* todo :
        * 0. move common logic from AccountRepository and CreditCardRepository
        * into abstract generic superclass Repository
        *
        * 1. fix Account class to have possibility use it as Key in HashMap
        *
        * 2. create instance of AccountRepository and add few accounts
        *
        * 3. create instance of CreditCardRepository and add few credit cards
        * for each accounts
        *
        * 4. - retrieve all accounts from repository
        *    - retrieve all credit cards from repository
        *    - group all cards by account into Map<Account, List<CreditCard>>
        *      key = Account
        *      value = List of CreditCard (only which has the same account id as key-Account)
        *
        *      e.g. key = Account(id = 1)
        *           value = List [ CreditCard(id=10, accountId=1),  CreditCard(id=5, accountId=1)]
        *
        * 5. use Map#get(account) to retrieve List of credit cards
        */


    }

}
