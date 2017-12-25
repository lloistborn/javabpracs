package com.faisal.javabpracs.Utilities.Blockchain;

import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class BlockChainTest {
    @Test
    public void isChainValid() {
        BlockChain coin = new BlockChain();

        Date now1 = new Date();
        coin.addBlock(new Block(1, now1, "first Block"));

        Date now2 = new Date();
        coin.addBlock(new Block(2, now2, "second Block"));

        List allCoin = coin.getChain();

        String previousHashValue = ((Block) allCoin.get(1)).getCurrentHashVal();
        String currentHashValue = ((Block) allCoin.get(2)).getPreviousHashVal();

        assertEquals(previousHashValue, currentHashValue);

        // alter data of block 1, then calculate new hash value
        ((Block) allCoin.get(1)).setData("first block modified");
        Block alteredBlock = (Block) allCoin.get(1);
        String newHashValue = alteredBlock.calculateHash();

        assertNotSame(newHashValue, currentHashValue);
    }
}