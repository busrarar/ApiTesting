import io.restassured.response.Response;
import models.TransferModel;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CentralToWareHouseTests {
    TransferController transferController = new TransferController();
    TransferControllerData transferControllerData = new TransferControllerData();

    @Test
    public void shouldCreateTransfer1(){
        TransferModel transferModel = TransferModel.transferModelFor10();

        ServiceApiHelper.createAndApprove(transferModel);

        // int reciveCount =transferModel.getSendCount()-1;  depart yaparken eksik ürün yollarsam nasıl yazarım düşü
    }
}
