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

    public Block(int index, Date timestamp, String data, String previousHash) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHashVal = previousHash;
        this.currentHashVal = this.calculateHash();
    }

    public Block(int index, Date timestamp, String data) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHashVal = null;
        this.currentHashVal = this.calculateHash();
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
        String dataToHash = Integer.toString(this.index) + this.previousHashVal + this.data;

        return Hashing.sha256()
                .hashString(dataToHash, StandardCharsets.UTF_8)
                .toString();
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
