package com.faisal.javabpracs.Utilities.Blockchain;

import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class BlockChainTest {

    @Test
    public void addBlock() {
        BlockChain coin = new BlockChain();

        Date now = new Date();
        coin.addBlock(new Block(1, now, "Second Block"));
        coin.addBlock(new Block(2, now, "Third Block"));

        assertNotNull(coin);
    }

    @Test
    public void isChainValid() {
        BlockChain coin = new BlockChain();

        Date now1 = new Date();
        coin.addBlock(new Block(1, now1, "Second Block"));

        Date now2 = new Date();
        coin.addBlock(new Block(2, now2, "Third Block"));

        List allCoin = coin.getChain();

        String previousHashValue = ((Block) allCoin.get(1)).getCurrentHashVal();
        String currentHashValue = ((Block) allCoin.get(2)).getPreviousHashVal();

        assertEquals(previousHashValue, currentHashValue);
    }

}