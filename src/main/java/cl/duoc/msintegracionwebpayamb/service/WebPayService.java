package cl.duoc.msintegracionwebpayamb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionwebpayamb.client.WebPayFeignClient;
import cl.duoc.msintegracionwebpayamb.model.WebPayInitTransactionDTO;

@Service
public class WebPayService {

    @Autowired
    WebPayFeignClient webPayFeignClient;

    public String createTransaction(String tbkApiKeyId,
                                    String tbkApiKeySecret,
                                    WebPayInitTransactionDTO webPayInitTransactionDTO){
        return webPayFeignClient.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);                            
    }
    
}
