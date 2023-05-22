package HMS; 
public abstract  class Hospital  {
    public static double debit ,credit;
    private String bedNo;
    private String chemberNo;
  
    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getChemberNo() {
        return chemberNo;
    }

    public void setChemberNo(String chemberNo) {
        this.chemberNo = chemberNo;
    }
    
    
}
