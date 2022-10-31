package models;

public class TransferModel {
    private String itemID;
    private String countryCode;
    private String fromWarehouse;
    private String toWarehouse;
    private String pickerId;
    private int integrationType;
    private int directionType;
    private int domainType;
    private String id;
    private int sendCount;

    public String getItemID() {
        return itemID;
    }

    public TransferModel setItemID(String itemID) {
        this.itemID = itemID;
        return this;
    }

    public int getSendCount() {
        return sendCount;
    }

    public TransferModel setSendCount(int sendCount) {
        this.sendCount = sendCount;
        return this;
    }


    public String getId() {
        return id;
    }

    public TransferModel setId(String id) {
        this.id = id;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public TransferModel setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getFromWarehouse() {
        return fromWarehouse;
    }

    public TransferModel setFromWarehouse(String fromWarehouse) {
        this.fromWarehouse = fromWarehouse;
        return this;
    }

    public String getToWarehouse() {
        return toWarehouse;
    }

    public TransferModel setToWarehouse(String toWarehouse) {
        this.toWarehouse = toWarehouse;
        return this;
    }

    public String getPickerId() {
        return pickerId;
    }

    public TransferModel setPickerId(String pickerId) {
        this.pickerId = pickerId;
        return this;
    }

    public int getIntegrationType() {
        return integrationType;
    }

    public TransferModel setIntegrationType(int integrationType) {
        this.integrationType = integrationType;
        return this;
    }

    public int getDirectionType() {
        return directionType;
    }

    public TransferModel setDirectionType(int directionType) {
        this.directionType = directionType;
        return this;
    }

    public int getDomainType() {
        return domainType;
    }

    public TransferModel setDomainType(int domainType) {
        this.domainType = domainType;
        return this;
    }
public static TransferModel transferModelFor10(){
    return new TransferModel().setCountryCode("TR")
            .setDirectionType(10)
            .setDomainType(3)
            .setFromWarehouse("5ab8a4536952590004c00053")
            .setIntegrationType(100)
            .setToWarehouse("5f2c20a6b5656f4224358c58").
            setPickerId("604f4fbe6eab1062452d2448")
            .setItemID("559830f7b1dc700c006a7188");
}

}
