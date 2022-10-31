import io.restassured.response.Response;
import org.json.JSONObject;

public class TransferController extends ApiMethods {

    public TransferController() {
        super("https://transfer-service.stockdev.getirapi.com/");
    }

    public Response postCreateTransfer(JSONObject jsonObject){
        return postRequest(jsonObject,"transfers");
    }

    public Response approveTransfer(JSONObject jsonObject, String transferId){
        return postRequest(jsonObject, "transfers/"+transferId+"/approve");
    }
}
