## ATM Entity diagram

Diagram below represents entity diagram for the ATM. Besides ATM only entities contines broader scope with the entities which are connected to the bank and accounts for the user (since in most of the cases ATM is connected to the bank system).


![Alt text](entity-diagram.png?raw=true " Entity diagram")

## Banking model (external)

As already mentioned, this model is not needed for the ATM itself, but is not possible to operate an ATM without interface to the banking system. Therefore will be also described in the scope of this project.

### User
- Registration for the users in the system and basic information about them.

### Account
- Holds information about the user accounts. 
- Typically a user can have multiple accounts.

### Card
- Cards information about the user. Each card is connected to one account of the user. 
- Each user can have multiple cards issued.
- Card has always validity period. Also its status can be Active, Blocked, Cancelled etc.

### Transaction
- All transactions about user accounts should be tored here. 
- Also ATM transactions ar recorded in the main tranaction system.
- There could be different types of tranactions - ATM, internet transfer, bank transfer, cash-desk etc.

## ATM model

Below is described the entity model which is only used by the ATM system.

### ATM
- Each ATM is specified by the description and location.
- Status can be different - Active, Out-of-money, malfunction etc.

### Money
- Holds information about different type of cash - coinds and banknotes.
- Each entry has description and value (amount)
- Type can be coin or banknote

### Money bank
- Holder for all the money (cash) that are available in the ATM. 

### Payment
- Local tranaction or payment information. 
- Tracks each payment and how exactly was payed - how many coins, banknotes etc.
