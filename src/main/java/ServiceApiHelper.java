import io.restassured.response.Response;
import models.TransferModel;
import org.json.JSONObject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ServiceApiHelper {

    static TransferController transferController = new TransferController();
    static TransferControllerData transferControllerData = new TransferControllerData();

    public static void createTransfer(TransferModel transferModel){

        JSONObject mainData = transferControllerData.prepareTransferCreateData(transferModel);
        Response response = transferController.postCreateTransfer(mainData);
        assertThat("When user tries to create transfer status code should be 200", response.statusCode(),is(200));
        assertThat("When user tries to create transfer transfer status should be 100", response.getBody().path("status"),is(100));
        transferModel.setId(response.getBody().path("_id"));
    }

    public static void approveTransfer(TransferModel transferModel){

        JSONObject mainData = transferControllerData.prepareApproveTransferData(transferModel.getPickerId());
        Response response = transferController.approveTransfer(mainData, transferModel.getId());
        assertThat("When user tries to create transfer status code should be 200", response.statusCode(),is(200));
        assertThat("When user tries to create transfer transfer status should be 100", response.getBody().path("status"),is(200));
    }

    public static void createAndApprove(TransferModel transferModel){
        createTransfer(transferModel);
        approveTransfer(transferModel);
    }
}
