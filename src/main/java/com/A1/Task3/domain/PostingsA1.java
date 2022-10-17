package com.A1.Task3.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class PostingsA1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String matDoc;
    private String item;
    private String docDate;
    private String pstngDate;
    private String materialDescription;
    private int quantity;
    private String bUn;
    private String amountLc;
    private String crcy;
    private String userName;

    private boolean authPosting;

    public void isAuthorizePosting(Set<String> list){
        authPosting = list.contains(userName);
    }

    public PostingsA1() {
    }

    public PostingsA1(String matDoc, String item, String docDate, String pstngDate, String materialDescription, int quantity, String bUn, String amountLc, String crcy, String userName, boolean authPosting) {
        this.matDoc = matDoc;
        this.item = item;
        this.docDate = docDate;
        this.pstngDate = pstngDate;
        this.materialDescription = materialDescription;
        this.quantity = quantity;
        this.bUn = bUn;
        this.amountLc = amountLc;
        this.crcy = crcy;
        this.userName = userName;
        this.authPosting = authPosting;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatDoc() {
        return matDoc;
    }

    public void setMatDoc(String matDoc) {
        this.matDoc = matDoc;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getPstngDate() {
        return pstngDate;
    }

    public void setPstngDate(String pstngDate) {
        this.pstngDate = pstngDate;
    }

    public String getMaterialDescription() {
        return materialDescription;
    }

    public void setMaterialDescription(String materialDescription) {
        this.materialDescription = materialDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getbUn() {
        return bUn;
    }

    public void setbUn(String bUn) {
        this.bUn = bUn;
    }

    public String getAmountLc() {
        return amountLc;
    }

    public void setAmountLc(String amountLc) {
        this.amountLc = amountLc;
    }

    public String getCrcy() {
        return crcy;
    }

    public void setCrcy(String crcy) {
        this.crcy = crcy;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAuthPosting() {
        return authPosting;
    }

    public void setAuthPosting(boolean authPosting) {
        this.authPosting = authPosting;
    }
}
