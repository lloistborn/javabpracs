package com.faisal.javabpracs.Utilities.Blockchain;


import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Block {
    private int index;
    private Date timestamp;
    private String data;
    private String previousHashVal;
    private String currentHashVal;
    private int nonce;

    public Block(int index, Date timestamp, String data, String previousHash) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHashVal = previousHash;
        this.currentHashVal = this.calculateHash();
        this.nonce = 0;
    }

    public Block(int index, Date timestamp, String data) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHashVal = null;
        this.currentHashVal = this.calculateHash();
        this.nonce = 0;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setPreviousHashVal(String previousHashVal) {
        this.previousHashVal = previousHashVal;
    }

    public String getPreviousHashVal() {
        return previousHashVal;
    }

    public String getCurrentHashVal() {
        return currentHashVal;
    }

    public String calculateHash() {
        String dataToHash = Integer.toString(this.index) + this.previousHashVal + this.data + this.nonce;

        return Hashing.sha256()
                .hashString(dataToHash, StandardCharsets.UTF_8)
                .toString();
    }

    public void mineBlock(int difficulty) {
        String strDifficulty = "";
        for(int i = 0; i < difficulty; i++) {
            strDifficulty += "0";
        }

        String substrHashValue = this.currentHashVal.substring(0, difficulty);
        Boolean flag = substrHashValue.equals(strDifficulty);

        while (flag == false) {
            this.nonce++;
            this.currentHashVal = this.calculateHash();

            substrHashValue = this.currentHashVal.substring(0, difficulty);
            flag = substrHashValue.equals(strDifficulty);
        }

        System.out.println("block " + index + " mined");
        System.out.println(this.currentHashVal);
    }

    @Override
    public String toString() {
        return "Block{" +
                " index=" + index +
                ", timestamp=" + timestamp +
                ", data='" + data + '\'' +
                ", previousHashVal='" + previousHashVal + '\'' +
                ", currentHashVal='" + currentHashVal + '\'' +
                '}';
    }
}
