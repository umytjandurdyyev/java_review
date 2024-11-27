package com.cydeo.oopreview.posclient;

import com.cydeo.oopreview.model.pos.PosClientRequest;
import com.cydeo.oopreview.model.pos.PosClientResponse;

import java.util.UUID;

public abstract class AbstractPosClient {

    // generates order id and send to the banks. Same for all banks that's why in concrete method
    public UUID generateOrderId(){

        return UUID.randomUUID();
    }

    // we do not know implementation, each Bank will implement based on there requirements
    //calls any banks auth api
    public abstract PosClientResponse auth(PosClientRequest posClientRequest);

    //calls any banks auth3D api
    public abstract PosClientResponse auth3D(PosClientRequest posClientRequest);


}
