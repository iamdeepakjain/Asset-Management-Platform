package org.example.service;

import org.example.model.Wallet;
import java.util.List;

public interface WalletService {

    List<Wallet> getAllWallets();

    Wallet createWallet(String userName, Double balance);

    Wallet deposit(Long walletId, Double amount);

    Wallet withdraw(Long walletId, Double amount);
}

