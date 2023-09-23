/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author advai
 */
public class Insurance {
    
    private String CorporateID;
    private String Address;
    private Integer Premium;
    private Integer Deductable;
    private String TaxBenefits;

    public String getCorporateID() {
        return CorporateID;
    }

    public void setCorporateID(String CorporateID) {
        this.CorporateID = CorporateID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getPremium() {
        return Premium;
    }

    public void setPremium(Integer Premium) {
        this.Premium = Premium;
    }

    public Integer getDeductable() {
        return Deductable;
    }

    public void setDeductable(Integer Deductable) {
        this.Deductable = Deductable;
    }

    public String getTaxBenefits() {
        return TaxBenefits;
    }

    public void setTaxBenefits(String TaxBenefits) {
        this.TaxBenefits = TaxBenefits;
    }
    
    
    
    
}
