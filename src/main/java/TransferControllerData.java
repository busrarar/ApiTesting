import models.TransferModel;
import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;

public class TransferControllerData {
    public JSONObject prepareTransferCreateData (TransferModel transferModel){
        JSONObject mainData = new JSONObject();
        JSONObject transfer = new JSONObject();
        JSONObject itemObject = new JSONObject();
        JSONArray itemsArray = new JSONArray();
        itemObject.put("item", transferModel.getItemID())
                .put("count", 1);
        itemsArray.put(itemObject);

        transfer.put("countryCode", transferModel.getCountryCode())
                .put("fromWarehouse",transferModel.getFromWarehouse())
                .put("toWarehouse", transferModel.getToWarehouse())
                .put("items" ,itemsArray)
                .put("integrationType", transferModel.getIntegrationType())
                .put("domainType",transferModel.getDomainType())
                .put("directionType", transferModel.getDirectionType());
        mainData.put("transfer", transfer)
                .put("pickerId", transferModel.getPickerId());

        return mainData;
    }

    public JSONObject prepareApproveTransferData(String pickerId){
        return new JSONObject().put("pickerId", pickerId);
    }
}
