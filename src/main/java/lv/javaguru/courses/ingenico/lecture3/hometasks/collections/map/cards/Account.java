package lv.javaguru.courses.ingenico.lecture3.hometasks.collections.map.cards;

public class Account {

    private int id;
    private String contractNumber;

    public Account(int id, String contractNumber) {
        this.id = id;
        this.contractNumber = contractNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }
}
