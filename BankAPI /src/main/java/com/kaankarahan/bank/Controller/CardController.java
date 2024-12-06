package com.kaankarahan.bank.Controller;
import com.kaankarahan.bank.Business.Abstract.CardManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CardController{
    private final CardManager cardManager;

    @Autowired
    public CardController(CardManager cardManager) {
        this.cardManager = cardManager;
    }
    @GetMapping("getCardNumbers")
    public List<String> getCardNumbers(){
        return cardManager.getCardNumbers();
    }
}