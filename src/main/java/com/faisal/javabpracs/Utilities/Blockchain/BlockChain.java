package com.faisal.javabpracs.Utilities.Blockchain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlockChain {
    private List chain;

    public BlockChain() {
        this.chain = new ArrayList();
        this.chain.add(createGenesisBlock());
    }

    public Block createGenesisBlock() {
        return new Block(0, new Date(), "Genesis Block", "0");
    }

    public Object getLatestBlock() {
        return this.chain.get(this.chain.size() - 1);
    }

    public void addBlock(Block newBlock) {
        String previousHashVal = ((Block) this.getLatestBlock()).getCurrentHashVal();

        newBlock.setPreviousHashVal(previousHashVal);

        this.chain.add(newBlock);
    }

    public List getChain() {
        return chain;
    }

    public void setChain(List chain) {
        this.chain = chain;
    }
}