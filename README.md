~ Asset Management Platform (fund/asset Module)

This project is a Spring Boot–based backend service for managing user wallets.
It supports wallet creation, balance tracking, deposits, and withdrawals.

~ Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 / MySQL
- Maven

~ Features
- Create wallet for a user
- Fetch all wallets
- Deposit amount into wallet
- Withdraw amount with balance validation

~ API Endpoints

~ Create Wallet
POST /api/wallets  
Params:
- userName
- balance

~ Deposit
POST /api/wallets/{id}/credit  
Params:
- amount

~ Withdraw
POST /api/wallets/{id}/debit  
Params:
- amount

~ Future Enhancements
- Transaction history
- Authentication & authorization
- Asset portfolio support
- Exception handling with global handler
