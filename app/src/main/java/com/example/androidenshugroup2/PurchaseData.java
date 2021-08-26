package com.example.androidenshugroup2;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.threeten.bp.LocalDateTime;

@Entity(tableName = "purchase_data")
public class PurchaseData {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "item_name")
    private String itemName;

    @ColumnInfo(name = "purchase_price")
    private int purchasePrice;

    @ColumnInfo(name = "purchase_date_time")
    private LocalDateTime purchaseDateTime;

    // id = 0 にすれば自動でidが割り当てられる
    public PurchaseData(int id, String userName, String itemName, int purchasePrice, LocalDateTime purchaseDateTime) {
        this.userName = userName;
        this.itemName = itemName;
        this.purchasePrice = purchasePrice;
        this.purchaseDateTime = purchaseDateTime;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public LocalDateTime getPurchaseDateTime() {
        return purchaseDateTime;
    }
}