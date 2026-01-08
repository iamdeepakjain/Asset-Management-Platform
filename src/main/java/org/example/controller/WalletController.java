package org.example.controller;

import org.example.model.Wallet;
import org.example.service.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @GetMapping
    public List<Wallet> getWallets() {
        return walletService.getAllWallets();
    }

    @PostMapping
    public Wallet createWallet(@RequestBody Wallet wallet) {
        return walletService.createWallet(
                wallet.getUserName(),
                wallet.getBalance()
        );
    }

    @PostMapping("/{id}/deposit")
    public Wallet deposit(@PathVariable Long id,
                          @RequestParam Double amount) {
        return walletService.deposit(id, amount);
    }

    @PostMapping("/{id}/withdraw")
    public Wallet withdraw(@PathVariable Long id,
                           @RequestParam Double amount) {
        return walletService.withdraw(id, amount);
    }
}
