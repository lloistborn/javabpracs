package com.faisal.javabpracs.Utilities.Blockchain;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class BlockChainTest {

    @Test
    public void addBlock() {
        BlockChain coin = new BlockChain();

        Date now = new Date();
        coin.addBlock(new Block(1, now, "Second Block"));
        coin.addBlock(new Block(2, now, "Third Block"));

        System.out.println(coin.toString());

        assertNotNull(coin);
    }
}